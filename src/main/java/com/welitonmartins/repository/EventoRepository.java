package com.welitonmartins.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welitonmartins.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, String> {

}
