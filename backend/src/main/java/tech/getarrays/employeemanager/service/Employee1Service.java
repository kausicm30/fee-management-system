package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Employee1;
import tech.getarrays.employeemanager.repo.Employee1Repo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class Employee1Service {
    private final Employee1Repo employee1Repo;

    @Autowired
    public Employee1Service(Employee1Repo employee1Repo) {
        this.employee1Repo = employee1Repo;
    }

    public Employee1 addEmployee1(Employee1 employee1) {
        employee1.setEmployeeCode(UUID.randomUUID().toString());
        return employee1Repo.save(employee1);
    }

    public List<Employee1> findAllEmployees1() {
        return employee1Repo.findAll();
    }

    public Employee1 updateEmployee1(Employee1 employee1) {
        return employee1Repo.save(employee1);
    }

    public Employee1 findEmployee1ById(Long id) {
        return employee1Repo.findEmployee1ById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteEmployee1(Long id){
        employee1Repo.deleteEmployee1ById(id);
    }
}
