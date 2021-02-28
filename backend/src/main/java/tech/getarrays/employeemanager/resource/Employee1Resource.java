package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.Employee1;
import tech.getarrays.employeemanager.service.Employee1Service;

import java.util.List;

@RestController
@RequestMapping("/employee1")
public class Employee1Resource {
    private final Employee1Service employee1Service;

    public Employee1Resource(Employee1Service employee1Service) {
        this.employee1Service = employee1Service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee1>> getAllEmployees1 () {
        List<Employee1> employees1 = employee1Service.findAllEmployees1();
        return new ResponseEntity<>(employees1, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee1> getEmployee1ById (@PathVariable("id") Long id) {
        Employee1 employee1 = employee1Service.findEmployee1ById(id);
        return new ResponseEntity<>(employee1, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee1> addEmployee1(@RequestBody Employee1 employee1) {
        Employee1 newEmployee1 = employee1Service.addEmployee1(employee1);
        return new ResponseEntity<>(newEmployee1, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee1> updateEmployee1(@RequestBody Employee1 employee1) {
        Employee1 updateEmployee1 = employee1Service.updateEmployee1(employee1);
        return new ResponseEntity<>(updateEmployee1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee1(@PathVariable("id") Long id) {
        employee1Service.deleteEmployee1(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
