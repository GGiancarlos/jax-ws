package org.example;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface ICalculadora {

    @WebMethod(operationName = "operar")
    @WebResult(name = "resultado")
    public double calcular(String operacion, double num1, double num2);
}
