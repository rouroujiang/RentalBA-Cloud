package com.hpe.microservice.intelligence.web;

import com.hpe.microservice.model.vo.PointToPointDispatchVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 点到点服务实现
 * @author song xiaolong
 * @date 2018/12/19 14:39
 */
@Validated
@RestController
@RequestMapping("/api/cloud/intelligence/pointToPoint")
public class PointToPointController {

    private Logger logger = LoggerFactory.getLogger(PointToPointController.class);

    @RequestMapping(value = "/dispatch", method = RequestMethod.GET)
    public String dispatch(@RequestBody @Valid PointToPointDispatchVo pointToPointDispatchVo) {
        logger.info("一键智能调度服务实现");
        return "一键调度成功！";
    }

}
