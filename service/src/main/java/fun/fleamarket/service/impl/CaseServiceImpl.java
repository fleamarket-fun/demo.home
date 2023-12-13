package fun.fleamarket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.entity.Case;
import fun.fleamarket.mapper.CaseMapper;
import fun.fleamarket.service.ICaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.fleamarket.vo.CaseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
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
public class CaseServiceImpl extends ServiceImpl<CaseMapper, Case> implements ICaseService {

    @Autowired
    CaseMapper caseMapper;

    @Override
    public List<CaseVO> listall() {
        QueryWrapper<Case> queryWrapper = new QueryWrapper<>();
        List<Case> cases = caseMapper.selectList(queryWrapper);
        List<CaseVO> caseVOS = new ArrayList<>();
        cases.forEach(item ->{
            CaseVO vo = new CaseVO();
            BeanUtils.copyProperties(item, vo);
            caseVOS.add(vo);
        });
        return caseVOS;
    }

    @Override
    public List<CaseVO> listpage(PageDTO pageDTO) {
        Page<Case> page = new Page<>(pageDTO.getCurrent(),pageDTO.getPagesize());
        QueryWrapper queryWrapper = new QueryWrapper();
        List<Case> cases = caseMapper.selectList(page,queryWrapper);
        List<CaseVO> caseVOS = new ArrayList<>();
        cases.forEach(item ->{
            CaseVO vo = new CaseVO();
            BeanUtils.copyProperties(item, vo);
            caseVOS.add(vo);
        });
        return caseVOS;
    }

}
