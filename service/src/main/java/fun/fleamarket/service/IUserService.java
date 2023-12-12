package fun.fleamarket.service;

import fun.fleamarket.dto.UserLogin;
import fun.fleamarket.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import fun.fleamarket.vo.UserLoginResultVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
public interface IUserService extends IService<User> {

    UserLoginResultVO login(UserLogin userLogin);
}
