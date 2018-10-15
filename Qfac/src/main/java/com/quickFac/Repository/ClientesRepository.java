package com.quickFac.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quickFac.Entities.Clientes;
@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}
