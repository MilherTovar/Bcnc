package com.prueba.pruebaBcnc.infraestructura.repositorio;

import com.prueba.pruebaBcnc.infraestructura.MonedaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonedaRepositorio extends JpaRepository<MonedaEntidad, Integer> {
}
