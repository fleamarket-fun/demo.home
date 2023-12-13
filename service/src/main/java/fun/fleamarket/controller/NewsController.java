package fun.fleamarket.controller;

import fun.fleamarket.common.controller.BaseController;
import fun.fleamarket.common.domain.AjaxResult;
import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.service.IJobService;
import fun.fleamarket.service.INewsService;
import fun.fleamarket.vo.JobVO;
import fun.fleamarket.vo.NewsVO;
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
 *  新闻信息接口
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Api(value="NewsController",tags={"新闻信息接口"})
@RestController
@RequestMapping("/news")
public class NewsController extends BaseController {


    @Autowired
    INewsService newsService;

    @ApiOperation(value = "新闻信息查询")
    @PostMapping(value = "/listall")
    public AjaxResult listall(){
        List<NewsVO> caseVOList = newsService.listall();
        return success(caseVOList);
    }

    @ApiOperation(value = "新闻信息分页查询")
    @PostMapping(value = "/listpage")
    public AjaxResult listpage(@RequestBody PageDTO pageDTO){
        List<NewsVO> caseVOList = newsService.listpage(pageDTO);
        return success(caseVOList);
    }

}
