package com.teacherblitz.controller;

import com.teacherblitz.service.ITUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MybatisPlus控制器
 *
 * @author: <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since: 2020/12/4
 */
@RestController
@RequestMapping("/mybatis/plus")
public class MybatisPlusController {

    private final ITUserService iTUserService;

    public MybatisPlusController(ITUserService iTUserService) {
        this.iTUserService = iTUserService;
    }

    @RequestMapping("/")
    public String index() {
        return iTUserService.index();
    }
}
