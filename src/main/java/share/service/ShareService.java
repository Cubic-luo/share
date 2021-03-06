package share.service;

import share.entity.Label1;
import share.entity.Share;

import java.util.List;

/**
 * 分享相关功能接口
 * Created by Administrator on 2017/6/24.
 */
public interface ShareService {
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
     * 根据id查询分享
     *
     * @param shareId
     * @return
     */
    Share shareQueryById(Long shareId);

    /**
     * 根据用户名查询分享
     *
     * @param
     * @return
     */
    List<Share> shareQueryByUsername();

    /**
     * 查询所有一级标签及附带二级标签
     *
     * @return
     */
    List<Label1> labelQueryAll();
}
