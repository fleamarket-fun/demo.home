package fun.fleamarket.service.impl;

import fun.fleamarket.entity.Job;
import fun.fleamarket.mapper.JobMapper;
import fun.fleamarket.service.IJobService;
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
public class JobServiceImpl extends ServiceImpl<JobMapper, Job> implements IJobService {

}
