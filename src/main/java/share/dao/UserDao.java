package share.dao;

import share.entity.User;

import java.util.List;

/**
 * 用户数据与数据库交互接口
 * Created by Administrator on 2017/6/23.
 */
public interface UserDao {
    /**
     * 新建一个用户
     *
     * @param user 用户实体
     * @return
     */
    int userInsert(User user);

    /**
     * 删除一个用户
     *
     * @param username 用户名
     * @return
     */
    int userDelete(String username);


    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> userQueryAll();

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    User userQueryByUsername(String username);

}
