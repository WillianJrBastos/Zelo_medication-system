package com.zelo.repository;

import com.zelo.entity.EventoCalendario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventoCalendarioRepository extends JpaRepository<EventoCalendario, Long> {
    List<EventoCalendario> findByUsuarioId(Long usuarioId);
}
