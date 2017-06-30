package share.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import share.entity.Label2;

import java.util.List;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Label2DaoTest extends BaseTest {
    @Autowired
    private Label2Dao ld;

    @Test
    public void labe21Insert() throws Exception {
        Label2 l2 = new Label2();
        l2.setLabel1Id(2L);
        l2.setLabel2("烧烤");
        ld.label2Insert(l2);
    }

    @Test
    public void label2QueryAll() throws Exception {
        List<Label2> list = ld.label2QueryAll();
        for (Label2 l : list) {
            System.out.println(l);
        }
    }

    @Test
    public void label2QueryById() throws Exception {

    }

}