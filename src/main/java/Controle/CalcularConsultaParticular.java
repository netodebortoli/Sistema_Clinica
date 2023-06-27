package Controle;

import Dominio.Consulta;

public class CalcularConsultaParticular implements PrecoConsulta {

    @Override
    public double calcularPrecoConsulta(Consulta consulta) {
        return consulta.getPreco() * 0.97;
    }

}
