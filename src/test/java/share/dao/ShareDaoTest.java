package share.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import share.entity.Share;

import java.util.List;

/**
 * Created by Administrator on 2017/6/24.
 */
public class ShareDaoTest extends BaseTest {
    @Autowired
    private ShareDao sd;

    @Test
    public void shareInsert() throws Exception {
        Share share = new Share();
        share.setUsername("测试1号");
        sd.shareInsert(share);
    }

    @Test
    public void shareQueryAll() throws Exception {
        List<Share> shareList = sd.shareQueryAll();
        for (Share share : shareList) {
            System.out.println(share);
        }
    }

}