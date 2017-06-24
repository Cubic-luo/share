package share.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import share.dao.ShareDao;
import share.entity.Share;
import share.service.ShareService;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/24.
 */
@Service
public class ShareServiceImpl implements ShareService {
    @Autowired
    private ShareDao sd;

    @Override
    public int shareInsert(Share share) {
        Date creatTime = new Date();
        share.setCreatTime(creatTime);
        share.setState("正常");
        return sd.shareInsert(share);
    }

    @Override
    public List<Share> shareQueryAll() {
        List<Share> shareList = sd.shareQueryAll();//从数据库获取分享列表
        return shareList;
    }

    @Override
    public Share shareQueryById(Long shareId) {
        return sd.shareQueryById(shareId);
    }

    @Override
    public List<Share> shareQueryByUsername() {
        String username = getUserName();//获取当前登录用户名
        return sd.shareQueryByUsername(username);
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
