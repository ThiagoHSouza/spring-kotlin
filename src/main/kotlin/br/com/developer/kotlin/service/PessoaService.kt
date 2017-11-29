package br.com.developer.kotlin.service

import br.com.developer.kotlin.repository.PessoaRepository
import org.springframework.stereotype.Service
import br.com.developer.kotlin.model.Pessoa

@Service
class PessoaService (private val repository : PessoaRepository){
	
	fun findByName(name : String) = repository.findByName(name)
	fun insert(p: Pessoa) = repository.insert(p)
	fun save(p: Pessoa) = repository.save(p)
	fun findOne(id: String) = repository.findOne(id)
	fun delete(id: String) = repository.delete(id)
	fun findAll() = repository.findAll()
	
}