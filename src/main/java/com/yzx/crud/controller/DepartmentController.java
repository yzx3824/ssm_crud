package com.yzx.crud.controller;

import com.yzx.crud.bean.Department;
import com.yzx.crud.bean.Msg;
import com.yzx.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: ssm_crud
 * @description: 处理和部门有关的请求
 * @author: yanzhixian
 * @create: 2020-03-07 16:34
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts() {
        //查出的所有部门信息
        List<Department> list = departmentService.getDepts();
        return Msg.success().add("depts", list);
    }

}
