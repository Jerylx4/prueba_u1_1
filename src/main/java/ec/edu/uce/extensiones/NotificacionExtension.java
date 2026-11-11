package ec.edu.uce.extensiones;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Matricula;

public interface NotificacionExtension {
    void notificar(Estudiante estudiante, Matricula matricula);
}
