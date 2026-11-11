package ec.edu.uce.extensiones;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Matricula;
import jakarta.inject.Singleton;

@Singleton 
public class NotificacionExtnWhatsapp implements NotificacionExtension{

    @Override
    public void notificar(Estudiante estudiante, Matricula matricula) {
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("[WhatsappExtension] Enviando Whatsapp a: " + estudiante.getNombre());
        System.out.println("Whatsapp enviado con exito...");
        
        System.out.println("------------------------------------------------------------------------------");

    }

}
