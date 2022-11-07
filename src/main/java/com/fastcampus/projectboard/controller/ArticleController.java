package com.fastcampus.projectboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/articels")
@Controller
public class ArticleController {

    @GetMapping
    public String articles(ModelMap modelMap){
        modelMap.addAttribute("articles", List.of());

        return "articles/index";
    }

    @GetMapping("/{articleId}")
    public String article(@PathVariable Long articleId, ModelMap modelMap){
        modelMap.addAttribute("article", "article"); //todo : 실제 데이터를 넣어주어야 한다!
        modelMap.addAttribute("articleComments", List.of());

        return "articles/detail";
    }
}
