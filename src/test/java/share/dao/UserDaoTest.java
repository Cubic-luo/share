package share.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import share.entity.User;

import java.util.List;

/**
 * 测试结果：通过
 * Created by Administrator on 2017/6/23.
 */
public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao ud;

    @Test
    public void userInsert() throws Exception {
        User user = new User();
        user.setUsername("测试1号");
        ud.userInsert(user);
    }

    @Test
    public void userDelete() throws Exception {
        String username = "测试1号";
        ud.userDelete(username);
    }


    @Test
    public void userQueryAll() throws Exception {
        List<User> userList = ud.userQueryAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}