package tum.seba.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tum.seba.persistence.entity.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {

}
