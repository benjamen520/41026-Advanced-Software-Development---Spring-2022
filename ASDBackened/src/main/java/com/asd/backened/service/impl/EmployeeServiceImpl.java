package com.asd.backened.service.impl;


import com.asd.backened.entity.Employee;
import com.asd.backened.mapper.EmployeeMapper;
import com.asd.backened.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
