package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/hi")
@RestController
class HIController {
    @GetMapping
    fun getSample(): String {
        // 깃에 또 올린다 ~~~
        return "Hi!!!SANDY!!"
    }
}