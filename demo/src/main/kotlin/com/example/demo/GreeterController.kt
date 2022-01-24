package com.example.demo

import org.springframework.web.bind.annotation.*

// 戻り値のオブジェクトを Json にシリアライズして返す
@RestController
@RequestMapping("greeter")
class GreeterController {
//    @GetMapping("/hello")
//    fun hello(@RequestParam("name") name: String): HelloResponse
//    { return HelloResponse("Hello $name") }

    @PostMapping("/hello")
    fun helloByPost(@RequestBody request: HelloRequest): HelloResponse {
        return HelloResponse("Hello ${request.name}")
    }
}
    fun helloByPost(@RequestBody request: HelloRequest): HelloResponse {
    return HelloResponse("Hello ${request.name}")
    }

