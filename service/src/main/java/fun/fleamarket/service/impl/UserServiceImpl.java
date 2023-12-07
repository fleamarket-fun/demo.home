package fun.fleamarket.service.impl;

import fun.fleamarket.entity.User;
import fun.fleamarket.mapper.UserMapper;
import fun.fleamarket.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
