package Janelas;

import Controle.GerenciadorInterface;

public class FrmPrincipal extends javax.swing.JFrame {

    private GerenciadorInterface gerInterfaceGrafica;

    public FrmPrincipal(GerenciadorInterface newGerenciadorInferface) {
        gerInterfaceGrafica = newGerenciadorInferface;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCad = new javax.swing.JMenu();
        mnuCadPaciente = new javax.swing.JMenuItem();
        mnuCadMed = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenu();
        mnuConsultaAgendar = new javax.swing.JMenuItem();
        mnuConsultaListar = new javax.swing.JMenuItem();
        mnuBusca = new javax.swing.JMenu();
        mnuBuscarPessoas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sisclinica - Menu Principal");
        setResizable(false);

        mnuCad.setText("Cadastro");

        mnuCadPaciente.setText("Paciente");
        mnuCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadPacienteActionPerformed(evt);
            }
        });
        mnuCad.add(mnuCadPaciente);

        mnuCadMed.setText("Médico");
        mnuCadMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadMedActionPerformed(evt);
            }
        });
        mnuCad.add(mnuCadMed);

        jMenuBar1.add(mnuCad);

        mnuConsulta.setText("Consulta Médica");

        mnuConsultaAgendar.setText("Agendar");
        mnuConsultaAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaAgendarActionPerformed(evt);
            }
        });
        mnuConsulta.add(mnuConsultaAgendar);

        mnuConsultaListar.setText("Listar");
        mnuConsultaListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaListarActionPerformed(evt);
            }
        });
        mnuConsulta.add(mnuConsultaListar);

        jMenuBar1.add(mnuConsulta);

        mnuBusca.setText("Buscar");

        mnuBuscarPessoas.setText("Pessoas");
        mnuBuscarPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBuscarPessoasActionPerformed(evt);
            }
        });
        mnuBusca.add(mnuBuscarPessoas);

        jMenuBar1.add(mnuBusca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadPacienteActionPerformed
        gerInterfaceGrafica.abrirDlgCadPaciente();
    }//GEN-LAST:event_mnuCadPacienteActionPerformed

    private void mnuCadMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadMedActionPerformed
        gerInterfaceGrafica.abrirDlgCadMedico();
    }//GEN-LAST:event_mnuCadMedActionPerformed

    private void mnuConsultaListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaListarActionPerformed
        gerInterfaceGrafica.abrirDlgListarConsultas();
    }//GEN-LAST:event_mnuConsultaListarActionPerformed

    private void mnuConsultaAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaAgendarActionPerformed
        gerInterfaceGrafica.abrirDlgAgendarConsulta();
    }//GEN-LAST:event_mnuConsultaAgendarActionPerformed

    private void mnuBuscarPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBuscarPessoasActionPerformed
        gerInterfaceGrafica.abrirDlgBuscarPessoa();
    }//GEN-LAST:event_mnuBuscarPessoasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuBusca;
    private javax.swing.JMenuItem mnuBuscarPessoas;
    private javax.swing.JMenu mnuCad;
    private javax.swing.JMenuItem mnuCadMed;
    private javax.swing.JMenuItem mnuCadPaciente;
    private javax.swing.JMenu mnuConsulta;
    private javax.swing.JMenuItem mnuConsultaAgendar;
    private javax.swing.JMenuItem mnuConsultaListar;
    // End of variables declaration//GEN-END:variables
}
