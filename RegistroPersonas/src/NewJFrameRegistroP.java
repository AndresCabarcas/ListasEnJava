
import com.sun.javafx.text.GlyphLayout;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deivis Sanchez
 */
public class NewJFrameRegistroP extends javax.swing.JFrame {

    DefaultListModel modeloLista;
    
    
    public NewJFrameRegistroP() {
        initComponents();
        modeloLista = new DefaultListModel();
        jList1.setModel(modeloLista);
    }
    public void agregarValores(){
        
        NodoRegistroPers nod = new NodoRegistroPers();
        NodoLista DVS = new NodoLista();
        String Nombre=jTextCampo1.getText();
        String Apellido=jTextCampo2.getText();
        String Id=jTextCampo3.getText();
        String Ed=jTextCampo4.getText();
        String Direcc=jTextCampo5.getText();
        String Celular=jTextCampo6.getText();
                           
            nod.setNombres(Nombre);//agrega nombre.
            nod.setApellidos(Apellido);//agrega Apellido.
            nod.setId(Id);//agrega id.
            nod.setEdad(Ed);//agrega EdAD.
            nod.setCelular(Celular);//agrega celular.
            nod.setDireccion(Direcc);//agrega Direcc.
        if("".equals(nod.getNombres())||"".equals(nod.getApellidos())||"".equals(nod.getId())||"".equals(nod.getEdad())||"".equals(nod.getCelular())||"".equals(nod.getDireccion()) ){
            JOptionPane.showMessageDialog(null," Complete todos los campos requeridos  ");          
        }else{
            DVS.Agregar_al_final(nod);
            jTextCampo1.setText(null);
            jTextCampo2.setText(null);
            jTextCampo3.setText(null);
            jTextCampo4.setText(null);
            jTextCampo5.setText(null);
            jTextCampo6.setText(null);
            modeloLista.addElement(nod.getNombres()+" - "+nod.getApellidos()+" - "+nod.getId()+" - "+nod.getEdad()+" - "+nod.getCelular()+" - "+nod.getDireccion()+" - ");        
        
        }        
                    
    }
    public void quitarValores(){
        int respuesta=JOptionPane.showConfirmDialog(null," ¿Realmente desea eliminar el registro?");
        if(respuesta==0){
            int pos=jList1.getSelectedIndex();
            modeloLista.remove(pos);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jBtnAgregar = new javax.swing.JButton();
        jBtnQuitar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextCampo1 = new javax.swing.JTextField();
        jTextCampo2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextCampo3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextCampo4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextCampo5 = new javax.swing.JTextField();
        jTextCampo6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jBtnAgregar.setText("Add");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });
        jBtnAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jBtnAgregarKeyTyped(evt);
            }
        });

        jBtnQuitar.setText("Delate");
        jBtnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnQuitarActionPerformed(evt);
            }
        });

        jLabel1.setText("* Nombres:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("REGISTRO DE PERSONAS");

        jTextCampo1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextCampo1InputMethodTextChanged(evt);
            }
        });
        jTextCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCampo1ActionPerformed(evt);
            }
        });

        jTextCampo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCampo2ActionPerformed(evt);
            }
        });

        jLabel3.setText("* Apellidos:");

        jTextCampo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCampo3ActionPerformed(evt);
            }
        });

        jLabel4.setText("* CC / Id:");

        jTextCampo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCampo4ActionPerformed(evt);
            }
        });

        jLabel5.setText("* Direccion:");

        jLabel6.setText("* Edad:");

        jTextCampo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCampo5ActionPerformed(evt);
            }
        });

        jTextCampo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCampo6ActionPerformed(evt);
            }
        });

        jLabel7.setText("* Celular:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jBtnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCampo5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCampo4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCampo6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCampo2))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextCampo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCampo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCampo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        agregarValores();
           
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnQuitarActionPerformed
        quitarValores();        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnQuitarActionPerformed

    private void jTextCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCampo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCampo1ActionPerformed

    private void jBtnAgregarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtnAgregarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAgregarKeyTyped

    private void jTextCampo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCampo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCampo5ActionPerformed

    private void jTextCampo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCampo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCampo3ActionPerformed

    private void jTextCampo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCampo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCampo2ActionPerformed

    private void jTextCampo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCampo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCampo4ActionPerformed

    private void jTextCampo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCampo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCampo6ActionPerformed

    private void jTextCampo1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextCampo1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCampo1InputMethodTextChanged

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
            java.util.logging.Logger.getLogger(NewJFrameRegistroP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameRegistroP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameRegistroP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameRegistroP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameRegistroP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnQuitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCampo1;
    private javax.swing.JTextField jTextCampo2;
    private javax.swing.JTextField jTextCampo3;
    private javax.swing.JTextField jTextCampo4;
    private javax.swing.JTextField jTextCampo5;
    private javax.swing.JTextField jTextCampo6;
    // End of variables declaration//GEN-END:variables
}
