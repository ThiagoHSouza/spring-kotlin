package br.com.developer.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
open class SpringKotlinApplication {
	
    companion object {
		
        @JvmStatic
		fun main(args: Array<String>) {
            SpringApplication.run(SpringKotlinApplication::class.java, *args)
        }
		
    }
}