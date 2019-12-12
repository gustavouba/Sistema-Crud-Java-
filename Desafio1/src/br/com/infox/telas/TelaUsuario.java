/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.telas;

/**
 *
 * @author Nine
 */
import java.sql.*;
import br.com.infox.dal.ModuloConexao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane

public class TelaUsuario extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    Resultset rs = null;
    private Object txtid;
    private Object txtnome;
    private Object txtfone;
    private Object txtlog;
    private Object txtsenha;
    private Object cboUsuPerfil;
    private Object JOptionpane;

    /**
     * Creates new form TelaUsuario
     */
    //abaixo a classe construtor
    public TelaUsuario() {
        initComponents();
        conexao = ModuloConexao.conector();
        
        

    private void pesquisar() {
        String sql = "select * from tbusuario where iduser=?";
        try {
            JOptionPane.showmessageDialog(null, e);
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtid.getText());
            rs = (Resultset) pst.executeQuery();
            if (rs.next()) {
                txtnome.setText(rs.getString(2))
                txtfone.setText(rs.getString(3));
                txtlog.setText(rs.getString(4));
                txtsenha.setText(rs.getString(5));
                cboUsuPerfil.setSelectedItem(rs.getString(6));

            } else {
                JOptionPane.showMessageDialog(null, "Usuario nao cadastrado");
                //as linhas abaixo limpam os campos
                txtnome.setText(null);
                txtfone.setText(null);
                txtlog.setText(null);
                txtsenha.setText(null);
                

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void adicionar() throws SQLException {
        String sql = "insert into tbusuario(iduser,usuario,fone,loguin,senha,perfil)values(?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtid.getText());
            pst.setString(2, txtnome.getText());
            pst.setString(3, txtfone.getText());
            pst.setString(4, txtlog.getText());
            pst.setString(5, txtsenha.getText());
            pst.setString(6, cboUsuPerfil.getSelectedItem().toString());
            // validação dos campos obrigatorios
            if (txtid.getText().isEmpty())||(txtnome.getText().isEmpty())||(txtnome.getText().isEmpty())||(txtfone.getText().isEmpty())||(txtlog.getText().isEmpty())||(txtsenha.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");

            } else  {       
            int adicionado = pst.executeUpdate();
            if (adicionado)> 0){
            JOptionPane.showMessageDialog(null,"Usuario adicionado com sucesso");     
             txtid.setText(null);
             txtnome.setText(null);
             txtfone.setText(null);
             txtlog.setText(null);
             txtsenha.setText(null);
              
            }
          }
                ]catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); 
         
        }
        //criando medoto para alterar usuario         
        private void alterar() throws SQLException{
        String sql = "update tbusuario set usuario=?,fone=?,login=?,senha=?,perfil=? where iduser=?";    
            try {
              pst=conexao.prepareStatement(sql);
              pst.setString(1,txtnome.getText());
              pst.setString(2,txtfone.getText());
              pst.setString(3,txtlog.getText());
              pst.setString(4,txtsenha.getText());
              pst.setString(5,cboUsuPerfil.getSelectedItem().toString());
              pst.setString(6,txtid.getText());   
            if (txtid.getText().isEmpty())||(txtnome.getText().isEmpty())||(txtfone.getText().isEmpty())||(txtlog.getText().isEmpty())||(txtsenha.getText().isEmpty())) {
       
            JOptionpane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
                
            } else {
             
            //consfirmando a alteração dos dados   
             int adicionado = pst.executeUpdate();
            
             if(adicionado > 0) {
             JOptionPane.showMessageDiaalog(null,"Dados alterados com sucesso")    
             txtid.setText(null);
             txtnome.setText(null);
             txtfone.setText(null);
             txtlog.setText(null);
             txtsenha.setText(null);
                    
             }
          }
             catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);
            }
        }
        // Metodo para remoção de usuarios
            private void remover (){
            int confirma=JOptionPane.showConfirmDialog(null,"Tem certeza que deseja remover usuario");
            if (confirma==JOptionPane.YES_OPTION){
            String sql ="delete from tbususario where iduser?";
                try {
               pst=conexao.prepareStatement(sql);
               pst.setString(1,txtid.getText());
               int apagado=pst.executeUpdate();
               if(apagado>0){
               JOptionPane.showMessageDialog(null,"usuario removido com sucesso");
               txtid.setText(null);
               txtnome.setText(null);
               txtfone.setText(null);
               txtlog.setText(null);
               txtsenha.setText(null);
             
               }
                } catch (Exception e) {
                  JOptionPane.showMessageDialog(null,e)  
            
           }
                
            
            
            
    
            
            
    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    TelaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfone = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        cboUsu = new javax.swing.JComboBox();
        txtremov = new javax.swing.JButton();
        txtedit = new javax.swing.JButton();
        textadd = new javax.swing.JButton();
        textpes = new javax.swing.JButton();
        txtfone1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();

        jLabel1.setText("*Fone");

        jLabel2.setText("*Loguin");

        jLabel3.setText("*Senha");

        jLabel4.setText("*Perfil");

        jLabel5.setText("*Nome");

        jLabel6.setText("*Id");

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        cboUsu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "user" }));

        txtremov.setText("Remover");
        txtremov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtremovActionPerformed(evt);
            }
        });

        txtedit.setText("Alterar");
        txtedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteditActionPerformed(evt);
            }
        });

        textadd.setText("Adcionar");
        textadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textaddActionPerformed(evt);
            }
        });

        textpes.setText("Pesquisar");
        textpes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpesActionPerformed(evt);
            }
        });

        jLabel7.setText("*Campos obrigatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(textadd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textpes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtedit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtremov)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfone, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfone1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtremov)
                    .addComponent(txtedit)
                    .addComponent(textadd)
                    .addComponent(textpes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void textpesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpesActionPerformed
        // chamado pesquisar
            pesquisar ();
    }//GEN-LAST:event_textpesActionPerformed

    private void textaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textaddActionPerformed
       //chamando o metodo adicionar
       adicionar ();
        
    }//GEN-LAST:event_textaddActionPerformed

    private void txteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteditActionPerformed
        // chamando metodo alterar
       alterar();
    }//GEN-LAST:event_txteditActionPerformed

    private void txtremovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtremovActionPerformed
        // chamando metodo remover
        remover ();
    }//GEN-LAST:event_txtremovActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton textadd;
    private javax.swing.JButton textpes;
    private javax.swing.JButton txtedit;
    private javax.swing.JTextField txtfone;
    private javax.swing.JTextField txtfone1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnome;
    private javax.swing.JButton txtremov;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
