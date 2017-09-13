package employees.employeebackend;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by erin.benderoff on 12/09/17.
 */

@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}