package com.prueba.pruebaBcnc.infraestructura.repositorio;

import com.prueba.pruebaBcnc.infraestructura.CadenaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadenaRespositorio extends JpaRepository<CadenaEntidad, Integer> {
}
