package com.misaka.mapper;

import com.misaka.pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {

    List<Emp> getEmpByConditionIfOne(Emp emp);

    List<Emp> getEmpByConditionIfTwo(Emp emp);

    List<Emp> getEmpByConditionIfThree(Emp emp);
}
