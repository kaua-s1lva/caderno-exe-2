package calculos;

import java.util.List;
import java.util.Collections;

import interfaces.IOperacaoStrategy;

public class Maior implements IOperacaoStrategy {

    @Override
    public double calcular(List<Double> numeros) {
        return Collections.max(numeros);
    }
}
