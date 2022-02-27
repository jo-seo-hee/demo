package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/hi")
@RestController
class HIController {
    @GetMapping
    fun getSample(): String {
        return "Hi!!!SANDY!!"
    }
}