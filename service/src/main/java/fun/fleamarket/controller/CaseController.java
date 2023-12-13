package fun.fleamarket.controller;

import fun.fleamarket.common.controller.BaseController;
import fun.fleamarket.common.domain.AjaxResult;
import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.service.ICaseService;
import fun.fleamarket.vo.CaseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  案例展示信息接口
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Api(value="CaseController",tags={"案例展示信息接口"})
@RestController
@RequestMapping("/case")
public class CaseController extends BaseController {

    @Autowired
    ICaseService caseService;

    @ApiOperation(value = "案例信息查询")
    @PostMapping(value = "/listall")
    public AjaxResult listall(){
        List<CaseVO> caseVOList = caseService.listall();
        return success(caseVOList);
    }

    @ApiOperation(value = "案例信息分页查询")
    @PostMapping(value = "/listpage")
    public AjaxResult listpage(@RequestBody PageDTO pageDTO){
        List<CaseVO> caseVOList = caseService.listpage(pageDTO);
        return success(caseVOList);
    }

}
