package Controle;

import Dominio.Pessoa;
import Janelas.*;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class GerenciadorInterface {

    private FrmPrincipal frmPrincipal = null;
    private DlgBuscarConsulta dlgBuscarConsulta = null;
    private DlgCadPaciente dlgCadPaciente = null;
    private DlgCadMedico dlgCadMedico = null;
    private DlgBuscarPessoa dlgBuscarPessoa = null;
    private DlgAgendarConsulta dlgAgendarConsulta = null;

    public GerenciadorDominio gerenciadorDominio;

    public GerenciadorInterface() {
        gerenciadorDominio = new GerenciadorDominio();
    }

    public GerenciadorDominio getGerenciadorDominio() {
        return gerenciadorDominio;
    }

    // ABRIR JDIALOG
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerenciadorInterface.class).newInstance(parent, true, this);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName());
            }
        }
        dlg.setVisible(true);
        return dlg;
    }

    //CARREGAR COMBOBOX GENERICO
    public DefaultComboBoxModel carregarComboBox(Class classe) {
        try {
            List lista = gerenciadorDominio.listar(classe);
            return new DefaultComboBoxModel(lista.toArray());
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(frmPrincipal, "Erro ao popular combobox. " + ex.getMessage());
            return null;
        }
    }

    // CARREGAR LISTA GENERICO
    public void carregarListBox(JList listBox, Class classe) {
        try {
            List lista = gerenciadorDominio.listar(classe);
            listBox.removeAll();
            listBox.setListData(lista.toArray());
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(frmPrincipal, "Erro ao carregar lista. " + ex.getMessage());
        }
    }

    public void abrirDlgAgendarConsulta() {
        abrirJanela(frmPrincipal, dlgAgendarConsulta, DlgAgendarConsulta.class);
    }
 
    public Pessoa abrirDlgBuscarPessoa() {
        dlgBuscarPessoa = (DlgBuscarPessoa) abrirJanela(frmPrincipal, dlgBuscarPessoa, DlgBuscarPessoa.class);
        return dlgBuscarPessoa.getPessoa();
    }

    public void abrirDlgCadMedico() {
        abrirJanela(frmPrincipal, dlgCadMedico, DlgCadMedico.class);
    }

    public void abrirDlgCadPaciente() {
        abrirJanela(frmPrincipal, dlgCadPaciente, DlgCadPaciente.class);
    }

    public void abrirDlgListarConsultas() {
        abrirJanela(frmPrincipal, dlgBuscarConsulta, DlgBuscarConsulta.class);
    }

    public void abrirFrmPrincial() {
        if (frmPrincipal == null) {
            frmPrincipal = new FrmPrincipal(this);
        }
        frmPrincipal.setVisible(true);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        GerenciadorInterface gerenciadorInterface = new GerenciadorInterface();
        gerenciadorInterface.abrirFrmPrincial();
    }
}
