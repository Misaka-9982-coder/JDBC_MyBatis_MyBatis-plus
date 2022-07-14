package com.misaka.mapper;

import com.misaka.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);
}
