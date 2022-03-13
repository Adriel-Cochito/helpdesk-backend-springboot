package com.adriel.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriel.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
