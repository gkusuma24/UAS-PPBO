package com.bismillah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bismillah.model.Siswa;
import com.bismillah.services.SiswaService;

@Controller

public class SiswaController {
	
	private SiswaService siswaService;
	@Autowired
	public void setSiswaService(SiswaService siswaService) {
		this.siswaService = siswaService;
	}


	@RequestMapping("/siswa")
	public String DaftarSiswa(Model model) {
		model.addAttribute("siswa", siswaService.DaftarSiswa());
		return "index";
	}
	
	@RequestMapping(value = "/siswa/buat", method = RequestMethod.GET)
	public String tampilkanForm(Model model) {
		model.addAttribute("siswa", new Siswa());
		return "formSiswa";
	}
	
	@RequestMapping(value = "/siswa/buat", method = RequestMethod.POST)
	public String simpanDataSiswa(Model model, Siswa siswa) {
		model.addAttribute("siswa", siswaService.SaveOrUpdate(siswa));
		return "redirect:/siswa";
	}
	
	@RequestMapping(value = "/siswa/edit/{id}", method = RequestMethod.GET)
	public String editData(@PathVariable Integer id, Model model) {
		model.addAttribute("siswa", siswaService.getIdSiswa(id));
		return "formSIswa";
	}
	
	@RequestMapping(value = "/siswa/hapus/{id}")
	public String hapus(@PathVariable Integer id) {
		siswaService.hapus(id);
		return "redirect:/siswa";
	}
	
}
