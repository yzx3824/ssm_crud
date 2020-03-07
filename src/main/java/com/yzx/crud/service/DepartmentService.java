package com.yzx.crud.service;

import com.yzx.crud.bean.Department;
import com.yzx.crud.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm_crud
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-03-07 16:36
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getDepts() {
        List<Department> list = departmentMapper.selectByExample(null);
        return list;
    }
}
