package org.example;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.ICalculadora")
public class CalculadoraImpl implements ICalculadora{
    @Override
    public double calcular(String operacion, double num1, double num2) {
        double result = 0;
        switch (operacion){
            case Constantes.OPE_SUMA:
                result = num1 + num2;
                break;
            case Constantes.OPE_RESTA:
                result = num1 - num2;
                break;
            case Constantes.OPE_MULTIPLICACION:
                result = num1 * num2;
                break;
            case Constantes.OPE_DIVISION:
                result = num1 / num2;
                break;
            default:
                break;
        }
        return result;
    }
}
