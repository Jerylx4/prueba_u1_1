package ec.edu.uce.extensiones;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Matricula;
import jakarta.inject.Singleton;

@Singleton  
public class NotificacionExtnMail implements NotificacionExtension{

    @Override
    public void notificar(Estudiante estudiante, Matricula matricula) {
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("[MailExtension] Enviando correo a: " + estudiante.getNombre());
        System.out.println("Correo enviado con exito...");

        System.out.println("------------------------------------------------------------------------------");
        
    }

}
