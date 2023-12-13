package fun.fleamarket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import fun.fleamarket.entity.Case;
import fun.fleamarket.entity.Fragment;
import fun.fleamarket.mapper.FragmentMapper;
import fun.fleamarket.service.IFragmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.fleamarket.vo.CaseVO;
import fun.fleamarket.vo.FragmentVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Service
public class FragmentServiceImpl extends ServiceImpl<FragmentMapper, Fragment> implements IFragmentService {

    @Autowired
    FragmentMapper fragmentMapper;

    @Override
    public List<FragmentVO> listall() {
        QueryWrapper<Fragment> queryWrapper = new QueryWrapper<>();
        List<Fragment> cases = fragmentMapper.selectList(queryWrapper);
        List<FragmentVO> vos = new ArrayList<>();
        cases.forEach(item ->{
            FragmentVO vo = new FragmentVO();
            BeanUtils.copyProperties(item, vo);
            vos.add(vo);
        });
        return vos;
    }
}
