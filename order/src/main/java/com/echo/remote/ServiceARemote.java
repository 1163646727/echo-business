package com.echo.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * interfaceName: ServiceARemote <BR>
 * description: <BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/7/13 16:53 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@FeignClient(name = "serverA")
public interface ServiceARemote {

    @GetMapping(value = "/serverA/remote")
    public String remote();
}
