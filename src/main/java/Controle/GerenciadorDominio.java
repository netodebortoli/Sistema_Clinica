package Controle;

import Dao.ConexaoHibernate;
import Dao.ConsultaDao;
import Dao.GenericoDao;
import Dao.PessoaDao;
import Dominio.Consulta;
import Dominio.Especialidade;
import Dominio.Medico;
import Dominio.Paciente;
import Dominio.Pessoa;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

public class GerenciadorDominio {

    private GenericoDao genericoDao;
    private ConsultaDao consultaDao;
    private PessoaDao pessoaDao;

    public GerenciadorDominio() {

        ConexaoHibernate.getSessionFactory();

        genericoDao = new GenericoDao();
        consultaDao = new ConsultaDao();
        pessoaDao = new PessoaDao();
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

    public void cadastrarConsulta(Date dataConsulta, String horario, Medico medico, Paciente paciente, Especialidade especialidade, Double preco, int tipoConsulta) {
        Consulta consulta = new Consulta(dataConsulta, horario, medico, paciente, especialidade, tipoConsulta, preco);
        genericoDao.cadastrar(consulta);
    }

    public void atualizarMedico(Medico medico, int crm, String crmUf, List<Especialidade> especialidades, String nome, Date dataNascimento, String sexo,
            String celular, String cep, String cidade, String bairro, String rua, Integer numero, String uf) {

        medico.setCrm(crm);
        medico.setCrmUf(crmUf);
        medico.setEspecialidades(especialidades);
        medico.setNome(nome);
        medico.setDataNascimento(dataNascimento);
        medico.setSexo(sexo);
        medico.setCelular(celular);
        medico.setCep(cep);
        medico.setCidade(cidade);
        medico.setBairro(bairro);
        medico.setRua(rua);
        medico.setNumero(numero);
        medico.setUf(uf);
        genericoDao.atualizar(medico);
    }

    public void atualizarPaciente(Paciente paciente, String observacao, String tipoSanguineo, String nome, Date dataNascimento, String sexo,
            String celular, String cep, String cidade, String bairro, String rua, Integer numero, String uf) {

        paciente.setObservacao(observacao);
        paciente.setTipoSanguineo(tipoSanguineo);
        paciente.setNome(nome);
        paciente.setDataNascimento(dataNascimento);
        paciente.setSexo(sexo);
        paciente.setCelular(celular);
        paciente.setCep(cep);
        paciente.setCidade(cidade);
        paciente.setBairro(bairro);
        paciente.setRua(rua);
        paciente.setNumero(numero);
        paciente.setUf(uf);
        genericoDao.atualizar(paciente);
    }

    // EXCLUIR GENÉRICO
    public void excluir(Object obj) throws HibernateException {
        genericoDao.deletar(obj);
    }

    // LISTAR GENÉRICO
    public List listar(Class classe) {
        return genericoDao.listar(classe);
    }

    public List<Consulta> pesquisarConsulta(String pesquisa, int tipo) throws HibernateException, ParseException {
        List<Consulta> lista = null;

        switch (tipo) {
            case 0:
                lista = consultaDao.pesquisarData(pesquisa, tipo);
                break;
            case 1:
                lista = consultaDao.pesquisarMedico(pesquisa, tipo);
                break;
            case 2:
                lista = consultaDao.pesquisarPaciente(pesquisa, tipo);
                break;
            case 3:
                lista = consultaDao.pesquisarEspecialidade(pesquisa, tipo);
                break;
            default:
                lista = consultaDao.pesquisarTodas(pesquisa, tipo);
        }
        return lista;
    }

    public List<Consulta> pesquisarConsulta(String pesquisa, Medico med) throws HibernateException, ParseException {
        return consultaDao.pesquisarAgendamentos(pesquisa, med);
    }

    public List<Object> pesquisarTotalConsulta() {
        return consultaDao.pesquisarTotal();
    }

    public List<Pessoa> pesquisarPessoas(String pesquisa, int tipo) {
        List<Pessoa> lista = null;

        switch (tipo) {
            case 0: //todos
                lista = pessoaDao.pesquisarPessoa(Pessoa.class, pesquisa);
                break;
            case 1: //medico
                lista = pessoaDao.pesquisarPessoa(Medico.class, pesquisa);
                break;
            case 2: //paciente
                lista = pessoaDao.pesquisarPessoa(Paciente.class, pesquisa);
                break;
        }
        return lista;
    }
}
