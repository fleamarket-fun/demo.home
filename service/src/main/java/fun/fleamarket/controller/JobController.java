package fun.fleamarket.controller;

import fun.fleamarket.common.controller.BaseController;
import fun.fleamarket.common.domain.AjaxResult;
import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.service.IDownloadService;
import fun.fleamarket.service.IJobService;
import fun.fleamarket.vo.DownloadVO;
import fun.fleamarket.vo.JobVO;
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
 *  前端控制器
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Api(value="JobController",tags={"工作内容信息接口"})
@RestController
@RequestMapping("/job")
public class JobController extends BaseController {

    @Autowired
    IJobService jobService;

    @ApiOperation(value = "工作内容信息查询")
    @PostMapping(value = "/listall")
    public AjaxResult listall(){
        List<JobVO> caseVOList = jobService.listall();
        return success(caseVOList);
    }

    @ApiOperation(value = "工作内容信息分页查询")
    @PostMapping(value = "/listpage")
    public AjaxResult listpage(@RequestBody PageDTO pageDTO){
        List<JobVO> caseVOList = jobService.listpage(pageDTO);
        return success(caseVOList);
    }

}
