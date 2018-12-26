package com.hpe.microservice.clients.controller;

import com.hpe.microservice.clients.api.PointToPointApi;
import com.hpe.microservice.clients.client.PointToPointClient;
import com.hpe.microservice.model.vo.Staff;
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
public class PointToPointController implements PointToPointApi {

    private Logger logger = LoggerFactory.getLogger(PointToPointController.class);

    @Autowired
    PointToPointClient pointToPointClient;

    @Override
    @GetMapping(value = "/dispatch")
    public String dispatch(@RequestParam(value = "decs", required = true) String decs) {
        logger.info("一键智能调度get");
        return pointToPointClient.dispatch(decs);
    }

    @Override
    @RequestMapping(value = "/dispatchPost", method = RequestMethod.POST)
    public String dispatchPost(@RequestBody Staff staff){
        logger.info("一键智能调度post");
        return pointToPointClient.dispatchPost(staff);
    }

}
