package springzuoyejdbc;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    public void insert() {
        System.out.println("我是dao层，我负责数据的新增");
    }
    public void del() {
        System.out.println("我是dao层，我负责数据的删除");
    }
    public void update() {
        System.out.println("我是dao层，我负责数据的修改");
    }
    public void selectAll() {
        System.out.println("我是dao层，我负责数据的全查");
    }
}
