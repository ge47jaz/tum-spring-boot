package tum.seba.persistence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tum.seba.persistence.entity.Shape;
import tum.seba.persistence.repository.ShapeRepository;

@Service
public class ShapeService {

	@Autowired
	private ShapeRepository shapeRepository;
	
	// create & update
	public Shape saveShape(Shape shape) {
		return shapeRepository.save(shape);
	}
	
	// read (all)
	public List<Shape> findAllShapes() {
		return shapeRepository.findAll();
	}
	
	// read (one)
	public Shape findShapeById(int shapeId) {
		Optional<Shape> foundShape = shapeRepository.findById(shapeId);
		return foundShape.orElse(null);
	}
	
	// delete
	public void deleteShapeById(int shapeId) {
		try {
			shapeRepository.deleteById(shapeId);
		}
		catch (Exception e) {
			System.err.println("Unable to delete Shape with ID: " + shapeId);
		}
	}

}
