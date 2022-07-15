package com.misaka.mapper;

import com.misaka.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {

    Emp getEmpById(@Param("eid") Integer eid);

    void insertEmp(Emp emp);
}
