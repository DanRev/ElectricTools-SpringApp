package com.spring.electric.tools.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.electric.tools.models.entity.Orden;
import com.spring.electric.tools.models.services.OrdenServiceImpl;

@CrossOrigin(origins = { "http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ContabilidadRestController {

	@Autowired
	private OrdenServiceImpl ordenService;

	/**
	 * Obtener ordenes que tiene fechaEntrada/fechaSalida dentro del rango
	 * especificado
	 * 
	 * @return
	 */
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@GetMapping("/contabilidad/{fechaEntrada}/{fechaSalida}")
	public List<Orden> getContabilidad(@PathVariable String fechaEntrada, @PathVariable String fechaSalida) {
	
		return	ordenService.getContabilidad(convertToLocalDate(fechaEntrada),
		 convertToLocalDate(fechaSalida));
	
	}

	/**
	 * Realiza las operaciones necesarias de obtener los datos
	 * 
	 * @return
	 */
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@GetMapping("/arreglos/{fechaEntrada}/{fechaSalida}")
	public Integer getValorArreglosTotal(@PathVariable String fechaEntrada, @PathVariable String fechaSalida) {

		return ordenService.getValorArreglosTotal(convertToLocalDate(fechaEntrada),
				convertToLocalDate(fechaSalida));
	}

	/**
	 * Realiza las operaciones necesarias de obtener los datos
	 * 
	 * @return
	 */
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@GetMapping("/repuestos/{fechaEntrada}/{fechaSalida}")
	public Integer getValorRepuestosTotal(@PathVariable String fechaEntrada, @PathVariable String fechaSalida) {

		return ordenService.getValorRepuestosTotal(convertToLocalDate(fechaEntrada),
				convertToLocalDate(fechaSalida));
	}

	/**
	 * Convertidor de fechas
	 * 
	 * @param dateToConvert
	 * @return
	 */
	public LocalDate convertToLocalDate(String dateToConvert) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/d");
		String date = dateToConvert.replace('-', '/');
		// convert String to LocalDate
		LocalDate lD = LocalDate.parse(date, formatter);
		return lD;
	}
}
