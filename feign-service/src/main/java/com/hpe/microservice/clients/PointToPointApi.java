package com.hpe.microservice.clients;

import com.hpe.microservice.model.vo.PointToPointDispatchVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @author song xiaolong
 * @date 2018/12/19 14:38
 */
@Api(value = "智能调度 Client Restful API ", description = "智能调度 Client ", protocols = "application/json")
public interface PointToPointApi {

    @ApiOperation(value = "智能调度 Client Restful API ", notes = "一键智能完成车辆调度")
    @ApiImplicitParam(name = "pointToPointDispatchVo", value = "PointToPointDispatchVo", paramType = "body", dataType = "PointToPointDispatchVo", required = true)
    String dispatch(@RequestBody @Valid PointToPointDispatchVo pointToPointDispatchVo);

}
