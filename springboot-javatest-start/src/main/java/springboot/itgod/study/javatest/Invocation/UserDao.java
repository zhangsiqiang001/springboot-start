package springboot.itgod.study.javatest.Invocation;

import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from aaa")
    Object query();
}
