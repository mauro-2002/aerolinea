package iam.aerolinea.repositorio;

import iam.aerolinea.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente,Long> {
}
