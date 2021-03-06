package com.farmacia.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.farmacia.farmacia.model.ProdutoModel;
import com.farmacia.farmacia.repository.ProdutoRepository;


@RestController
@RequestMapping("/Produto")
@CrossOrigin(origins = "* ", allowedHeaders = "*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository; // o ProdutoRepository virou o repository (renomiou)
	
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoModel> getByEntity(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
    @GetMapping("/preco/{preco}")
    public ResponseEntity<List<ProdutoModel>> getByNomeEntity(@PathVariable String nome){
    	return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
    	
    }
    @PostMapping
     public ResponseEntity<ProdutoModel> post (@RequestBody ProdutoModel nome){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(nome));
	}
    @PutMapping
    public ResponseEntity<ProdutoModel> put(@RequestBody ProdutoModel nome){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(nome));
	   
   }
    @DeleteMapping
    public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
