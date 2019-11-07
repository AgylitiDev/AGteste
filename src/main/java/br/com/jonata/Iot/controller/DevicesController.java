package br.com.jonata.Iot.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.jonata.Iot.controller.dto.DeviceDto;
import br.com.jonata.Iot.controller.form.AtualizacaoDeviceForm;
import br.com.jonata.Iot.controller.form.DeviceForm;
import br.com.jonata.Iot.model.Device;
import br.com.jonata.Iot.repository.DeviceRepository;


@RestController
@RequestMapping("/device")
public class DevicesController {

	@Autowired
	private DeviceRepository deviceRepository;

	@GetMapping
	public Page<DeviceDto> lista(@RequestParam(required = false) String nome,
			@PageableDefault(sort = "id", direction = Direction.ASC, page = 0, size = 10) Pageable paginacao) {

		if (nome == null) {
			Page<Device> listaDispositivos = deviceRepository.findAll(paginacao);
			return DeviceDto.converter(listaDispositivos);
		} else {
			// StatusTarefa statusTarefa =
			// StatusTarefa.valueOf(status.toUpperCase());
			Page<Device> listaDispositivos = deviceRepository.findByNome(nome, paginacao);
			return DeviceDto.converter(listaDispositivos);
		}
	}

	@PostMapping
	@Transactional
	public ResponseEntity<DeviceDto> cadastrar(@RequestBody @Valid DeviceForm form, UriComponentsBuilder uriBuilder) {
		Device device = form.converter();
		deviceRepository.save(device);
		//System.out.println(device.getDataL());
		URI uri = uriBuilder.path("/device/{id}").buildAndExpand(device.getId()).toUri();
		return ResponseEntity.created(uri).body(new DeviceDto(device));
	}

	@PutMapping("/{id}")
	@Transactional
	// @CacheEvict(value = "listaDeTarefas", allEntries = true)
	public ResponseEntity<DeviceDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoDeviceForm form) {
		Optional<Device> optional = deviceRepository.findById(id);

		if (optional.isPresent()) {
			Device tarefa = form.atualizar(id, deviceRepository);
			return ResponseEntity.ok(new DeviceDto(tarefa));
		}

		return ResponseEntity.notFound().build();

	}
}
