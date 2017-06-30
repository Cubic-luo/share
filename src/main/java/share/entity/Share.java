package share.entity;

import java.util.Date;

/**
 * 分享实体
 * Created by Administrator on 2017/6/24.
 */
public class Share {
    private Long id;
    private String username;//用户名
    private String title;//分享的标题
    private String content;//分享的内容
    private Date creatTime;//创建时间
    private String state;//分享目前的状态
    private Long tagId;//标签id

    //与用户关系为多对1
    private User user;
    //与标签是多对1
    private Label2 label;

    public Label2 getLabel() {
        return label;
    }

    public void setLabel(Label2 label) {
        this.label = label;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Share{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", creatTime=" + creatTime +
                ", state='" + state + '\'' +
                ", tagId=" + tagId +
                ", user=" + user +
                ", label=" + label +
                '}';
    }
}
