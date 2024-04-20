package com.xuecheng.content.service.impl;

import com.xuecheng.content.mapper.CourseBaseMapper;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 课程基本信息 服务实现类
 * </p>
 *
 * @author jack
 */
@Slf4j
@Service
public class CourseBaseServiceImpl implements CourseBaseService {

    private final CourseBaseMapper courseBaseMapper;

    public CourseBaseServiceImpl(CourseBaseMapper courseBaseMapper) {
        this.courseBaseMapper = courseBaseMapper;
    }


    @Override
    public List<CourseBase> list() {
        return courseBaseMapper.selectList(null);
    }
}
