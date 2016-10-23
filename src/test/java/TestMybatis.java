import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin-pc on 2016/10/12.
 */
public class TestMybatis {
    @Test
    public  void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml","spring.xml"});
        UserDao userDao=(UserDao) applicationContext.getBean("userDao");
        User user=new User();
        user.setId("q1");
        user.setName("test");
        userDao.insert(user);
    }
}
