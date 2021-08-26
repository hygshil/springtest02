package springzuoyejdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;
    @Override
    public void insert() {
        studentDao.insert();
    }

    @Override
    public void del() {
        studentDao.del();
    }

    @Override
    public void update() {
        studentDao.update();
    }

    @Override
    public void selectAll() {
        studentDao.selectAll();
    }
}
