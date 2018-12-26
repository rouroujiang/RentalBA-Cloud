package com.hpe.microservice.clients.hystrix;

import com.hpe.microservice.clients.client.PointToPointClient;
import org.springframework.stereotype.Component;

/**
 * 点到点断路器
 * @date 2018/12/19 9:38
 */
@Component
public class PointToPointHystrix implements PointToPointClient {
    @Override
    public String dispatch(String decs) {
        return "调度失败";
    }

    @Override
    public String queryStore(String decs) {
        return "调度失败";
    }
}
