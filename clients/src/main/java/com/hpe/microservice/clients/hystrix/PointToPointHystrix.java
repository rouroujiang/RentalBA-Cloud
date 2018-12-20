package com.hpe.microservice.clients.hystrix;

import com.hpe.microservice.clients.client.PointToPointClient;
import com.hpe.microservice.model.vo.PointToPointDispatchVo;
import org.springframework.stereotype.Component;

/**
 * 点到点断路器
 * @author song xiaolong
 * @date 2018/12/19 9:38
 */
@Component
public class PointToPointHystrix implements PointToPointClient {
    @Override
    public String dispatch(PointToPointDispatchVo dispatchVo) {
        return "调度失败";
    }
}
