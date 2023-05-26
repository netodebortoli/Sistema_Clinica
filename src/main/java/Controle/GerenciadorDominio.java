package Controle;

import Dao.ConexaoHibernate;
import Dao.ConsultaDao;
import Dao.GenericoDao;
import Dominio.Consulta;
import Dominio.Especialidade;
import Dominio.Medico;
import Dominio.Paciente;
import java.util.Date;
import java.util.List;

public class GerenciadorDominio {

    private GenericoDao genericoDao;
    private ConsultaDao consultaDao;

    public GerenciadorDominio() {

        ConexaoHibernate.getSessionFactory();

        genericoDao = new GenericoDao();
        consultaDao = new ConsultaDao();
    }

    public void cadastrarMedico(int crm, String crmUf, List<Especialidade> especialidades, String nome, Date dataNascimento, String cpf, String sexo,
            String celular, String cep, String cidade, String bairro, String rua, Integer numero, String uf) {
        Medico med = new Medico(crm, crmUf, especialidades, nome, dataNascimento, cpf, sexo, celular, cep, cidade, bairro, rua, numero, uf);
        genericoDao.cadastrar(med);
    }

    public void cadastrarPaciente(String observacao, String tipoSanguineo, String nome, Date dataNascimento, String cpf, String sexo,
            String celular, String cep, String cidade, String bairro, String rua, Integer numero, String uf) {
        Paciente paciente = new Paciente(observacao, tipoSanguineo, nome, dataNascimento, cpf, sexo, celular, cep, cidade, bairro, rua, numero, uf);
        genericoDao.cadastrar(paciente);
    }

    public void cadastrarConsulta(Date dataConsulta, String horario, Medico medico, Paciente paciente, Especialidade especialidade) {
        Consulta consulta = new Consulta(dataConsulta, horario, medico, paciente, especialidade);
        genericoDao.cadastrar(consulta);
    }

    public List listar(Class classe) {
        return genericoDao.listar(classe);
    }
}
