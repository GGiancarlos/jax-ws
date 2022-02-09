package org.example;

import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class CalculadoraPublish
{
    public static void main( String[] args )
    {
        Endpoint.publish("http://localhost:5000/jaxws/calculadora", new CalculadoraImpl());

    }
}
