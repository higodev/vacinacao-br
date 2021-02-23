package br.com.zup.vacinacao.services.impl;

import br.com.zup.vacinacao.dtos.VacinacaoCadastrarDto;
import br.com.zup.vacinacao.entities.Usuario;
import br.com.zup.vacinacao.entities.Vacinacao;
import br.com.zup.vacinacao.repositories.VacinacaoRepository;
import br.com.zup.vacinacao.services.UsuarioService;
import br.com.zup.vacinacao.services.VacinacaoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class VacinacaoServiceImpl implements VacinacaoService {

  @Autowired
  private VacinacaoRepository repository;

  @Autowired
  private UsuarioService usuarioService;

  @Autowired
  private ModelMapper modelMapper;

  @Override
  public Vacinacao cadastrarVacinacao(VacinacaoCadastrarDto vacinacaoCadastrarDto) {

    Vacinacao vacinacao;

    try{
      vacinacao = modelMapper.map(vacinacaoCadastrarDto, Vacinacao.class);
      Usuario usuario = usuarioService.buscarPorId(vacinacaoCadastrarDto.getUsuario());
      vacinacao.setUsuario(usuario);
      repository.save(vacinacao);
    }catch (Exception e){
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }

    return vacinacao;
  }
}
