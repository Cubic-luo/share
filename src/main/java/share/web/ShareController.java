package share.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import share.entity.Share;
import share.service.Impl.ShareServiceImpl;

import java.util.List;

/**
 * Created by Administrator on 2017/6/24.
 */
@Controller
@RequestMapping("/")
public class ShareController {
    @Autowired
    private ShareServiceImpl si;

    /**
     * 首页
     *
     * @param model
     * @return
     */
    @RequestMapping()
    public String shareShowAll(Model model) {
        List<Share> shareList = si.shareQueryAll();
        model.addAttribute("shareList", shareList);
        return "index";
    }

    /**
     * 跳转到分享详情页
     *
     * @param shareId
     * @param model
     * @return
     */
    @RequestMapping(value = "share/{shareId}/showDetail")
    public String newsDetail(@PathVariable Long shareId, Model model) {
        Share share = si.shareQueryById(shareId);
        model.addAttribute("share", share);
        return "shareDetail";
    }

    /**
     * 跳转到发表分享页面
     *
     * @return
     */
    @RequestMapping("share/publish")
    public String sharePublish() {
        return "sharePublish";
    }

    /**
     * 发表分享
     *
     * @param share
     * @return
     */
    @RequestMapping("share/insert")
    public String shareInsert(Share share) {
        int result = si.shareInsert(share);
        return "redirect:/";

    }

    @RequestMapping("share/history")
    public String shareHistory(Model model) {
        List<Share> shareList = si.shareQueryByUsername();
        model.addAttribute("shareList", shareList);
        return "shareHistory";
    }

}
