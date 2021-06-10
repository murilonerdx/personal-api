package one.digitalinovation.personalapi.repository;

import one.digitalinovation.personalapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
