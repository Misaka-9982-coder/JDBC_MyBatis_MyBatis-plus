package com.misaka.mapper;

import com.misaka.pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {

    List<Emp> getEmpByConditionIf(Emp emp);
}
