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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCad = new javax.swing.JMenu();
        mnuCadPaciente = new javax.swing.JMenuItem();
        mnuCadMed = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenu();
        mnuConsultaAgendar = new javax.swing.JMenuItem();
        mnuConsultaListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sisclinica - Menu Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Sistema Gerenciador de Consultas ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Sisclinica");

        mnuCad.setText("Cadastro");
        mnuCad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnuCadPaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuCadPaciente.setText("Paciente");
        mnuCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadPacienteActionPerformed(evt);
            }
        });
        mnuCad.add(mnuCadPaciente);

        mnuCadMed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuCadMed.setText("Médico");
        mnuCadMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadMedActionPerformed(evt);
            }
        });
        mnuCad.add(mnuCadMed);

        jMenuBar1.add(mnuCad);

        mnuConsulta.setText("Consulta Médica");
        mnuConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mnuConsultaAgendar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuConsultaAgendar.setText("Agendar");
        mnuConsultaAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaAgendarActionPerformed(evt);
            }
        });
        mnuConsulta.add(mnuConsultaAgendar);

        mnuConsultaListar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnuConsultaListar.setText("Listar");
        mnuConsultaListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaListarActionPerformed(evt);
            }
        });
        mnuConsulta.add(mnuConsultaListar);

        jMenuBar1.add(mnuConsulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(146, 146, 146))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuCad;
    private javax.swing.JMenuItem mnuCadMed;
    private javax.swing.JMenuItem mnuCadPaciente;
    private javax.swing.JMenu mnuConsulta;
    private javax.swing.JMenuItem mnuConsultaAgendar;
    private javax.swing.JMenuItem mnuConsultaListar;
    // End of variables declaration//GEN-END:variables
}
