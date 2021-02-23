package br.com.zup.vacinacao.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.time.LocalDate;

public class UsuarioCadastrarDto {

  @NotNull(message = "Nome precisa ser informado")
  @Size(min = 3, max = 100, message = "Nome deve ter entre {min} e {max} caracteres")
  private String nome;

  @Email(message = "E-mail inválido")
  @Size(min = 10, max = 100, message = "Descrição deve ter entre {min} e {max} caracteres")
  private String email;

  @CPF(message = "CPF inválido")
  private String cpf;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate dataNascimento;

  public UsuarioCadastrarDto() {
  }

  public UsuarioCadastrarDto(String nome, String email, String cpf, LocalDate dataNascimento) {
    this.nome = nome;
    this.email = email;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
}
