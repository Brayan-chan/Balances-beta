package Inicio;

import java.awt.Color;

public class BalancesGuardados extends javax.swing.JFrame {

int xMouse, yMouse;

    int red = 0;
    int green = 134;
    int blue = 190;
    
    int rojo = 0;
    int verde = 83;
    int azul = 117;    


    public BalancesGuardados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBase = new javax.swing.JPanel();
        PanelSuperiorTitulo = new javax.swing.JPanel();
        PanelCerrar = new javax.swing.JPanel();
        BotonCerrar = new javax.swing.JLabel();
        TituloBalance = new javax.swing.JLabel();
        ArchivosBalances = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PanelBase.setBackground(new java.awt.Color(78, 184, 223));
        PanelBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PanelSuperiorTitulo.setBackground(new java.awt.Color(0, 92, 139));
        PanelSuperiorTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelSuperiorTituloMouseDragged(evt);
            }
        });
        PanelSuperiorTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelSuperiorTituloMousePressed(evt);
            }
        });

        PanelCerrar.setPreferredSize(new java.awt.Dimension(40, 40));

        BotonCerrar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        BotonCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arrow.png"))); // NOI18N
        BotonCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonCerrar.setPreferredSize(new java.awt.Dimension(40, 40));
        BotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelCerrarLayout = new javax.swing.GroupLayout(PanelCerrar);
        PanelCerrar.setLayout(PanelCerrarLayout);
        PanelCerrarLayout.setHorizontalGroup(
            PanelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelCerrarLayout.setVerticalGroup(
            PanelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TituloBalance.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        TituloBalance.setForeground(new java.awt.Color(255, 255, 255));
        TituloBalance.setText("Balances Guardados");

        javax.swing.GroupLayout PanelSuperiorTituloLayout = new javax.swing.GroupLayout(PanelSuperiorTitulo);
        PanelSuperiorTitulo.setLayout(PanelSuperiorTituloLayout);
        PanelSuperiorTituloLayout.setHorizontalGroup(
            PanelSuperiorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorTituloLayout.createSequentialGroup()
                .addComponent(PanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 773, Short.MAX_VALUE))
            .addGroup(PanelSuperiorTituloLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(TituloBalance)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSuperiorTituloLayout.setVerticalGroup(
            PanelSuperiorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorTituloLayout.createSequentialGroup()
                .addComponent(PanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(TituloBalance)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelBaseLayout = new javax.swing.GroupLayout(PanelBase);
        PanelBase.setLayout(PanelBaseLayout);
        PanelBaseLayout.setHorizontalGroup(
            PanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSuperiorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelBaseLayout.createSequentialGroup()
                .addComponent(ArchivosBalances, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseLayout.setVerticalGroup(
            PanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseLayout.createSequentialGroup()
                .addComponent(PanelSuperiorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ArchivosBalances, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelSuperiorTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSuperiorTituloMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_PanelSuperiorTituloMouseDragged

    private void BotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseClicked
        Inicio newframe = new Inicio();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonCerrarMouseClicked

    private void BotonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseEntered
        PanelCerrar.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_BotonCerrarMouseEntered

    private void BotonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseExited
        PanelCerrar.setBackground(Color.white);
    }//GEN-LAST:event_BotonCerrarMouseExited

    private void PanelSuperiorTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSuperiorTituloMousePressed
     xMouse = evt.getX();
     yMouse = evt.getY();
    }//GEN-LAST:event_PanelSuperiorTituloMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BalancesGuardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BalancesGuardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BalancesGuardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BalancesGuardados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BalancesGuardados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArchivosBalances;
    private javax.swing.JLabel BotonCerrar;
    private javax.swing.JPanel PanelBase;
    private javax.swing.JPanel PanelCerrar;
    private javax.swing.JPanel PanelSuperiorTitulo;
    private javax.swing.JLabel TituloBalance;
    // End of variables declaration//GEN-END:variables
}
