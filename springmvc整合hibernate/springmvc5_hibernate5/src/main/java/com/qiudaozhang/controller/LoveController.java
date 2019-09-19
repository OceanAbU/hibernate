package com.qiudaozhang.controller;

import com.qiudaozhang.dto.ResponseCode;
import com.qiudaozhang.model.Love;
import com.qiudaozhang.service.LoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 深圳邱道长
 * @since 2019/9/19
 */
@Controller
@RequestMapping("love")
public class LoveController {

    @Autowired
    private LoveService loveService;

    @PostMapping("add")
    public String add(Love love){
        loveService.add(love);
        return "redirect:/";
    }


    @GetMapping("list")
    public String list(Model model){
        List<Love> loves  = loveService.findAll();
        model.addAttribute("loves",loves);
        return "love/list";
    }
    @GetMapping("to/add")
    public String toAdd(){

        return "love/add";
    }

    @GetMapping("del")
    public String del(@RequestParam("id") Long id){

        loveService.del(id);
        return "redirect:/";
    }

    @GetMapping("dogs")
    public String dogs(@RequestParam("id") Long id , Model model){
        Love love = loveService.findById(id);
        model.addAttribute("love",love);
        return "love/dogs";
    }
}
