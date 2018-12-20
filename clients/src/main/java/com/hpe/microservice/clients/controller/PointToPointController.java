package com.hpe.microservice.clients.controller;

import com.hpe.microservice.clients.api.PointToPointApi;
import com.hpe.microservice.clients.client.PointToPointClient;
import com.hpe.microservice.model.vo.PointToPointDispatchVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author song xiaolong
 * @date 2018/12/19 14:39
 */
@Validated
@RestController
@RequestMapping("/api/cloud/client/pointToPoint")
public class PointToPointController implements PointToPointApi {

    private Logger logger = LoggerFactory.getLogger(PointToPointController.class);

    @Autowired
    PointToPointClient pointToPointClient;

    @Override
    @RequestMapping(value = "/dispatch", method = RequestMethod.POST)
    public String dispatch(@RequestBody @Valid PointToPointDispatchVo pointToPointDispatchVo) {
        logger.info("一键智能调度api");
        return pointToPointClient.dispatch(pointToPointDispatchVo);
    }

}
