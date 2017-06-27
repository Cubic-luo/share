package share.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import share.entity.Label1;

import java.util.List;

/**
 * 通过
 * Created by Administrator on 2017/6/27.
 */
public class Label1DaoTest extends BaseTest {
    @Autowired
    private Label1Dao l1d;

    @Test
    public void label1Insert() throws Exception {
        String label1 = "教育";
        l1d.label1Insert(label1);

    }

    @Test
    public void label1QueryAll() throws Exception {
        List<Label1> label1List = l1d.label1QueryAll();
        for (Label1 l : label1List) {
            System.out.println(l);
        }
    }

    @Test
    public void label1QueryById() throws Exception {
        Label1 l = l1d.label1QueryById(1L);
        System.out.println(l);
    }

}