package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.ManyToMany;
import uk.co.jemos.podam.common.PodamExclude;

public class DesarrolladorEntity extends BaseEntity {
    public String nombre;
    public String correo;

    @PodamExclude
    @ManyToMany(mappedBy = "desarrolladores")
    private Collection<TareaEntity> tareas = new ArrayList<>();
}
