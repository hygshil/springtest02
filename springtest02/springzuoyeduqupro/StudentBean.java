package springzuoyeduqupro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentBean {
    @Value("#{pro.name}")
    private String name;
    @Value("#{pro.age}")
    private int age;
    @Value("#{pro.grade}")
    private String grade;

    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
