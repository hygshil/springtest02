package springzuoyejdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test01(){
        String xml = "springzuoyejdbc/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        StudentController studentController = ac.getBean("studentController", StudentController.class);
        studentController.del();
        studentController.insert();
        studentController.selectAll();
        studentController.update();
    }
}
