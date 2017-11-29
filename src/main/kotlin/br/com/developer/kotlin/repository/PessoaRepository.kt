package br.com.developer.kotlin.repository

import br.com.developer.kotlin.model.Pessoa
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.repository.MongoRepository

interface PessoaRepository : MongoRepository<Pessoa, String> {
	
	fun findByName(name : String) : Pessoa
	
}
