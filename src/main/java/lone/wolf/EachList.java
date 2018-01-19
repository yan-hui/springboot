package lone.wolf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: hechunhui
 * @CreateTime: 2018/1/4 15:54
 * @ModifyBy:
 */
@Controller
@RequestMapping("/test")
public class EachList {
    @RequestMapping("/index")
    public String index(Model model) {
        List<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        model.addAttribute("list", list);
        return "index";
    }
}
