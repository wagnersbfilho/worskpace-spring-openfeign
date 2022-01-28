package br.com.spring.openfeign.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="Agenda", url="http://localhost:8080/contatos/32")
public interface ConsumindoAPI {

	@RequestMapping(method = RequestMethod.GET, value = "/")
//	@GetMapping
	public Contato retornarContato();
}
