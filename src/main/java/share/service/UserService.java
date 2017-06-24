package share.service;

import share.entity.User;

/**
 * 用户相关功能接口
 * Created by Administrator on 2017/6/24.
 */
public interface UserService {
    /**
     * 新建一个用户
     *
     * @param user
     * @return
     */
    int userInsert(User user);

    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     */
    User userQueryByUsername();
}
