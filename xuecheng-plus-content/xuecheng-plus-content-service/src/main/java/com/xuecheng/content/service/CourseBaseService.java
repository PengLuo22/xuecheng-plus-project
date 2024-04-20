package com.xuecheng.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuecheng.content.model.po.CourseBase;

import java.util.List;

/**
 * <p>
 * 课程基本信息 服务类
 * </p>
 *
 * @author jack
 * @since 2024-04-20
 */
public interface CourseBaseService {


    List<CourseBase> list();
}
