/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_information;

import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author bigya
 */
public class Login_Form extends javax.swing.JFrame {

    /**
     * Creates new form Login_Form
     */
    public Login_Form() {
        initComponents();
        
        
        
        
        
        // center the form
        this.setLocationRelativeTo(null);
        
        // creating border line for the login_panel
        Border login_panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        login_panel.setBorder(login_panel_border);
        
        // creating a border for jlable 1 and jlable 2
         Border mini_label1_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
         mini_label1.setBorder(mini_label1_border);
        
         Border cancel_label2_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
         cancel_lable2.setBorder(cancel_label2_border);
         
         // create borderline for text field
         
         Border enter_username_field_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue);
         enter_username_field.setBorder(enter_username_field_border);
        
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        username_field = new javax.swing.JTextField();
        password_field = new javax.swing.JTextField();
        enter_username_field = new javax.swing.JTextField();
        enter_password_field = new javax.swing.JPasswordField();
        login_button = new javax.swing.JButton();
        create_new_account = new javax.swing.JLabel();
        mini_label1 = new javax.swing.JLabel();
        cancel_lable2 = new javax.swing.JLabel();
        login_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        username_field.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        username_field.setForeground(new java.awt.Color(153, 153, 153));
        username_field.setText("Username");

        password_field.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password_field.setForeground(new java.awt.Color(153, 153, 153));
        password_field.setText("Password");

        enter_username_field.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enter_username_field.setForeground(new java.awt.Color(153, 153, 153));
        enter_username_field.setText("enter username");
        enter_username_field.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enter_username_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enter_username_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enter_username_fieldFocusLost(evt);
            }
        });
        enter_username_field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enter_username_fieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enter_username_fieldMouseExited(evt);
            }
        });
        enter_username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_username_fieldActionPerformed(evt);
            }
        });

        enter_password_field.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enter_password_field.setForeground(new java.awt.Color(153, 153, 153));
        enter_password_field.setText("ashoka123");
        enter_password_field.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enter_password_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enter_password_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enter_password_fieldFocusLost(evt);
            }
        });
        enter_password_field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enter_password_fieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enter_password_fieldMouseExited(evt);
            }
        });
        enter_password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_password_fieldActionPerformed(evt);
            }
        });

        login_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login_button.setText("Login");
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_buttonMouseExited(evt);
            }
        });
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        create_new_account.setBackground(new java.awt.Color(204, 0, 0));
        create_new_account.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        create_new_account.setForeground(new java.awt.Color(153, 0, 0));
        create_new_account.setText("Create a new account");
        create_new_account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_new_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_new_accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create_new_accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create_new_accountMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username_field, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(password_field))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enter_password_field)
                    .addComponent(enter_username_field, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(create_new_account)
                .addGap(109, 109, 109))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter_username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter_password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(create_new_account)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        mini_label1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mini_label1.setText(" -");
        mini_label1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mini_label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mini_label1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mini_label1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mini_label1MouseExited(evt);
            }
        });

        cancel_lable2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancel_lable2.setText(" x");
        cancel_lable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_lable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel_lable2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel_lable2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel_lable2MouseExited(evt);
            }
        });

        login_panel.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("LOGIN PAGE");

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(mini_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel_lable2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancel_lable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mini_label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // minimize lable changes color to red when you put the cursor to enter
    private void mini_label1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mini_label1MouseEntered
        Border mini_label1_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
         mini_label1.setBorder(mini_label1_border);
         mini_label1.setForeground(Color.red);
    }//GEN-LAST:event_mini_label1MouseEntered
    // minimize lable changes colors to black when you exit
    private void mini_label1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mini_label1MouseExited
       Border mini_label1_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
       mini_label1.setBorder(mini_label1_border);
        mini_label1.setForeground(Color.black);
    }//GEN-LAST:event_mini_label1MouseExited
    // cancel lable changes color to red when you put the cursor to enter
    private void cancel_lable2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_lable2MouseEntered
        Border cancel_label2_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        cancel_lable2.setBorder(cancel_label2_border);
        cancel_lable2.setForeground(Color.red);
    }//GEN-LAST:event_cancel_lable2MouseEntered
     // minimize lable changes colors to black when you exit
    private void cancel_lable2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_lable2MouseExited
        Border cancel_label2_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        cancel_lable2.setBorder(cancel_label2_border);
        cancel_lable2.setForeground(Color.black);
    }//GEN-LAST:event_cancel_lable2MouseExited

    private void enter_username_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enter_username_fieldFocusGained
        
        // clear the textfield on focus if the text is "enter username"
        
        if(enter_username_field.getText().trim().toLowerCase().equals("enter username"))
        {
            enter_username_field.setText("");
            enter_username_field.setForeground(Color.black);
        }
        
        // set a blue border to username field
        
         Border username_field_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue);
         username_field.setBorder(username_field_border);
        
    }//GEN-LAST:event_enter_username_fieldFocusGained

    private void enter_username_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enter_username_fieldFocusLost
        
        // if the enter_username_field is equal to enter username or is empty we will set it on focus lost event
        
        if(enter_username_field.getText().trim().equals("")|| enter_username_field.getText().trim().toLowerCase().equals("enter username") )
        
        { 
            enter_username_field.setText("enter username");
            enter_username_field.setForeground(new Color(142,142,142));
               
        }
        
    }//GEN-LAST:event_enter_username_fieldFocusLost
/*
    private void enter_username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enter_username_fieldActionPerformed
*/
    private void enter_username_fieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_username_fieldMouseEntered
        
        Border enter_username_field_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        enter_username_field.setBorder(enter_username_field_border);
        enter_username_field.setForeground(Color.red);
           
    }//GEN-LAST:event_enter_username_fieldMouseEntered

    private void enter_username_fieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_username_fieldMouseExited
        
        
         Border enter_username_field_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        enter_username_field.setBorder(enter_username_field_border);
        enter_username_field.setForeground(Color.gray);
        
        
        
    }//GEN-LAST:event_enter_username_fieldMouseExited

    private void enter_password_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enter_password_fieldFocusGained
        
        // clear the password field if the texxt is "enter password"
        
       // getting the password text
       String password = String.valueOf(enter_password_field.getPassword());
        
        if(password.trim().toLowerCase().equals("enter password"))
        {
            enter_password_field.setText("");
            enter_password_field.setForeground(Color.black);
        }
        
        // set a blue border to username field
        
         Border username_field_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue);
         username_field.setBorder(username_field_border);
        
    }//GEN-LAST:event_enter_password_fieldFocusGained

    private void enter_password_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enter_password_fieldFocusLost
          
        // getting the password text
       String password = String.valueOf(enter_password_field.getPassword());
        
        if(password.trim().equals("")|| password.trim().toLowerCase().equals("enter password") )
        
        { 
            enter_password_field.setText("enter password");
            enter_password_field.setForeground(new Color(142,142,142));
               
        }
    }//GEN-LAST:event_enter_password_fieldFocusLost

    private void enter_password_fieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_password_fieldMouseEntered
        
        Border enter_password_field_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        enter_password_field.setBorder(enter_password_field_border);
        enter_password_field.setForeground(Color.red);
        
        
    }//GEN-LAST:event_enter_password_fieldMouseEntered

    private void enter_password_fieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_password_fieldMouseExited
        
        Border enter_password_field_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        enter_password_field.setBorder(enter_password_field_border);
        enter_password_field.setForeground(Color.gray);
        
    }//GEN-LAST:event_enter_password_fieldMouseExited

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_buttonActionPerformed

    private void login_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseEntered
        
       // Border login_button_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        //login_button.setBorder(login_button_border);
       // login_button.setForeground(Color.black);
        login_button.setBackground(Color.blue);
        
    }//GEN-LAST:event_login_buttonMouseEntered

    private void login_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseExited
       
       // Border login_button_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
       // login_button.setBorder(login_button_border);
       // login_button.setForeground(Color.black);
        login_button.setBackground(Color.blue);
        
    }//GEN-LAST:event_login_buttonMouseExited

    private void cancel_lable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_lable2MouseClicked
        
        System.exit(0);
        
        
        
        
        
    }//GEN-LAST:event_cancel_lable2MouseClicked

    private void mini_label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mini_label1MouseClicked
       
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_mini_label1MouseClicked

    private void enter_password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enter_password_fieldActionPerformed

    private void create_new_accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_new_accountMouseEntered
         
         Border new_account_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color (153,0,0));
         create_new_account.setBorder(new_account_border);
        
    }//GEN-LAST:event_create_new_accountMouseEntered

    private void create_new_accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_new_accountMouseExited
        
         create_new_account.setBorder(null);
    }//GEN-LAST:event_create_new_accountMouseExited

    private void create_new_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_new_accountMouseClicked
        // creating a connection to signup form
        
        Sign_Up_Form rf = new Sign_Up_Form();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        
    }//GEN-LAST:event_create_new_accountMouseClicked

    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel_lable2;
    private javax.swing.JLabel create_new_account;
    private javax.swing.JPasswordField enter_password_field;
    private javax.swing.JTextField enter_username_field;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton login_button;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel mini_label1;
    private javax.swing.JTextField password_field;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}