package lav18.unidubna.jad_simplerest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String aName() {
        return "index.html";
    }

}
