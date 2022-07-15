package com.misaka.mapper;

import com.misaka.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {

    List<Emp> getEmpByConditionIfOne(Emp emp);

    List<Emp> getEmpByConditionIfTwo(Emp emp);

    List<Emp> getEmpByConditionIfThree(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    int deleteMoreByArray1(@Param("eids") Integer[] eids);

    int deleteMoreByArray2(@Param("eids") Integer[] eids);
}
