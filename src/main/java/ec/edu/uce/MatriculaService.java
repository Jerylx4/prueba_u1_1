package ec.edu.uce;

import ec.edu.uce.extensiones.NotificacionExtension;
import ec.edu.uce.interceptores.Auditoria;
import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Matricula;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class MatriculaService {

    @Auditoria
    public void registrarMatricula(Estudiante e, Matricula m, NotificacionExtension ext){
        System.out.println("[MatriculaService] Registrando matricula...");

        System.out.println("Estudiante: " + e.getNombre() 
        + " | Materia: " + m.getMateria() 
        + " | Tipo: " + m.getTipo());

        ext.notificar(e, m);

    }

}
