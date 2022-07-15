package com.misaka.mybatis.test;

import com.misaka.mapper.DynamicSQLMapper;
import com.misaka.mapper.EmpMapper;
import com.misaka.pojo.Emp;
import com.misaka.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp();
        emp.setAge(23);
        List<Emp> emps = mapper.getEmpByChoose(emp);
        for (Emp emp1 : emps) {
            System.out.println(emp1);
        }

        System.out.println("==============================");

        Emp emp2 = new Emp();
        emp2.setEmpName("张三");
        List<Emp> emps2 = mapper.getEmpByChoose(emp2);
        for (Emp emp1 : emps2) {
            System.out.println(emp1);
        }

        System.out.println("==============================");

        Emp emp3 = new Emp();
        List<Emp> emps3 = mapper.getEmpByChoose(emp3);
        for (Emp emp1 : emps3) {
            System.out.println(emp1);
        }
    }

    @Test
    public void testDeleteMoreByArray1() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int count = mapper.deleteMoreByArray1(new Integer[]{6, 7, 8});
        System.out.println(count);
    }

    @Test
    public void testDeleteMoreByArray2() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int count = mapper.deleteMoreByArray2(new Integer[]{6, 7, 8});
        System.out.println(count);
    }

    @Test
    public void testInsertMoreByList() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp0 = new Emp(null, "a0", 23, "男", "123@qq.com");
        Emp emp1 = new Emp(null, "a1", 23, "男", "123@qq.com");
        Emp emp2 = new Emp(null, "a2", 23, "男", "123@qq.com");
        List<Emp> emps = Arrays.asList(emp0, emp1, emp2);
        int res = mapper.insertMoreByList(emps);
        System.out.println(res);
    }
}
