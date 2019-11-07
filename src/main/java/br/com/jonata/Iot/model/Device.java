package br.com.jonata.Iot.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID")
	@SequenceGenerator(sequenceName = "device_seq", allocationSize = 1, name = "ID")
	@Column(name = "ID")
	private Long id;
	@Column(name = "IDDEVICE")
	private Long idDevice;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "LATITUDE")
	private String latitude;
	@Column(name = "LONGITUDE")
	private String longitude;
	@Column(name = "CHAVE")
	private int chave;
	@Column(name = "ALAVANCA1")
	private int alavanca1;
	@Column(name = "ALAVANCA2")
	private int alavanca2;
	@Column(name = "SNR")
	private String snr;
	@Column(name = "RSSI")
	private String rssi;
	@Column(name = "DATARATE")
	private String dataRate;
	@Column(name = "DATA", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new Date();
	@Column(name = "SEQ")
	private int seq;
	@Column(name = "DATAL", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	//@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="dd-MM-yy HH:mm:ss")//yyyy-MM-dd'T'HH:mm:ss yyyy-mm-dd hh:mm:ss
	private String dataL;
	
	public Device(){
		
	}

	

	public Device(Long id, Long idDevice, String nome, String latitude, String longitude, int chave, int alavanca1, int alavanca2, String snr, String rssi, String dataRate, int seq, String dataL) {
		this.id = id;
		this.idDevice = idDevice;
		this.nome = nome;
		this.latitude = latitude;
		this.longitude = longitude;
		this.chave = chave;
		this.alavanca1 = alavanca1;
		this.alavanca2 = alavanca2;
		this.snr = snr;
		this.rssi = rssi;
		this.dataRate = dataRate;
		this.seq = seq;
		this.dataL = dataL;
	
	}


	public Long getIdDevice() {
		return idDevice;
	}
	
	public void setIdDevice(Long idDevice) {
		this.idDevice = idDevice;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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



	public void setAlavanca1(int alavanca1) {
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



	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
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
	
}
