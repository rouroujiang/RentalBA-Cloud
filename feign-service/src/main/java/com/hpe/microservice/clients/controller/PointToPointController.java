package com.hpe.microservice.clients.controller;

import com.hpe.microservice.clients.client.PointToPointClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 * @date 2018/12/19 14:39
 */
@Validated
@RestController
@RequestMapping("/api/cloud/client/pointToPoint")
public class PointToPointController {

    private Logger logger = LoggerFactory.getLogger(PointToPointController.class);

    @Autowired
    PointToPointClient pointToPointClient;

    @GetMapping(value = "/dispatch")
    public String dispatch(@RequestParam(value = "decs", required = true) String decs) {
        logger.info("一键智能调度api");
        return pointToPointClient.dispatch(decs);
    }

}
