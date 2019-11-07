package br.com.jonata.Iot.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonata.Iot.model.Device;



public interface DeviceRepository extends JpaRepository<Device, Long>{

	Page<Device> findByNome(String nome, Pageable paginacao);
	
}
