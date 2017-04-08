package spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HtmlController
 *
 * @author zhumeng
 * @since 2015/6/1
 */
@Controller
public class HtmlController {

    @RequestMapping("/greeting2")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="Stranger") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
