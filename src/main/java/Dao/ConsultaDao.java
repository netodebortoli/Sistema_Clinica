package Dao;

import Dominio.Consulta;
import java.util.List;
import org.hibernate.HibernateException;

public class ConsultaDao extends GenericoDao {

    private List<Consulta> pesquisar(int tipo, String pesq) throws HibernateException {

        return null;
    }

    public List<Consulta> pesquisarData(String pesq) {
        return pesquisar(1, pesq);
    }

    public List<Consulta> pesquisarMedico(String pesq) {
        return pesquisar(2, pesq);
    }

    public List<Consulta> pesquisarPaciente(String pesq) {
        return pesquisar(3, pesq);
    }

    public List<Consulta> pesquisarEspecialidade(String pesq) {
        return pesquisar(4, pesq);
    }

}
