package org.example.cliente;

import org.example.ws.CalculadoraImplService;
import org.example.ws.ICalculadora;

/**
 * Hello world!
 *
 */
public class CalculadoraCliente
{
    public static void main( String[] args )
    {
        CalculadoraImplService calculadoraServicio = new CalculadoraImplService();
        ICalculadora consumer = calculadoraServicio.getCalculadoraImplPort();

        double respuesta;
        respuesta = consumer.operar("suma", 10, 20);
        System.out.println( "Calcular suma" );
        System.out.println(respuesta);

        respuesta = consumer.operar("resta", 100, 20);
        System.out.println( "Calcular resta" );
        System.out.println(respuesta);

        respuesta = consumer.operar("multiplica", 5, 5);
        System.out.println( "Calcular multiplicación" );
        System.out.println(respuesta);

        respuesta = consumer.operar("divide", 1000, 20);
        System.out.println( "Calcular división" );
        System.out.println(respuesta);
    }
}
