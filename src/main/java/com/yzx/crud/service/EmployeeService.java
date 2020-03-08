package com.yzx.crud.service;

import com.yzx.crud.bean.Employee;
import com.yzx.crud.bean.EmployeeExample;
import com.yzx.crud.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm_crud
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-03-01 19:10
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    /*
     * 查询所有员工
     */
    public List<Employee> getAll(){
        return employeeMapper.selectByExampleWithDept(null);
    }

    /*
     * 员工保存
     */
    public void saveEmp(Employee employee) {
        employeeMapper.insertSelective(employee);
    }

    /**
     * 检验用户名是否可用
     *
     * @param empName
     * @return  true：代表当前姓名可用   fasle：不可用
     */
    public boolean checkUser(String empName) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andEmpNameEqualTo(empName);
        long count = employeeMapper.countByExample(example);
        return count == 0;
    }
}
