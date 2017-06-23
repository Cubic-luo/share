package share.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import share.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao ud;

    @Test
    public void userInsert() throws Exception {

    }

    @Test
    public void userDelete() throws Exception {

    }

    @Test
    public void userUpdate() throws Exception {

    }

    @Test
    public void userQueryAll() throws Exception {
        List<User> userList = ud.userQueryAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}