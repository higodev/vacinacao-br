package br.com.zup.vacinacao.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "usuarios")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(length = 100, nullable = false)
  private String nome;

  @Column(length = 100, nullable = false, unique = true)
  private String email;

  @Column(length = 20, nullable = false, unique = true)
  private String cpf;

  @Column(nullable = false)
  private LocalDate dataNascimento;

  @JsonIgnore
  @OneToMany(mappedBy = "usuario")
  private List<Vacinacao> vacinacoes = new ArrayList<>();

  public Usuario() {
  }

  public Usuario(long id, String nome, String email, String cpf, LocalDate dataNascimento) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public List<Vacinacao> getVacinacoes() {
    return vacinacoes;
  }

  public void setVacinacoes(List<Vacinacao> vacinacoes) {
    this.vacinacoes = vacinacoes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Usuario usuario = (Usuario) o;
    return id == usuario.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
