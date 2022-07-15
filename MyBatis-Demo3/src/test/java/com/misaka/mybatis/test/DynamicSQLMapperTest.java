package com.misaka.mybatis.test;

import com.misaka.mapper.DynamicSQLMapper;
import com.misaka.mapper.EmpMapper;
import com.misaka.pojo.Emp;
import com.misaka.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DynamicSQLMapperTest {

    @Test
    public void testGetEmpByConditionIf() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp();
        emp.setEmpName("张三");
        List<Emp> emps = mapper.getEmpByConditionIfOne(emp);
        for (Emp emp1 : emps) {
            System.out.println(emp1);
        }
    }

    @Test
    public void testGetEmpByConditionIfTwo() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp();
        emp.setEmpName("张三");
        List<Emp> emps = mapper.getEmpByConditionIfTwo(emp);
        for (Emp emp1 : emps) {
            System.out.println(emp1);
        }
    }

    @Test
    public void testGetEmpByConditionIfThree() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp();
//        emp.setEmpName("张三");
//        emp.setAge(23);
        List<Emp> emps = mapper.getEmpByConditionIfTwo(emp);
        for (Emp emp1 : emps) {
            System.out.println(emp1);
        }
    }
}
