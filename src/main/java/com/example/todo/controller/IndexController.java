package com.example.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    // http:localhost:8080 -> "Hello world"
    // GET / -> "Hello, world"
    // @GetMappingアノテーションつきで定義したメソッドは、HttpMethodの中のGETリクエストを受ける
    @GetMapping
    // Indexメソッドの戻り値がそのままレスポンスボディとなる(使用頻度 少)
    @ResponseBody
    public String index() {
        return "Hello world";
    }
}
