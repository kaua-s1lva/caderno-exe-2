package calculos;

import java.util.List;

import interfaces.IOperacaoStrategy;

public class DesvioPadrao implements IOperacaoStrategy {

    @Override
    public double calcular(List<Double> numeros) {
        double p1 = 1 / Double.valueOf(numeros.size() - 1);
        double p2 = getSomaDosElementosAoQuadrado(numeros)-(Math.pow(getSomaDosElementos(numeros), 2)/Double.valueOf(numeros.size()));
        return Math.sqrt(p1 * p2);
    }

    private double getSomaDosElementos(List<Double> numeros) {
        double total = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            total += numeros.get(counter);
        }
        return total;
    }

    private double getSomaDosElementosAoQuadrado(List<Double> numeros) {
        double total = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            total += Math.pow(numeros.get(counter), 2);
        }
        return total;
    }
}
