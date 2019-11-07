package br.com.jonata.Iot.controller.form;

import br.com.jonata.Iot.model.Device;
import br.com.jonata.Iot.repository.DeviceRepository;

public class AtualizacaoDeviceForm {

	String dados;
	
	public void setDados(String dados) {
		this.dados = dados;
	}
	
	
	public Device atualizar(Long id, DeviceRepository deviceRepository) {
		Device device = deviceRepository.getOne(id);

	//	device.setDados(this.dados);

		return device;
	}
}
