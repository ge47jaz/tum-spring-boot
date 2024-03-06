package tum.seba.persistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tum.seba.persistence.entity.Backpack;
import tum.seba.persistence.entity.Device;
import tum.seba.persistence.entity.Lecture;
import tum.seba.persistence.entity.Student;
import tum.seba.persistence.repository.BackpackRepository;
import tum.seba.persistence.repository.DeviceRepository;
import tum.seba.persistence.repository.LectureRepository;
import tum.seba.persistence.repository.StudentRepository;

@Service
public class AdminService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private BackpackRepository backpackRepository;

	@Autowired
	private DeviceRepository deviceRepository;

	@Autowired
	private LectureRepository lectureRepository;

	public Student saveStudent(Student newStudent) {
		return studentRepository.save(newStudent);
	}

	public Iterable<Student> findAllStudents() {
		return studentRepository.findAll();
	}

	public Student findStudentById(int studentId) {
		return studentRepository.findById(studentId).orElse(null);
	}

	public void deleteStudentById(int studentId) {
		try {
			studentRepository.deleteById(studentId);
		} catch (Exception e) {
			System.err.println("Unable to delete Student with ID: " + studentId);
		}
	}

	public Backpack saveBackpack(Backpack newBackpack) {
		return backpackRepository.save(newBackpack);
	}

	public Iterable<Backpack> findAllBackpacks() {
		return backpackRepository.findAll();
	}

	public Backpack findBackpackById(int backpackId) {
		return backpackRepository.findById(backpackId).orElse(null);
	}

	public void deleteBackpackById(int backpackId) {
		try {
			backpackRepository.deleteById(backpackId);
		} catch (Exception e) {
			System.err.println("Unable to delete Backpack with ID: " + backpackId);
		}
	}

	public Device saveDevice(Device newDevice) {
		return deviceRepository.save(newDevice);
	}

	public Iterable<Device> findAllDevices() {
		return deviceRepository.findAll();
	}

	public Device findDeviceById(int deviceId) {
		return deviceRepository.findById(deviceId).orElse(null);
	}

	public void deleteDeviceById(int deviceId) {
		try {
			deviceRepository.deleteById(deviceId);
		} catch (Exception e) {
			System.err.println("Unable to delete Device with ID: " + deviceId);
		}
	}

	public Lecture saveLecture(Lecture newLecture) {
		return lectureRepository.save(newLecture);
	}

	public Iterable<Lecture> findAllLectures() {
		return lectureRepository.findAll();
	}

	public Lecture findLectureById(int lectureId) {
		return lectureRepository.findById(lectureId).orElse(null);
	}

	public void deleteLectureById(int lectureId) {
		try {
			lectureRepository.deleteById(lectureId);
		} catch (Exception e) {
			System.err.println("Unable to delete Lecture with ID: " + lectureId);
		}
	}

}
