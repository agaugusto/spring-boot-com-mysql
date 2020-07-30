package br.com.adriano.springbootcommysql.controller;

import br.com.adriano.springbootcommysql.controller.dto.PessoaRs;
import br.com.adriano.springbootcommysql.repository.PessoaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping("/")
    public List<PessoaRs> findAll(){
        var pessoa = pessoaRepository.findAll();

        return pessoa
                .stream()
                .map((p) -> PessoaRs.converter(p))
                .collect(Collectors.toList());
    }
}
