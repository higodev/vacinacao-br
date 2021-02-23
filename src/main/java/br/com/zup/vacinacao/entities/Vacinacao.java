package br.com.zup.vacinacao.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "vacinacao")
public class Vacinacao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(length = 100, nullable = false)
  private String nomeVacina;

  @Column
  private LocalDate dataAplicacao;

  @ManyToOne
  private Usuario usuario;

  public Vacinacao() {
  }

  public Vacinacao(long id, String nomeVacina, LocalDate dataAplicacao, Usuario usuario) {
    this.id = id;
    this.nomeVacina = nomeVacina;
    this.dataAplicacao = dataAplicacao;
    this.usuario = usuario;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNomeVacina() {
    return nomeVacina;
  }

  public void setNomeVacina(String nomeVacina) {
    this.nomeVacina = nomeVacina;
  }

  public LocalDate getDataAplicacao() {
    return dataAplicacao;
  }

  public void setDataAplicacao(LocalDate dataAplicacao) {
    this.dataAplicacao = dataAplicacao;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vacinacao vacinacao = (Vacinacao) o;
    return id == vacinacao.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
