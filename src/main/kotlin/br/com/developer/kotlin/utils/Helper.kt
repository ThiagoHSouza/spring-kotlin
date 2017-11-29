package br.com.developer.kotlin.utils

import com.sun.xml.internal.ws.api.Component
import org.springframework.stereotype.Service

@Service
class Helper {
		
	fun byType(arg : Any) : String =
			when(arg){
				is String -> "by String"
				is Int -> "by Int"
				is Long -> "by Long"
				is Double -> "by Double"
				else -> "Unknow"
			}
	
}