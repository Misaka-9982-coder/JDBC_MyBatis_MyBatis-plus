package com.misaka.mybatis;

import com.misaka.mapper.EmpMapper;
import com.misaka.pojo.Emp;
import com.misaka.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.io.Reader;
import java.util.List;

public class MBGTest {

    @Test
    public void testMBG() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

            // 查询所有员工
//            List<Emp> list = mapper.selectByExample(null);
//            list.forEach(emp -> System.out.println(emp));
//            EmpExample example = new EmpExample();
//            example.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThan(20);
//            example.or().andDidIsNull();
//            List<Emp> list = mapper.selectByExample(example);
//            list.forEach(emp -> System.out.println(emp));

            mapper.updateByPrimaryKey(new Emp(1, "张三", 20, "女", "张三@qq.com"));
            mapper.updateByPrimaryKeySelective(new Emp(1, "张三", 20, null, "张三@qq.com"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
