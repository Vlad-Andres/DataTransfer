package com.doxbit.dataTransfer;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.Resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;


@RestController
class RESTfulController {

    private final DBRepository repository;

    RESTfulController(DBRepository repository) {
        this.repository = repository;
    }

    // Aggregate root

    @GetMapping("/employees")
    List<DBDataEntity> all() {
        return repository.findAll();
    }




    @PostMapping("/employees")
    DBDataEntity newEmployee(@RequestBody DBDataEntity newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/employees/{id}")
    Resource<DBDataEntity> one(@PathVariable Long id) {

        DBDataEntity DBDataEntity_ = repository.findById(id)
                .orElseThrow(() -> new NotFoundException(id));

        return new Resource<>(DBDataEntity_,
                linkTo(methodOn(RESTfulController.class).one(id)).withSelfRel(),
                linkTo(methodOn(RESTfulController.class).all()).withRel("employees"));
    }

    // Single item
//
//    @GetMapping("/employees/{id}")
//    Employee one(@PathVariable Long id) {
//
//        return repository.findById(id)
//                .orElseThrow(() -> new EmployeeNotFoundException(id));
//    }
//
//    @PutMapping("/employees/{id}")
//    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
//
//        return repository.findById(id)
//                .map(employee -> {
//                    employee.setName(newEmployee.getName());
//                    employee.setRole(newEmployee.getRole());
//                    return repository.save(employee);
//                })
//                .orElseGet(() -> {
//                    newEmployee.setId(id);
//                    return repository.save(newEmployee);
//                });
//    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}