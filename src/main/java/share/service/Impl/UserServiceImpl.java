package share.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Service;
import share.dao.UserDao;
import share.entity.User;
import share.service.UserService;

/**
 * Created by Administrator on 2017/6/24.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao ud;

    @Override
    public int userInsert(User user) {
        //		注册密码加密开始
        PasswordEncoder encoder = new StandardPasswordEncoder("hfahdf3");
        String rowPassword = user.getPassword();
        String password = encoder.encode(rowPassword);
        user.setPassword(password);
        //		注册密码加密结束
        user.setLogo("logo.png");//设置默认头像
        return ud.userInsert(user);
    }

    @Override
    public User userQueryByUsername() {
        String username=getUserName();//获取当前登录用户用户名
        return ud.userQueryByUsername(username);
    }
    /**
     * 获取认证用户信息详情
     *
     * @return
     */
    private UserDetails getUserDetail() {
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    /**
     * 获取当前认证用户姓名
     *
     * @return
     */
    private String getUserName() {
        String userName = getUserDetail().getUsername();
        return userName;

    }
}
