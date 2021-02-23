package br.com.zup.vacinacao.repositories;

import br.com.zup.vacinacao.entities.Vacinacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinacaoRepository extends JpaRepository<Vacinacao, Long> {
}
