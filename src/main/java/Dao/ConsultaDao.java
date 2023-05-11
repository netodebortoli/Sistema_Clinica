package Dao;

import Dominio.Consulta;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ConsultaDao extends GenericoDao {

    private List<Consulta> pesquisar(int tipo) throws HibernateException {

        return null;
    }

    public List<Consulta> pesquisarData() {
        return pesquisar(1);
    }

    public List<Consulta> pesquisarMedico() {
        return pesquisar(2);
    }

    public List<Consulta> pesquisarPaciente() {
        return pesquisar(3);
    }

    public List<Consulta> pesquisarEspecialidade() {
        return pesquisar(4);
    }

}
