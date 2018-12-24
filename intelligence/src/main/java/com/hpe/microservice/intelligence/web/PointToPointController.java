package com.hpe.microservice.intelligence.web;

import com.hpe.microservice.clients.api.PointToPointApi;
import com.hpe.microservice.model.vo.Staff;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 * 点到点服务实现
 * @date 2018/12/19 14:39
 */
@Validated
@RestController
@RequestMapping("/api/cloud/intelligence/pointToPoint")
public class PointToPointController {

    private Logger logger = LoggerFactory.getLogger(PointToPointController.class);

    @RequestMapping(value = "/dispatch", method = RequestMethod.GET)
    public String dispatch(@RequestParam(value = "decs", required = true) String decs) {
        logger.info("一键智能调度服务实现");
        return "一键调度成功！";
    }



    @RequestMapping(value = "/queryStore", method = RequestMethod.POST)
    public String queryStore(@RequestBody Staff staffValidate) {
        logger.info("一键智能调度服务实现");
        return "一键调度成功！";
    }

}
