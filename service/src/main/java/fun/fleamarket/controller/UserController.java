package fun.fleamarket.controller;

import fun.fleamarket.common.controller.BaseController;
import fun.fleamarket.common.domain.AjaxResult;
import fun.fleamarket.dto.UserLogin;
import fun.fleamarket.service.IUserService;
import fun.fleamarket.vo.UserLoginResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Api(value="UserController",tags={"用户信息接口"})
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    IUserService userService;

    @ApiOperation(value = "用户的登录接口")
    @PostMapping(value = "/login")
    public AjaxResult login(@RequestBody UserLogin userLogin){

        UserLoginResultVO loginResultVO = userService.login(userLogin);

        return success(loginResultVO);
    }

}
