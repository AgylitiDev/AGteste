package br.com.jonata.Iot.controller.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.domain.Page;

import br.com.jonata.Iot.model.Device;

public class DeviceDto {

	private Long idDevice;
	private String nome;
	private String latitude;
	private String longitude;
	private int chave;
	private int alavanca1;
	private int alavanca2;
	private String snr;
	private String rssi;
	private String dataRate;
	private Date data;
	private int seq;
	private String dataL;

	public DeviceDto(Device device) {

		this.idDevice = device.getIdDevice();
		this.nome = device.getNome();
		this.latitude = device.getLatitude();
		this.longitude = device.getLongitude();
		this.chave = device.getChave();
		this.alavanca1 = device.getAlavanca1();
		this.alavanca2 = device.getAlavanca2();
		this.snr = device.getSnr();
		this.rssi = device.getRssi();
		this.dataRate = device.getDataRate();
		this.data = device.getData();
		this.seq = device.getSeq();
		this.dataL = device.getDataL();
	}

	public Long getIdDevice() {
		return idDevice;
	}

	public String getNome() {
		return nome;
	}


	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public int getChave() {
		return chave;
	}

	public int getAlavanca1() {
		return alavanca1;
	}

	public int getAlavanca2() {
		return alavanca2;
	}

	public String getSnr() {
		return snr;
	}

	public String getRssi() {
		return rssi;
	}

	public String getDataRate() {
		return dataRate;
	}

	public Date getData() {
		return data;
	}

	public int getSeq() {
		return seq;
	}
	
	public String getDataL() {
		return dataL;
	}
	
	public static Page<DeviceDto> converter(Page<Device> device) {

		return device.map(DeviceDto::new);
	}

}
