package share.dao;

import share.entity.Label1;

import java.util.List;

/**一级标签与数据库的接口
 * Created by Administrator on 2017/6/27.
 */
public interface Label1Dao {
    /**
     * 新建一个一级标签
     * @param label1
     * @return
     */
    int label1Insert(String label1);

    /**
     * 查询所有一级标签
     * @return
     */
    List<Label1> label1QueryAll();

    /**
     * 根据一级标签id查询
     * @return
     */
    Label1 label1QueryById(Long label1Id);
}
