package fun.fleamarket.controller;

import fun.fleamarket.common.controller.BaseController;
import fun.fleamarket.common.domain.AjaxResult;
import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.service.ICaseService;
import fun.fleamarket.service.IDownloadService;
import fun.fleamarket.vo.CaseVO;
import fun.fleamarket.vo.DownloadVO;
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
 *  下载内容信息接口
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Api(value="DownloadController",tags={"下载内容信息接口"})
@RestController
@RequestMapping("/download")
public class DownloadController extends BaseController {


    @Autowired
    IDownloadService downloadService;

    @ApiOperation(value = "下载内容信息查询")
    @PostMapping(value = "/listall")
    public AjaxResult listall(){
        List<DownloadVO> caseVOList = downloadService.listall();
        return success(caseVOList);
    }

    @ApiOperation(value = "下载内容信息分页查询")
    @PostMapping(value = "/listpage")
    public AjaxResult listpage(@RequestBody PageDTO pageDTO){
        List<DownloadVO> caseVOList = downloadService.listpage(pageDTO);
        return success(caseVOList);
    }

}
