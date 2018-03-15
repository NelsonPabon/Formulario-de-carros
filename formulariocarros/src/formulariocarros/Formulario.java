package formulariocarros;

public class Formulario extends javax.swing.JFrame {
    
    int contador = 0;
    Carro [] car;
    int CC,CS;

    public Formulario() {
        
        car = new Carro [10];
                          
        for (int i = 0; i < 10 ; i++){
            
            car [i] = new Carro ();
            
        }
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        marc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        costo_carro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        medio_pago = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        col = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        matri = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tipo_combustible = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        costo_seguro = new javax.swing.JTextField();
        realizado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacion = new javax.swing.JTextArea();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1330, 670));
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Marca:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 20, 101, 40);

        marc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(marc);
        marc.setBounds(150, 20, 480, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Modelo:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 70, 101, 40);

        model.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(model);
        model.setBounds(150, 70, 480, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Costo del carro:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 120, 101, 40);

        costo_carro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        costo_carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costo_carroActionPerformed(evt);
            }
        });
        getContentPane().add(costo_carro);
        costo_carro.setBounds(150, 120, 480, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Medio de pago:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 170, 101, 40);

        medio_pago.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(medio_pago);
        medio_pago.setBounds(150, 170, 480, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Color:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(700, 20, 101, 40);

        col.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(col);
        col.setBounds(830, 20, 450, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Matricula:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(700, 70, 101, 40);

        matri.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(matri);
        matri.setBounds(830, 70, 450, 40);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Tipo de combustible:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(700, 120, 130, 40);

        tipo_combustible.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(tipo_combustible);
        tipo_combustible.setBounds(830, 120, 450, 40);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Costo del seguro:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(700, 170, 101, 40);

        costo_seguro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(costo_seguro);
        costo_seguro.setBounds(830, 170, 450, 40);

        realizado.setBackground(new java.awt.Color(102, 0, 102));
        realizado.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        realizado.setForeground(new java.awt.Color(153, 153, 153));
        realizado.setText("Realizado");
        realizado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 102)));
        realizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizadoActionPerformed(evt);
            }
        });
        getContentPane().add(realizado);
        realizado.setBounds(400, 230, 230, 60);

        informacion.setColumns(20);
        informacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        informacion.setRows(5);
        jScrollPane1.setViewportView(informacion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 310, 1140, 330);

        limpiar.setBackground(new java.awt.Color(102, 0, 102));
        limpiar.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        limpiar.setForeground(new java.awt.Color(153, 153, 153));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar);
        limpiar.setBounds(830, 230, 230, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void costo_carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costo_carroActionPerformed
        
    }//GEN-LAST:event_costo_carroActionPerformed

    private void realizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizadoActionPerformed
        
        car[contador].setMarca(marc.getText());
        car[contador].setModelo(model.getText());
        car[contador].setCc(costo_carro.getText());
        Integer.parseInt(costo_carro.getText());
        car[contador].setMd(medio_pago.getText());
        car[contador].setColor(col.getText());
        car[contador].setMatricula(matri.getText());
        car[contador].setTc(tipo_combustible.getText());
        car[contador].setCs(costo_seguro.getText());
        Integer.parseInt(costo_seguro.getText());
        
        informacion.setText(informacion.getText() + "\n" + car[contador].datos());
        
        contador ++;
        
    }//GEN-LAST:event_realizadoActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        
        marc.setText(null);
        model.setText(null);
        costo_carro.setText(null);
        medio_pago.setText(null);
        col.setText(null);
        matri.setText(null);
        tipo_combustible.setText(null);
        costo_seguro.setText(null);
        
    }//GEN-LAST:event_limpiarActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField col;
    private javax.swing.JTextField costo_carro;
    private javax.swing.JTextField costo_seguro;
    private javax.swing.JTextArea informacion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField marc;
    private javax.swing.JTextField matri;
    private javax.swing.JTextField medio_pago;
    private javax.swing.JTextField model;
    private javax.swing.JButton realizado;
    private javax.swing.JTextField tipo_combustible;
    // End of variables declaration//GEN-END:variables
}
