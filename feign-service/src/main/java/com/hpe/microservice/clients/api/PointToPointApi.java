package com.hpe.microservice.clients.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @date 2018/12/19 14:38
 */
@Api(value = "智能调度 Client Restful API ", description = "智能调度 Client ", protocols = "application/json")
public interface PointToPointApi {

    @ApiOperation(value = "智能调度 Client Restful API ", notes = "一键智能完成车辆调度")
    @ApiImplicitParam(name = "decs", value = "decs", paramType = "String", dataType = "String", required = true)
    String dispatch(@RequestParam(value = "decs", required = true) String decs);

}
