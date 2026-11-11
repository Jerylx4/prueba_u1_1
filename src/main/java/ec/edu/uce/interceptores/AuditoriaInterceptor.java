package ec.edu.uce.interceptores;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Matricula;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@Auditoria
public class AuditoriaInterceptor {

    @AroundInvoke 
    public Object interceptor(InvocationContext context) throws Exception{
        System.out.println("[AuditoriaInterceptor] Iniciando auditoria...");

        Object[] parametros = context.getParameters();

        Estudiante estudiante = (Estudiante) parametros[0];
        Matricula matricula = (Matricula) parametros[1];
        
        if ("E".equalsIgnoreCase(matricula.getTipo())){
            System.out.println("[AuditoraInterceptor] Estudiante " + estudiante.getNombre() 
            + " ha realizado una matricula extraordinaria");
        } else if ("O".equalsIgnoreCase(matricula.getTipo())){
            System.out.println("[AuditoraInterceptor] Estudiante " + estudiante.getNombre() 
            + " ha realizado una matricula ordinaria");
        }

        Object resultado = context.proceed();

        System.out.println("[AuditoriaInterceptor] Finalizando auditoria...");
        
        return resultado;
    }
}
