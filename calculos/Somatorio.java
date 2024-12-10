package calculos;

import java.util.List;

import interfaces.IOperacaoStrategy;

public class Somatorio implements IOperacaoStrategy {

    @Override
    public double calcular(List<Double> numeros) {
        double total = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            total += numeros.get(counter);
        }
        return total;
    }
}
