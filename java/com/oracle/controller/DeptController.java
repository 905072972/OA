package com.oracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/8/22.
 */


@Controller
@RequestMapping(value = "dept")
public class DeptController {
    @Autowired
    private IDeptDao deptDao;





}
