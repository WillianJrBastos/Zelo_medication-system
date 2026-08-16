package com.zelo.repository;

import com.zelo.entity.RegistroMedicacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistroMedicacaoRepository extends JpaRepository<RegistroMedicacao, Long> {
    List<RegistroMedicacao> findByMedicacaoUsuarioId(Long usuarioId);
}
