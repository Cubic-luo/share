package share.dao;

import share.entity.Label2;

import java.util.List;

/**二级标签与数据库的接口
 * Created by Administrator on 2017/6/27.
 */
public interface Label2Dao {
    /**
     * 新建一个二级标签
     * @param label2
     * @return
     */
    int label2Insert(Label2 label2);

    /**
     * 查询所有二级标签
     * @return
     */
    List<Label2> label2QueryAll();

    /**
     * 根据二级标签id查询
     * @return
     */
    Label2 label2QueryById(Long label2Id);
}
