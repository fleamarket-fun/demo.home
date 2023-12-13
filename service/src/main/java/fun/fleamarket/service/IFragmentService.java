package fun.fleamarket.service;

import fun.fleamarket.entity.Fragment;
import com.baomidou.mybatisplus.extension.service.IService;
import fun.fleamarket.vo.FragmentVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
public interface IFragmentService extends IService<Fragment> {

    List<FragmentVO> listall();
}
