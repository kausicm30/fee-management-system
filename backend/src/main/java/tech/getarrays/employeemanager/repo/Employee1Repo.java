package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee1;

import java.util.Optional;

public interface Employee1Repo extends JpaRepository<Employee1, Long> {
    void deleteEmployee1ById(Long id);

    Optional<Employee1> findEmployee1ById(Long id);
}
