package tum.seba.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tum.seba.persistence.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
