package org.java.web;

import org.java.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/8.
 */
@Controller
public class InfoController {
    @Autowired
    public InfoService infoService;

    @RequestMapping("/select.do")
    public String selectAll(HttpServletRequest req){
        List<Map<String,Object>> ls = infoService.selectAll();
        req.setAttribute("ls",ls);
        return  "/show";
    }
}
