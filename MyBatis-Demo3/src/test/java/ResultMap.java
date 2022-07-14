import com.misaka.mapper.EmpMapper;
import com.misaka.pojo.Emp;
import com.misaka.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ResultMap {
    @Test
    public void testGetAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.getAllEmp();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
}
