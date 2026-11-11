package ec.edu.uce.extensiones;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Matricula;
import jakarta.inject.Singleton;

@Singleton 
public class NotificacionExtnSMS implements NotificacionExtension{

    @Override
    public void notificar(Estudiante estudiante, Matricula matricula) {
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("[SmsExtension] Enviando SMS a: " + estudiante.getNombre());
        System.out.println("SMS enviado con exito...");

        System.out.println("------------------------------------------------------------------------------");

    }

}
