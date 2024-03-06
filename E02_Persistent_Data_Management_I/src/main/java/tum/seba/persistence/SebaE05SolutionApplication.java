package tum.seba.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import tum.seba.persistence.entity.Shape;
import tum.seba.persistence.service.ShapeService;

@SpringBootApplication
public class SebaE05SolutionApplication {

	@Autowired
	ShapeService shapeService;

	public static void main(String[] args) {
		SpringApplication.run(SebaE05SolutionApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void execCodeAfterStartup() {
		
		// create 3 entities
		System.out.println("\nCreate 3 entities");
		Shape redShape = new Shape("red");
		Shape blueShape = new Shape("blue");
		Shape greenShape = new Shape("green");
		System.out.println(shapeService.saveShape(redShape).toString());
		System.out.println(shapeService.saveShape(blueShape).toString());
		System.out.println(shapeService.saveShape(greenShape).toString());
		
		// read one entity
		System.out.println("\nRead an entity");
		System.out.println(shapeService.findShapeById(blueShape.getId()).toString());
		
		// read all entities
		System.out.println("\nRead all entities");
		System.out.println(shapeService.findAllShapes().toString());
		
		// update one entity
		System.out.println("\nUpdate an entity");
		System.out.println(shapeService.findShapeById(greenShape.getId()).toString());
		greenShape.setColor("yellow");		
		shapeService.saveShape(greenShape);
		System.out.println(shapeService.findShapeById(greenShape.getId()).toString());
		
		// delete one entity
		System.out.println("\nDelete an entity");
		System.out.println(shapeService.findAllShapes().toString());
		shapeService.deleteShapeById(greenShape.getId());
		System.out.println(shapeService.findAllShapes().toString());

	}

}
