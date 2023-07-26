package com.springultimate.challenge3.dto;

import java.time.LocalDate;

import com.springultimate.challenge3.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ClientDTO {

	private Long id;
	@NotBlank(message = "Campo requerido")
	@Size(min = 3, max = 80, message = "Nome precisa ter de 3 a 80 caracteres")
	private String name;
	@NotBlank(message = "Campo requerido")
	@Size(min = 11, max = 11, message = "O CPF deve conter 11 dígitos")
	private String cpf;
	@Positive(message = "O valor deve ser positivo")
	private Double income;
	 @PastOrPresent
	private LocalDate birthDate;
	private Integer children;
	
	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}
	
	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
}
