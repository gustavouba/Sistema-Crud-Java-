/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.telas;

import java.sql.*;
import br.com.infox.dal.ModuloConexao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
// a linha abaixo importa recursos da rs2xml.jar
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Nine
 */
public class TeleComentario extends javax.swing.JInternalFrame {
Connection conexao=null;
PreparedStatement pst=null;
ResultSet rs=null;        
    private Object txturlPesquisar;
    private Object txturl;
    private Object txtcomentario;
    private Object txtnome;
    private Object tblcomentarios;
    private Object nomecomPesquisar;
    private Object nomecom;
    /**
     * Creates new form TeleComentario
     */
    public TeleComentario() {
        iniComponents();
    conexao=ModuloConexao.conector();
    
    
    }
    private void adicionar() throws SQLException {
        String sql = "insert into tbcomentario(nomecom,urlcom,comentariocom)values(?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtnome.getText());
            pst.setString(2, txturl.getText());
            pst.setString(1, txtcomentario.getText());
            
            // validação dos campos obrigatorios
            if (txtnome.getText().isEmpty())||(txturl.getText().isEmpty())||(txtcomentario.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");

            } else  {       
            int adicionado = pst.executeUpdate();
            if (adicionado)> 0){
            JOptionPane.showMessageDialog(null,"Comentario adicionado com sucesso");     
             txtnome.setText(null);
             txturl.setText(null);
             txtcomentario.setText(null);
             
              
            }
          }
                ]catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); 
         
        }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void iniComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                
        // metodo para pesquisar clientes 
        private void pesquisar_nome
        String sql="select * from tbcomentarios where nomecom like ?"  
                  
      
    try {
        pst=conexao.prepareStatement(sql);
        pst.setString(1,nomecomPesquisar.getText()+ "%");
        rs=pst.executeQuery();
        nomecom.setModel(DbUtils.resultSetToTableModel(rs));
        
     } catch (Exception e ) {
       JOptionPane.showMessageDialog(null, e); 
                    
}
     
}        
      public void setar_campos() {
            int setar = tblcomentarios.getselectedRow();
      txtid.setText(tblcomentarios.getModel().getValueAt(setar,0).toString());
     
txtnome.setText(tblcomentarios.getModel().getValueAt(setar,1).toString());

txturl.setText(tblcomentarios.getModel().get.ValueAt(setar,2).toString); 

txtcomentario.setText(tblcomentarios.getModel().get.ValueAt(setar,3).toString);    
btnadicionar.setEnabled(False);

}        
        
        
        
        
        //criando medoto para alterar usuario         
        private void alterar() throws SQLException{
        String sql = "update tbcomentario set nomecom=?, urlcom=?,comentariocom=?, where idcom=?";    
            try {
              pst=conexao.prepareStatement(sql);
              pst.setString(1,txtnome.getText());
              pst.setString(2,txturl.getText());
              pst.setString(3,txtcomentario.getText());
              st.setString(4,txtid.getText());
      
            if (txtnome.getText().isEmpty())||(txturl.getText().isEmpty())||(txtcomentario.getText().isEmpty())) {
       
            JOptionpane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
                
            } else {
             
            //consfirmando a alteração dos dados   
             int adicionado = pst.executeUpdate();
            
             if(adicionado > 0) {
             JOptionPane.showMessageDiaalog(null,"Dados alterados com sucesso")    
             txtnome.setText(null);
             txturl.setText(null);
             txtcomentario.setText(null);
             btnadicionar.setEnabled(True);
                    
             }
          }
             catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);
            }
        }

          // Metodo para remoção de comentario de url
            private void remover (){
            int confirma=JOptionPane.showConfirmDialog(null,"Tem certeza que deseja remover comentario");
            if (confirma==JOptionPane.YES_OPTION){
            String sql ="delete from tbcomentario where  comentariocom?";
                try {
               pst=conexao.prepareStatement(sql);
               pst.setString(1,txtcomentario.getText());
               int apagado=pst.executeUpdate();
               if(apagado>0){
               JOptionPane.showMessageDialog(null,"comentario removido com sucesso");
               txtcomentario.setText(null);
               btnadicionar.setEnabled(True);
             
               }
                } catch (Exception e) {
                  JOptionPane.showMessageDialog(null,e)  
            
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
        txturl = new javax.swing.JTextField();
        txtcomentario = new javax.swing.JTextField();
        btnremover = new javax.swing.JButton();
        btnalterar = new javax.swing.JButton();
        btnadicionar = new javax.swing.JButton();
        txtpes = new javax.swing.JTextField();
        btnpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomentarios = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        jLabel1.setText("Url");

        jLabel2.setText("Comentario");

        txturl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txturlActionPerformed(evt);
            }
        });

        txtcomentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcomentarioActionPerformed(evt);
            }
        });

        btnremover.setText("Excluir");
        btnremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoverActionPerformed(evt);
            }
        });

        btnalterar.setText("Alterar");
        btnalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarActionPerformed(evt);
            }
        });

        btnadicionar.setText("Adicionar");
        btnadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicionarActionPerformed(evt);
            }
        });

        txtpes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpesKeyReleased(evt);
            }
        });

        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        tblcomentarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblcomentarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcomentariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcomentarios);

        jLabel3.setText("*");

        jLabel4.setText("*");

        jLabel5.setText("Nome");

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        jLabel6.setText("*");

        jLabel7.setText("ID Usuario");

        txtid.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnadicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnalterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnremover)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtcomentario)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtpes, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(134, 134, 134)
                                            .addComponent(btnpesquisar))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(45, 45, 45)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(117, 117, 117)))
                            .addComponent(txturl, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 204, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txturl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addComponent(txtcomentario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnremover)
                    .addComponent(btnalterar)
                    .addComponent(btnadicionar))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcomentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcomentarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcomentarioActionPerformed

    private void txturlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txturlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txturlActionPerformed

    private void btnremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoverActionPerformed
        // Chamando metodo para remover comentario
           remover();
    }//GEN-LAST:event_btnremoverActionPerformed

    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
        // alterar dados 
    }//GEN-LAST:event_btnalterarActionPerformed
         alterar ();

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void btnadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicionarActionPerformed
        // Metodo para adicionar Comentarios
         adicionar();
    }//GEN-LAST:event_btnadicionarActionPerformed

    private void txtpesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesKeyReleased
        // chamar o metodo pesquisar comentario
          pesquisar_nome();
    }//GEN-LAST:event_txtpesKeyReleased

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void tblcomentariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcomentariosMouseClicked
        // Evento para setar os campos da tabela
        setar_campos();
    }//GEN-LAST:event_tblcomentariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadicionar;
    private javax.swing.JButton btnalterar;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JButton btnremover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcomentarios;
    private javax.swing.JTextField txtcomentario;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpes;
    private javax.swing.JTextField txturl;
    // End of variables declaration//GEN-END:variables
}
