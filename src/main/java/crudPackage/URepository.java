package crudPackage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URepository extends JpaRepository<employees, Integer> {

}
