import com.guet.service.IUserInfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IUserInfoService as = (IUserInfoService) ac.getBean("IUserInfoService");
        as.findAll();

    }

}
