package br.com.adriano.springbootcommysql.repository;

import br.com.adriano.springbootcommysql.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
