package Controle;

import Dao.ConexaoHibernate;
import Dao.ConsultaDao;
import Dao.GenericoDao;
import Dao.MedicoDao;
import Dao.PacienteDao;
import Dominio.Especialidade;
import Dominio.Medico;
import Dominio.Paciente;
import Dominio.Pessoa;
import java.util.Date;
import java.util.List;

public class GerenciadorDominio {

    private GenericoDao dao;
    private MedicoDao medicoDao;
    private PacienteDao pacienteDao;
    private ConsultaDao consultaDao;

    public GerenciadorDominio() {

        ConexaoHibernate.getSessionFactory();

        dao = new GenericoDao();
        medicoDao = new MedicoDao();
        pacienteDao = new PacienteDao();
        consultaDao = new ConsultaDao();
    }

    public void criarMedico(int crm, String crmUf, List<Especialidade> especialidades, String nome, Date dataNascimento, String cpf, char sexo,
            String telefone, String celular, String cep, String cidade, String bairro, String rua, int numero, String uf) {
        Medico med = new Medico(crm, crmUf, especialidades, nome, dataNascimento, cpf, sexo, telefone, celular, cep, cidade, bairro, rua, numero, uf);
        dao.create(med);
    }

    public void criarPaciente(String observacao, String tipoSanguineo, String nome, Date dataNascimento, String cpf, char sexo,
            String telefone, String celular, String cep, String cidade, String bairro, String rua, int numero, String uf) {
        Paciente paciente = new Paciente(observacao, tipoSanguineo, nome, dataNascimento, cpf, sexo, telefone, celular, cep, cidade, bairro, rua, numero, uf);
        dao.create(paciente);
    }

    public void criarConsulta() {

    }

}
