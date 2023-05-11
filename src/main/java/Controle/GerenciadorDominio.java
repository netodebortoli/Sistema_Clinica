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

    public void criarMedico(int crm, String crmUf, List<Especialidade> especialidades, String nome, Date dataNascimento, String cpf, char sexo,
            String telefone, String celular, String cep, String cidade, String bairro, String rua, int numero, String uf) {
        Medico med = new Medico(crm, crmUf, especialidades, nome, dataNascimento, cpf, sexo, telefone, celular, cep, cidade, bairro, rua, numero, uf);
        genericoDao.create(med);
    }

    public void criarPaciente(String observacao, String tipoSanguineo, String nome, Date dataNascimento, String cpf, char sexo,
            String telefone, String celular, String cep, String cidade, String bairro, String rua, int numero, String uf) {
        Paciente paciente = new Paciente(observacao, tipoSanguineo, nome, dataNascimento, cpf, sexo, telefone, celular, cep, cidade, bairro, rua, numero, uf);
        genericoDao.create(paciente);
    }

    public void criarConsulta(int idConsulta, Date dataConsulta, String horario, Medico medico, Paciente paciente, Especialidade especialidade) {
        Consulta consulta = new Consulta(dataConsulta, horario, medico, paciente, especialidade);
        genericoDao.create(consulta);
    }

    public List<Medico> listarMedicos() {
        return genericoDao.read(Medico.class);
    }

    public List<Paciente> listarPacientes() {
        return genericoDao.read(Paciente.class);
    }

    public List<Medico> listarConsulta() {
        return genericoDao.read(Consulta.class);
    }
}
