package Interface;

public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        mnuPessoa = new javax.swing.JMenuItem();
        mnuPesq = new javax.swing.JMenu();
        mnuPesq_Consulta = new javax.swing.JMenuItem();
        mnuPesq_Paciente = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sisclinica ");
        setResizable(false);

        mnuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/imagens/add.png"))); // NOI18N
        mnuCadastro.setText("Cadastro");
        mnuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroActionPerformed(evt);
            }
        });

        mnuPessoa.setText("Pessoa");
        mnuPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPessoaActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuPessoa);

        jMenuBar1.add(mnuCadastro);

        mnuPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/imagens/search.png"))); // NOI18N
        mnuPesq.setText("Pesquisar");

        mnuPesq_Consulta.setText("Consulta");
        mnuPesq_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPesq_ConsultaActionPerformed(evt);
            }
        });
        mnuPesq.add(mnuPesq_Consulta);

        mnuPesq_Paciente.setText("Paciente");
        mnuPesq_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPesq_PacienteActionPerformed(evt);
            }
        });
        mnuPesq.add(mnuPesq_Paciente);

        jMenuBar1.add(mnuPesq);

        jMenu1.setText("Agendar");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPesq_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPesq_PacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPesq_PacienteActionPerformed

    private void mnuPesq_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPesq_ConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPesq_ConsultaActionPerformed

    private void mnuPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPessoaActionPerformed
        DlgCad obj = new DlgCad(this, true);
        obj.setVisible(true);
    }//GEN-LAST:event_mnuPessoaActionPerformed

    private void mnuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroActionPerformed

    }//GEN-LAST:event_mnuCadastroActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenu mnuPesq;
    private javax.swing.JMenuItem mnuPesq_Consulta;
    private javax.swing.JMenuItem mnuPesq_Paciente;
    private javax.swing.JMenuItem mnuPessoa;
    // End of variables declaration//GEN-END:variables
}
