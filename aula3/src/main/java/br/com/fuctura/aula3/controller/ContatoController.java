package br.com.fuctura.aula3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.aula3.dto.ContatoRequestDTO;
import br.com.fuctura.aula3.dto.ContatoResponseDTO;
import br.com.fuctura.aula3.service.IContatoService;

@RestController
@RequestMapping("/contato")
public class ContatoController {

	
	private final IContatoService service; //por que estah alertando????
	
	/*
	 * C - criar 
	 * R -
	 * U -
	 * D - 
	 */
	//construtor
	@Autowired
	public ContatoController(@Qualifier("ContatoServiceImpl")  IContatoService service) {
		this.service = service;
	}
	
	//@RequestMapping(path = "/cadastrar", method = RequestMethod.POST)
	@PostMapping("/cadastrar")
	public ResponseEntity<ContatoResponseDTO> cadastrar(@RequestBody ContatoRequestDTO request) {
		service.salvar(request);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
