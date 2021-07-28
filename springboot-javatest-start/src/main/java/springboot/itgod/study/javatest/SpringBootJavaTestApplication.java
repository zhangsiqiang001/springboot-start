package springboot.itgod.study.javatest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot.itgod.study.javatest.Invocation.ItgodFactory;
import springboot.itgod.study.javatest.Invocation.UserDao;

@SpringBootApplication
public class SpringBootJavaTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJavaTestApplication.class, args);
        UserDao userDao = (UserDao) ItgodFactory.getMapper(UserDao.class);
        userDao.query();
    }
}
