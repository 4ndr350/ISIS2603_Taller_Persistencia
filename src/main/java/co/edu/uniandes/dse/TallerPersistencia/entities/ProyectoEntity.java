package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.OneToMany;
import uk.co.jemos.podam.common.PodamExclude;

public class ProyectoEntity extends BaseEntity {
    public String nombre;
    public String descripcion;

    @PodamExclude
    @OneToMany(mappedBy = "proyecto")

    private Collection<DesarrolladorEntity> tareas = new ArrayList<>();
}
