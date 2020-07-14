# echo-business

# 介绍

echo-business是微服务项目，公共代码或页面，统一管理在businessCommon中；order项目中集成Spring Cloud Security Oauth2认证服务，可供参考。

# 一. order服务
## 集成Spring Cloud Security Oauth2认证服务   
Oauth的配置比较复杂，概况有下面这些范围：  
1. 资源服务  
    `com.echo.config`；  设置order服务的资源id。  
2. 安全配置  
    `com.echo.config.WebSecurityConfig`；需要集成`WebSecurityConfigurerAdapter`，重写configure方法，设置安全拦截机制，就是设置哪些资源需要认真，哪些资源可以放行。  
3. 令牌解析
    `com.echo.filter.TokenAuthenticationFilter`需要继承`OncePerRequestFilter`，其实是一个filter拦截器，拦截请求中的token，校验token是否正确，并将解析后的信息填充到上写文中。  

集成nacos
添加依赖  
>         <!--alibaba nacos依赖 -->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
配置nacos地址  
    spring.cloud.nacos.discovery.server-addr=127.0.0.1:8848

## 调用微服务资源
添加依赖  
>         <!--feign 依赖-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>

创建Feign客服端
>import org.springframework.cloud.openfeign.FeignClient;
  import org.springframework.web.bind.annotation.GetMapping;
  @FeignClient(name = "serverA")
  public interface ServiceARemote {
    @GetMapping(value = "/serverA/remote")
    public String remote();
 }

调用  
>     @Autowired
    private ServiceARemote serviceARemote;  
    @GetMapping(value = "/remoteServiceA")  
    public String remoteServiceA(){
    	return serviceARemote.remote();
    }


# 二、serviceA服务
启动类添加Feign客户端  
> @EnableDiscoveryClient
@EnableFeignClients



