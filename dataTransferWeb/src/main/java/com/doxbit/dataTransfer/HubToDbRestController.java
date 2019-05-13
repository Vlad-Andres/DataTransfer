package com.doxbit.dataTransfer;

import java.util.List;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@Api(value = "onlinestore", description="description")
public class HubToDbRestController {
	@Autowired
	DocumentsRepository repository;

	@GetMapping("/Doc")
	public void helloWorld(
			@RequestParam(value = "Id", required = true, defaultValue = "null") String docId )
	{

		System.out.println("[MESSAGE FROM HubToDbRestController]");
		HubInstance hubInstance = new HubInstance();
		hubInstance.register(Long.parseLong(docId));
		System.out.println("Doc Id sent to hub");
	}
//	@GetMapping("/testDoc")
//	List<DocToMigrate> all(){
//			@EnableSwagger2
//	}
//	@GetMapping("/Doc/{id}")
//	DocToMigrate one(@PathVariable Long id) {
//
//		return repository.findById(id)
//			.orElseThrow(() -> new EmployeeNotFoundException(id));
//	}
	 

	@GetMapping ("/Doc/{id}")
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
