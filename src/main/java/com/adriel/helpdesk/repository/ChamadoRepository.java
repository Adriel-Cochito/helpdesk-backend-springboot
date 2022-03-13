package com.adriel.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriel.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
