package br.com.jonata.Iot.controller.form;

import java.util.Date;

import br.com.jonata.Iot.model.Device;

public class DeviceForm {
	private Long id;
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
	private int seq;
	private String dataL;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getIdDevice() {
		return idDevice;
	}
	
	public void setIdDevice(Long idDevice) {
		this.idDevice = idDevice;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public int getAlavanca1() {
		return alavanca1;
	}
	public void setAlanvaca1(int alavanca1) {
		this.alavanca1 = alavanca1;
	}
	public int getAlavanca2() {
		return alavanca2;
	}
	public void setAlavanca2(int alavanca2) {
		this.alavanca2 = alavanca2;
	}
	public String getSnr() {
		return snr;
	}
	public void setSnr(String snr) {
		this.snr = snr;
	}
	public String getRssi() {
		return rssi;
	}
	public void setRssi(String rssi) {
		this.rssi = rssi;
	}
	public String getDataRate() {
		return dataRate;
	}
	public void setDataRate(String dataRate) {
		this.dataRate = dataRate;
	}
	
	public int getSeq() {
		return seq;
	}
	
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public String getDataL() {
		return dataL;
	}
	
	public void setDataL(String dataL) {
		this.dataL = dataL;
	}
	
	public Device converter() {
		
		return new Device(id, idDevice, nome, latitude, longitude, chave, alavanca1, alavanca2, snr, rssi, dataRate, seq, dataL);
	}
}
