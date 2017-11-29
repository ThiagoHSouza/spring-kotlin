package br.com.developer.kotlin.controller

import br.com.developer.kotlin.model.Pessoa
import br.com.developer.kotlin.service.PessoaService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("pessoa")
class KotlinApi (private val service: PessoaService){
				
	@PostMapping
	fun create(@RequestBody p : Pessoa)
			= service.insert(p)
	
	@PutMapping
	fun update(@RequestBody p : Pessoa)
			= service.save(p)
	
	@GetMapping("{id}")
	fun get(@PathVariable("id") id : String)
			= service.findOne(id)
	
	@DeleteMapping("{id}")
	fun delete(@PathVariable("id") id : String)
			= service.delete(id)
	
	@GetMapping
	fun getAll()
			= service.findAll()
}