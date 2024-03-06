package tum.seba.persistence.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Backpack {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String color;

	@OneToOne(mappedBy = "backpack", cascade = CascadeType.ALL)
	private Student owner;

	public Backpack() {}

	public Backpack(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Student getOwner() {
		return owner;
	}

	public void setOwner(Student owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Backpack [id=" + id + ", color=" + color + "]";
	}

}
