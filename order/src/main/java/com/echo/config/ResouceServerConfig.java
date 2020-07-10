package com.echo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

/**
 * className: ResouceServerConfig <BR>
 * description: 资源服务 <BR>
 * remark: <BR>
 * author: ChenQi <BR>
 * createDate: 2020-07-05 14:40 <BR>
 */
@Configuration
// 标记此类为资源服务 ChenQi
@EnableResourceServer
public class ResouceServerConfig extends ResourceServerConfigurerAdapter {

    @Autowired
    private TokenStore tokenStore;

    /** 设置订单服务的资源id为"order" ChenQi*/
    public static final String RESOURCE_ID = "order";

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId(RESOURCE_ID)//资源 id
                /** 设置token校验，因为采用了JWT令牌格式，所以这里无需远程校验，本地校验即可 ChenQi*/
                .tokenStore(tokenStore)
                .stateless(true);
    }

    /**
     * methodName: configure <BR>
     * description: 安全配置 <BR>
     * remark: <BR>
     * param: http <BR>
     * return: void <BR>
     * author: ChenQi <BR>
     * createDate: 2020-07-05 14:42 <BR>
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                /** #oauth2.hasScope()   订单服务允许的授权范围 ChenQi*/
                .antMatchers("/**").access("#oauth2.hasScope('ORDER')")
                .and().csrf().disable()
                /** 设置session无效 ChenQi*/
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

}
