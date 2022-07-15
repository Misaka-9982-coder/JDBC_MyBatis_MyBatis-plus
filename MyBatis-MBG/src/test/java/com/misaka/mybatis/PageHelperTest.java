package com.misaka.mybatis;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.misaka.mapper.EmpMapper;
import com.misaka.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class PageHelperTest {

    @Test
    public void testPageHelper() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

//            Page<Object> page = PageHelper.startPage(2, 4);

            PageHelper.startPage(2, 4);

            List<Emp> list = mapper.selectByExample(null);

            PageInfo<Emp> page = new PageInfo<>(list, 3);
//            list.forEach(emp -> System.out.println(emp));

            System.out.println(page);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
