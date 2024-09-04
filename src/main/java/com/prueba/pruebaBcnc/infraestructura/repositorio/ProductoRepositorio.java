package com.prueba.pruebaBcnc.infraestructura.repositorio;

import com.prueba.pruebaBcnc.infraestructura.ProductoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<ProductoEntidad, Integer> {
}
