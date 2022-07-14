package com.misaka.mapper;

import com.misaka.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    Dept getDeptAndEmp(@Param("did") Integer did);

    Dept getDeptAndEmpByStep(@Param("did") Integer did);
}
