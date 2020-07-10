package com.bismillah.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Siswa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_karyawan;
	private String nama_karyawan;
	private String nip;
	private String nik;
	private String domisili;
	private String no_hp;
	private String posisi;
	
	@Version
	@Column(name = "optVersion", columnDefinition = "integer DEFAULT 0")
	private Integer version;
	
	
	public Integer getId() {
		return id_karyawan;
	}
	public void setId(Integer id) {
		this.id_karyawan = id;
	}
	public String getNama() {
		return nama_karyawan;
	}
	public void setNama(String nama) {
		this.nama_karyawan = nama;
	}
	public String getNis() {
		return nip;
	}
	public void setNis(String nis) {
		this.nip = nis;
	}
	public String getKelas() {
		return nik;
	}
	public void setKelas(String kelas) {
		this.nik = kelas;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public String getDomisili() {
		return domisili;
	}
	public void setDomisili(String domisili) {
		this.domisili = domisili;
	}
	
	
}
