package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import uk.co.jemos.podam.common.PodamExclude;

public class TareaEntity extends BaseEntity {
    public String titulo;
    public Integer duracion;
    public String estado;

    @PodamExclude
    @OneToMany(mappedBy = "tareas", orphanRemoval = true)
    private ProyectoEntity proyecto;

    @ManyToMany(mappedBy = "tareas")
    private Collection<DesarrolladorEntity> desarrolladores = new ArrayList<>();
    

}
