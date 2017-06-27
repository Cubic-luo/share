package share.entity;

/**二级标签
 * Created by Administrator on 2017/6/27.
 */
public class Label2 {
    private Long id;
    private String label2;//二级标签名称
    private Long label1Id;//所属一级标签id
    private Label1 label1;//所属一级标签

    @Override
    public String toString() {
        return "Label2{" +
                "id=" + id +
                ", label2='" + label2 + '\'' +
                ", label1Id=" + label1Id +
                ", label1=" + label1 +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    public Long getLabel1Id() {
        return label1Id;
    }

    public void setLabel1Id(Long label1Id) {
        this.label1Id = label1Id;
    }

    public Label1 getLabel1() {
        return label1;
    }

    public void setLabel1(Label1 label1) {
        this.label1 = label1;
    }
}
