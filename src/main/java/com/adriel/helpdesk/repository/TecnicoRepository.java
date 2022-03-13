package com.adriel.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriel.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
