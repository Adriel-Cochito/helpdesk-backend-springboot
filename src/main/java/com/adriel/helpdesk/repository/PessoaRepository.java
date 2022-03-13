package com.adriel.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriel.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
