package com.xuecheng.content.controller;

import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 课程基本信息 前端控制器
 *
 * @author jack
 */
@Slf4j
@RestController
@RequestMapping("courseBase")
public class CourseBaseController {

    private final CourseBaseService courseBaseService;

    public CourseBaseController(CourseBaseService courseBaseService) {
        this.courseBaseService = courseBaseService;
    }

    @GetMapping("/getAll")
    public List<CourseBase> getAll() {
        return courseBaseService.list();
    }


}
