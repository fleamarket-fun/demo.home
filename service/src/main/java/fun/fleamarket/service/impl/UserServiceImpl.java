package fun.fleamarket.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.MD5;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import fun.fleamarket.common.redis.service.RedisService;
import fun.fleamarket.dto.UserLogin;
import fun.fleamarket.entity.User;
import fun.fleamarket.mapper.UserMapper;
import fun.fleamarket.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.fleamarket.vo.UserLoginResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.concurrent.TimeUnit;

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

    @Autowired
    UserMapper userMapper;

    @Autowired
    RedisService redisService;

    @Override
    public UserLoginResultVO login(UserLogin userLogin) {
        UserLoginResultVO loginResultVO = new UserLoginResultVO();
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name",userLogin.getUsername());
        User user = userMapper.selectOne(queryWrapper);
        if(user!=null && user.getUserPass().equals(SecureUtil.md5(userLogin.getUserpass()))){
            String token = IdUtil.randomUUID();
            loginResultVO.setToken(token);
            redisService.setCacheObject(token,user,30l, TimeUnit.MINUTES);
        }
        return loginResultVO;
    }
}
