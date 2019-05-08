package com.doxbit.dataTransfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HubToDbRestController {
	@Autowired
	DocumentsRepository repository;
	
	
//	@GetMapping("/testDoc")
//	List<DocToMigrate> all(){
//		
//	}
//	@GetMapping("/Doc/{id}")
//	DocToMigrate one(@PathVariable Long id) {
//
//		return repository.findById(id)
//			.orElseThrow(() -> new EmployeeNotFoundException(id));
//	}
	 

	@PutMapping("/Doc/{id}")
	DocToMigrate replaceEmployee(@RequestBody DocToMigrate newDoc, @PathVariable Long id) {

		return repository.findById(id)
			.map(doc -> {
				doc.setTitle(newDoc.getTitle());
				doc.setAuthor(newDoc.getAuthor());
				return repository.save(doc);
			})
			.orElseGet(() -> {
				newDoc.setId(id);
				return repository.save(newDoc);
			});
	}
}
