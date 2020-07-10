package com.bismillah.services;

import java.util.List;
import com.bismillah.model.Siswa;

public interface SiswaService {

	List<Siswa> DaftarSiswa();
	Siswa SaveOrUpdate(Siswa siswa);
	Siswa getIdSiswa(Integer id);
	void hapus (Integer id);
	
}
