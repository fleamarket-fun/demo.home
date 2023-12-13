package fun.fleamarket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.entity.Download;
import fun.fleamarket.entity.Job;
import fun.fleamarket.mapper.DownloadMapper;
import fun.fleamarket.mapper.JobMapper;
import fun.fleamarket.service.IJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.fleamarket.vo.DownloadVO;
import fun.fleamarket.vo.JobVO;
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
public class JobServiceImpl extends ServiceImpl<JobMapper, Job> implements IJobService {

    @Autowired
    JobMapper jobMapper;

    @Override
    public List<JobVO> listall() {
        QueryWrapper<Job> queryWrapper = new QueryWrapper<>();
        List<Job> jobs = jobMapper.selectList(queryWrapper);
        List<JobVO> vos = new ArrayList<>();
        jobs.forEach(item ->{
            JobVO vo = new JobVO();
            BeanUtils.copyProperties(item, vo);
            vos.add(vo);
        });
        return vos;
    }

    @Override
    public List<JobVO> listpage(PageDTO pageDTO) {
        Page<Job> page = new Page<>(pageDTO.getCurrent(),pageDTO.getPagesize());
        QueryWrapper queryWrapper = new QueryWrapper();
        List<Job> jobs = jobMapper.selectList(page,queryWrapper);
        List<JobVO> vos = new ArrayList<>();
        jobs.forEach(item ->{
            JobVO vo = new JobVO();
            BeanUtils.copyProperties(item, vo);
            vos.add(vo);
        });
        return vos;
    }
}
