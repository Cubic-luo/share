package share.dao;

import share.entity.Share;

import java.util.List;

/**
 * 分享数据与数据库接口
 * Created by Administrator on 2017/6/24.
 */
public interface ShareDao {
    /**
     * 新建一个分享
     *
     * @param share 分享实体
     * @return
     */
    int shareInsert(Share share);

    /**
     * 查询所有分享
     *
     * @return
     */
    List<Share> shareQueryAll();

    /**
     * 根据用户名查询分享
     *
     * @param username
     * @return
     */
    List<Share> shareQueryByUsername(String username);

    /**
     * 根据分享id查询
     *
     * @param shareId
     * @return
     */
    Share shareQueryById(Long shareId);
}
