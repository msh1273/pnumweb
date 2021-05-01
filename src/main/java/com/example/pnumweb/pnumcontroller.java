package com.example.pnumweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    public class pnumcontroller {
        @GetMapping("F1")
        public String myF1(@RequestParam(value = "input") int input, Model model) {

            for (int i = 2; i < input; i++) {
                while (input % i == 0) {
                    input = input / i;
                }
            }

            model.addAttribute("num", input);

            return "output";
    }
}