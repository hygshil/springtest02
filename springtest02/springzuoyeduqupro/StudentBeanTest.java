package springzuoyeduqupro;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentBeanTest {
    @Test
    public void test01(){
        String xml = "springzuoyeduqupro/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        StudentBean studentBean = ac.getBean("studentBean", StudentBean.class);
        System.out.println("studentBean = " + studentBean);

    }
}
