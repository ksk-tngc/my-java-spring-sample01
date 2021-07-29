package com.example.springmvc2.controller;

import com.example.springmvc2.model.Inquiry;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * トップページ用のコントローラです。
 */
@Controller
public class HomeController {

    /**
     * トップページに対するGETリクエストを処理します。
     * 
     * @param inquiry リクエストパラメータがバインドされたModel
     * @return 遷移後の画面（index.html）
     */
    @GetMapping("/")
    public String index(@ModelAttribute Inquiry inquiry) {
        return "index";
    }

    /**
     * トップページに対するPOSTリクエストを処理します。
     * 
     * @param inquiry リクエストパラメータがバインドされたModel
     * @param bindingResult バインド結果
     * @return 遷移後の画面
     */
    @PostMapping("/")
    public String confirm(@Validated @ModelAttribute Inquiry inquiry, BindingResult bindingResult) {
        // バリデーションエラー発生時はindex.htmlに戻る
        if (bindingResult.hasErrors()) {
            return "index";
        }
        return "confirm";
    }

}
