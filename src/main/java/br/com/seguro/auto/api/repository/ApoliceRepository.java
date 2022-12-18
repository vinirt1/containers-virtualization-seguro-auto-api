package br.com.seguro.auto.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.seguro.auto.api.model.entity.Apolice;

public interface ApoliceRepository extends JpaRepository<Apolice, Long> {}
