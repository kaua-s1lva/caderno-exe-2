package services;
import java.util.List;

import interfaces.IOperacaoStrategy;

public class CalculadoraService {
    public double setOperacao(List<Double> numeros, IOperacaoStrategy iOperacao) {
        return iOperacao.calcular(numeros);
    }
}
