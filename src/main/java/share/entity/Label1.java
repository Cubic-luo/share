package share.entity;

import java.util.List;

/**一级标签
 * Created by Administrator on 2017/6/27.
 */
public class Label1 {
    private Long id;
    private String label1;//一级标签名称
//    与二级标签是1对多的关系
    private List<Label2> label2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public List<Label2> getLabel2() {
        return label2;
    }

    public void setLabel2(List<Label2> label2) {
        this.label2 = label2;
    }

    @Override
    public String toString() {
        return "Label1{" +
                "id=" + id +
                ", label1='" + label1 + '\'' +
                ", label2=" + label2 +
                '}';
    }
}
