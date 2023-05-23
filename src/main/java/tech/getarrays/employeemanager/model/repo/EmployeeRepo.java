package tech.getarrays.employeemanager.model.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long>{

    Employee deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
    
}
