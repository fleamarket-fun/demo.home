package fun.fleamarket.controller;

import fun.fleamarket.common.controller.BaseController;
import fun.fleamarket.common.domain.AjaxResult;
import fun.fleamarket.entity.Fragment;
import fun.fleamarket.service.IFragmentService;
import fun.fleamarket.vo.FragmentVO;
import fun.fleamarket.vo.JobVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  片段内容信息接口
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Api(value="FragmentController",tags={"片段内容信息接口"})
@RestController
@RequestMapping("/fragment")
public class FragmentController extends BaseController {

    @Autowired
    IFragmentService fragmentService;

    @ApiOperation(value = "工作内容信息查询")
    @PostMapping(value = "/listall")
    public AjaxResult listall(){
        List<FragmentVO> fragmentVOS = fragmentService.listall();
        return success(fragmentVOS);
    }


}
