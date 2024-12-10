import java.util.ArrayList;

import calculos.*;
import services.CalculadoraService;

public class Principal {
    public static void main(String args[]) {

        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(5.0);
        numeros.add(3.0);
        
        CalculadoraService calculadora = new CalculadoraService();
        double resultadoMedia = calculadora.setOperacao(numeros, new Variancia());
        System.out.println(resultadoMedia);
    }
}
