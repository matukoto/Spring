package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

// DI の方法その 1 コンストラクタインジェクション
@RestController
@RequestMapping("greeter")
/* クラスの引数に Greeter 型の Greeter クラスを指定
   これで Greeter クラスを実装しているクラス
*/
class GreeterController(private val greeter: Greeter) {
    @GetMapping("/hello")
    fun hello(@RequestParam("name") name: String): HelloResponse {
        return HelloResponse("Hello $name")
    }

    @PostMapping("/hello")
    fun helloByPost(@RequestBody request: HelloRequest): HelloResponse {
        return HelloResponse("Hello ${request.name}")
    }
    /*
        interface Greeter クラスを実装した GreeterImpl クラス
        に実装されているメソッド（sayHello)を自動で生成してくれたんだね、ありがとう
     */
    @GetMapping("/hello/byservice/{name}")
    fun helloByService (@PathVariable("name")name: String): HelloResponse {
        val message = greeter.sayHello(name)
        return HelloResponse(message)
    }
   // フィールドインジェクション
   // クラスのフィールドとして書く
   // @Autowired
   // private lateinit var greeter: Greeter

}
