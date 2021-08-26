package springzuoyejdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    public void insert() {
        studentService.insert();
    }
    public void del() {
        studentService.del();
    }
    public void update() {
       studentService.update();
    }
    public void selectAll() {
        studentService.selectAll();
    }
}
