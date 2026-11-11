package ec.edu.uce;

import ec.edu.uce.extensiones.NotificacionExtnMail;
import ec.edu.uce.extensiones.NotificacionExtnSMS;
import ec.edu.uce.extensiones.NotificacionExtnWhatsapp;
import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Matricula;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class App implements QuarkusApplication{

    @Inject 
    private MatriculaService mS;

    @Inject 
    private NotificacionExtnMail notificacionExtnMail;

    @Inject 
    private NotificacionExtnSMS notificacionExtnSMS;

    @Inject 
    private NotificacionExtnWhatsapp notificacionExtnWhatsapp;

    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        Estudiante e1 = new Estudiante("Jeryl Morales", "jfmoralesc1@uce.edu.ec", "1753395704");
        Estudiante e2 = new Estudiante("Jesica Troncos", "jptroncosc@lametro.edu.ec", "178596385");

        Matricula m1 = new Matricula("Programacion Avanzada II", "O");
        Matricula m2 = new Matricula("Fotografia arquitectonica", "E");

        mS.registrarMatricula(e1, m1, notificacionExtnMail);
        mS.registrarMatricula(e2, m2, notificacionExtnSMS);
        mS.registrarMatricula(e2, m2, notificacionExtnWhatsapp);

        return 0;
    }

    
}
