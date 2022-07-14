package com.misaka.mapper;

import com.misaka.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    List<Emp> getAllEmp();

    Emp getEmpAndDeptById(@Param("eid") Integer eid);
}
