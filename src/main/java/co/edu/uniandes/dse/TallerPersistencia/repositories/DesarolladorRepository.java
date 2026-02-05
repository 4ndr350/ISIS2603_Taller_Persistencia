package co.edu.uniandes.dse.TallerPersistencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uniandes.dse.TallerPersistencia.entities.DesarrolladorEntity;

public interface DesarolladorRepository extends JpaRepository<DesarrolladorEntity, Long> {
}
