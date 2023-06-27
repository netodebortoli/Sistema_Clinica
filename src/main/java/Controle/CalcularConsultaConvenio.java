package Controle;

import Dominio.Consulta;

public class CalcularConsultaConvenio implements PrecoConsulta {

    @Override
    public double calcularPrecoConsulta(Consulta consulta) {
        return consulta.getPreco() * 0.9;
    }
}
