package br.com.spring.openfeign.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Contato {

	private Long id;
	private String nome;
	private String email;
	private String telefone;
}
