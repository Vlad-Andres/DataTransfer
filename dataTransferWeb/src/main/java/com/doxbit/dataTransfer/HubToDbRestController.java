package com.doxbit.dataTransfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HubToDbRestController {

	@Autowired
	MigrationHubReppository repository;
	
	
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

	@GetMapping("/Doc/{id}")
	private ResponseEntity<String> handleRequest(@PathVariable Long id){
		System.out.println("[MESSAGE FROM Controller]");

		//hubImplement.register(id);
		try {
			HubImplement hubImplement = new HubImplement();
			System.out.println("Doc Id sent to hub");
			System.out.println("[Controller] Id given and taken from/to Implement is "+hubImplement.register(id));

			return new ResponseEntity<>(
					//to return data after succesful made business logic (JSON) !TO USE @ResponseBody with object that
					//confirms that operation was successful
					"Succes, data sent to class",
					HttpStatus.OK
			);
		}catch (Exception e){
			return new ResponseEntity<>(
					"Error message : "+e.getMessage().toString(),
					HttpStatus.BAD_REQUEST
			);
		}
	}
	 

//	@GetMapping ("/Doc/{id}")
//	DocToMigrate replaceEmployee(@RequestBody DocToMigrate newDoc, @PathVariable Long id) {
//
//		return repository.findById(id)
//			.map(doc -> {
//				doc.setTitle(newDoc.getTitle());
//				doc.setAuthor(newDoc.getAuthor());
//				return repository.save(doc);
//			})
//			.orElseGet(() -> {
//				newDoc.setId(id);
//				return repository.save(newDoc);
//			});
//	}
}
