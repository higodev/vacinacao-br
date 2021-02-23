package br.com.zup.vacinacao.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class VacinacaoCadastrarDto {

  @NotNull(message = "Nome da Vacina precisa ser informado")
  @Size(min = 3, max = 100, message = "Nome da Vacina deve ter entre {min} e {max} caracteres")
  private String nomeVacina;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate dataAplicacao;

  @NotNull(message = "Usuario precisa ser informado")
  private long usuario;

  public VacinacaoCadastrarDto() {
  }

  public VacinacaoCadastrarDto(String nomeVacina, LocalDate dataAplicacao, long usuario) {
    this.nomeVacina = nomeVacina;
    this.dataAplicacao = dataAplicacao;
    this.usuario = usuario;
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

  public long getUsuario() {
    return usuario;
  }

  public void setUsuario(long usuario) {
    this.usuario = usuario;
  }
}
