package br.com.zup.vacinacao.services;

import br.com.zup.vacinacao.dtos.VacinacaoCadastrarDto;
import br.com.zup.vacinacao.entities.Vacinacao;

public interface VacinacaoService {
  Vacinacao cadastrarVacinacao(VacinacaoCadastrarDto vacinacaoCadastrarDto);
}
