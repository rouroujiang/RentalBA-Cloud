package com.hpe.microservice.clients.client;

import com.hpe.microservice.clients.hystrix.PointToPointHystrix;
import com.hpe.microservice.model.constant.AppServiceInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 点到点服务client
 * @date 2018/12/18 17:03
 */
@FeignClient(value = AppServiceInfo.SERVICE_NAME_INTELLIGENCE, fallback = PointToPointHystrix.class) //, fallback = PointToPointHystrix.class
public interface PointToPointClient {

    String POINTTOPOINT_API = AppServiceInfo.SERVICE_API_INTELLIGENCE + "/pointToPoint";

    @RequestMapping(value = POINTTOPOINT_API + "/dispatch", method = RequestMethod.GET)
    String dispatch(@RequestParam(value = "decs", required = true) String decs);

    @RequestMapping(value = POINTTOPOINT_API + "/queryStore", method = RequestMethod.POST)
    String queryStore(@RequestParam(value = "decs", required = true) String decs);

}
