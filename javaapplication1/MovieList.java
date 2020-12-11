/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author Acer
 */
public class MovieList extends javax.swing.JFrame {

    
    public static String currentUser;
    public boolean update = false;
    public String selmov;
    
    public MovieList() {
        initComponents();
        
        String USERNAME = "Blanc";
        String PASSWORD = "shiro";
        String url =
            "jdbc:mysql://localhost:3306/TA";
        try{
            Connection connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
            Statement st = (Statement) connection.createStatement();
            ResultSet rs = st.executeQuery("select * from users");
            
            int x = 0;
                    
            while(rs.next()){
                x++;
            }
            
            //rs.beforeFirst();
            String [] username = new String[x];
            //System.out.println("Koko ni iru yo");
            //System.out.print(x);

            ResultSet qs = st.executeQuery("select * from users");            
            while(qs.next()){
                String user = qs.getString("username");
                username[qs.getRow()-1] = user;
            }
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(username));

            
            ResultSet bs = st.executeQuery("select * from movies");
            x=0;
            while(bs.next()){
                x++;
            }
            String [] movie = new String[x];
            
            ResultSet cs = st.executeQuery("select * from movies");
            while(cs.next()){
                String mov = cs.getString("title");
                movie[cs.getRow()-1] = mov;
            }
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(movie));
        }catch(SQLException e){
            System.err.println(e);
        }
        


    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Don't see a movie?");

        jLabel2.setText("Add one yourself!");

        jButton1.setText("Add Movie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setText("Reviews");

        jLabel4.setText("Rating:");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Chihaya Jyun", 1, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Stars");

        jLabel6.setText("User Comment:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new AddMovie().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Double rating;
        String comment;
        
        try{  //checking if the comment area is empty
            comment = jTextArea1.getText();
            if(comment.isEmpty()){
                throw new Exception("ded");
            }
            
            
            try{
                //checking rating format
                rating = Double.parseDouble(jTextField1.getText());
                if(jTextField1.getText().length()>3){
                    rating = Double.parseDouble(jTextField1.getText().substring(0, 3));
                }
                if(rating > 5){
                    rating = Double.valueOf(5);
                }else if(rating < 1){
                    rating = Double.valueOf(1);
                }
                
                //writing to the database
                String USERNAME = "Blanc";
                String PASSWORD = "shiro";
                String url =
                    "jdbc:mysql://localhost:3306/TA";
                try{
                    Connection connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
                    Statement st = (Statement) connection.createStatement();
                    
                    if(this.update){
                        PreparedStatement updt = connection.prepareStatement("Update reviews set rating = ?, description = ? where username = ? and movie = ? ");
                        updt.setDouble(1, rating);
                        updt.setString(2, comment);
                        updt.setString(3, MovieList.currentUser);
                        updt.setString(4, this.selmov);
                        updt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Data Successfully updated");
                    }else{
                        PreparedStatement inst = connection.prepareStatement("Insert into reviews values(?,?,?,?)");
                        inst.setString(1, this.selmov);
                        inst.setDouble(2, rating);
                        inst.setString(3, comment);
                        inst.setString(4, MovieList.currentUser);
                        inst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Data Successfully inserted");
                    }
                }catch(SQLException e){
                    System.out.println(e);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please only input numbers from 1 to 5 on the rating box");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please do not leave the comment empty");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                   
        String USERNAME = "Blanc";
        String PASSWORD = "shiro";
        String url =
            "jdbc:mysql://localhost:3306/TA";
        try{
//            System.out.print(MovieList.currentUser);
            Connection connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
            Statement st = (Statement) connection.createStatement();
            
            ResultSet bs = st.executeQuery("Select * from movies");
            while(bs.next()){
                if(bs.getString("title").equals(jComboBox2.getSelectedItem())){
                    this.selmov = bs.getString("title");
                }
            }
            
            
            ResultSet rs = st.executeQuery("select * from reviews");
            boolean ae = false;
            while(rs.next()){
                String username = rs.getString("username");
                String movie = rs.getString("movie");
                
                if(username.equals(jComboBox1.getSelectedItem()) && movie.equals(jComboBox2.getSelectedItem())){
                    String comment = rs.getString("description");
                    Double rating = rs.getDouble("rating");
                    jTextField1.setText(String.valueOf(rating));
                    jTextArea1.setText(comment);
                    this.update = true;
                    
                    ae = true;
                    
                    if(username.equals(MovieList.currentUser)){
                        jTextField1.setEditable(true);
                        jTextArea1.setEditable(true);
                    }
                    else{
                        jTextField1.setEditable(false);
                        jTextArea1.setEditable(false);
                    }
                }
            }
            if(!ae){
                this.update = false;
                if(jComboBox1.getSelectedItem().equals(MovieList.currentUser)){
                    jTextField1.setEditable(true);
                    jTextArea1.setEditable(true);
                }else{
                    jTextField1.setEditable(false);
                    jTextArea1.setEditable(false);
                }
                jTextField1.setText("");
                jTextArea1.setText("");
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MovieList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
