package com.example.demo

import org.springframework.stereotype.Component

interface Greeter {
    fun sayHello(name: String): String
}
/*
   Greeter クラス(interface)を実装
   かつ
   @Component アノテーションが付いたクラス
   がインジェクションされる
 */
@Component
class GreeterImpl: Greeter {
    override fun sayHello(name: String) = "Hello $name"
}
