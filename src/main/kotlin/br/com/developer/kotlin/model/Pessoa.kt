package br.com.developer.kotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
data class Pessoa (
	@Id val id : String? = null,
	val name : String? = null,
	val cpf : String? = null,
	val email : String? = null,
	val dataNascimento : LocalDate? = null
)