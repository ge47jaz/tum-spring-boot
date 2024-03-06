package tum.seba.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tum.seba.persistence.entity.Shape;

@Repository
public interface ShapeRepository extends JpaRepository<Shape, Integer> {

}
