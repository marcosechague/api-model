package py.com.backend.apimode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import py.com.backend.apimode.domain.dto.CompanyRegistrationDto;
import py.com.backend.apimode.domain.dto.CompanyRegistrationResponseDto;

@RestController
@RequestMapping("companies") //plural, nivel de clase
public class CompanyController {

	@RequestMapping(value="/",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	//Se dice que es buena practica incluir la url de localizacion del elemento creado en el header Location
	public CompanyRegistrationResponseDto registerCompany(@RequestBody CompanyRegistrationDto companyRegistrationDto) {
		
		return null;
	}
	
	@RequestMapping(value="/{id-company}",method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCompany(@PathVariable Integer id) {
	
	}
	
	

}
