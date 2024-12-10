package calculos;
import java.util.List;

import interfaces.IOperacaoStrategy;

public class Media implements IOperacaoStrategy {
    
    @Override
    public double calcular(List<Double> numeros) {
        double total = 0;
            for (int i = 0; i < numeros.size(); i++) {
                total += numeros.get(i);
            }
        return total / numeros.size();
    }
}
