package Janelas;

public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCad = new javax.swing.JMenu();
        mnuCadPessoa = new javax.swing.JMenuItem();
        mnuCadMed = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenu();
        mnuConsAgendar = new javax.swing.JMenuItem();
        mnuConsListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sisclinica ");
        setResizable(false);

        mnuCad.setText("Cadastro");

        mnuCadPessoa.setText("Pessoa");
        mnuCadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadPessoaActionPerformed(evt);
            }
        });
        mnuCad.add(mnuCadPessoa);

        mnuCadMed.setText("Médico");
        mnuCadMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadMedActionPerformed(evt);
            }
        });
        mnuCad.add(mnuCadMed);

        jMenuBar1.add(mnuCad);

        mnuConsulta.setText("Consulta");
        mnuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaActionPerformed(evt);
            }
        });

        mnuConsAgendar.setText("Agendar");
        mnuConsAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsAgendarActionPerformed(evt);
            }
        });
        mnuConsulta.add(mnuConsAgendar);

        mnuConsListar.setText("Listar");
        mnuConsListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsListarActionPerformed(evt);
            }
        });
        mnuConsulta.add(mnuConsListar);

        jMenuBar1.add(mnuConsulta);

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

    private void mnuCadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadPessoaActionPerformed
        DlgCadPaciente objCadPaciente = new DlgCadPaciente(this, true);
        objCadPaciente.setVisible(true);
    }//GEN-LAST:event_mnuCadPessoaActionPerformed

    private void mnuCadMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadMedActionPerformed
        DlgCadMedico objCadMedico = new DlgCadMedico(this, true);
        objCadMedico.setVisible(true);
    }//GEN-LAST:event_mnuCadMedActionPerformed

    private void mnuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaActionPerformed
       DlgAgendarConsulta objCadConsulta = new DlgAgendarConsulta(this, true);
       objCadConsulta.setVisible(true);
    }//GEN-LAST:event_mnuConsultaActionPerformed

    private void mnuConsListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsListarActionPerformed

    private void mnuConsAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsAgendarActionPerformed
        DlgAgendarConsulta objAgConsulta = new DlgAgendarConsulta(this, true);
        objAgConsulta.setVisible(true);
    }//GEN-LAST:event_mnuConsAgendarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuCad;
    private javax.swing.JMenuItem mnuCadMed;
    private javax.swing.JMenuItem mnuCadPessoa;
    private javax.swing.JMenuItem mnuConsAgendar;
    private javax.swing.JMenuItem mnuConsListar;
    private javax.swing.JMenu mnuConsulta;
    // End of variables declaration//GEN-END:variables
}
