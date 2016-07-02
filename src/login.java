

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author james
 */
public class login extends javax.swing.JDialog 
{
    dbConnection connection;
    main parent;
    /**
     * Creates new form login
     */
    public login(main inParent, dbConnection inConnection) {
        super(inParent,true);
        connection = inConnection;
        parent = inParent;        
        initComponents();
        setVisible(true);
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
        usernameTxtbx = new javax.swing.JTextField();
        passwordTxtbx = new javax.swing.JPasswordField();
        submitBttn = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("User Name:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Password:");

        usernameTxtbx.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        usernameTxtbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtbxActionPerformed(evt);
            }
        });
        usernameTxtbx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTxtbxKeyPressed(evt);
            }
        });

        passwordTxtbx.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        passwordTxtbx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTxtbxKeyPressed(evt);
            }
        });

        submitBttn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        submitBttn.setText("Submit");
        submitBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBttnActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(cancelButton)
                .addGap(54, 54, 54)
                .addComponent(submitBttn))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelButton)
                            .addComponent(submitBttn))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBttnActionPerformed
        String username = usernameTxtbx.getText();
        String password = new String (passwordTxtbx.getPassword());
        
        String command = "select * from users where username = \""+ username + "\"";
        ResultSet returned = connection.lookup(command);
        
        try
        {
            returned.next();
            System.out.println("Create user object");
            users myUser = new users(returned.getInt("ID"), returned.getString("username"), returned.getString("first_name"), returned.getString("last_name"), returned.getString("department_1"), returned.getString("department_2"), returned.getString("department_3"), returned.getBoolean("supervisor"), returned.getString("password"));
          
            System.out.println("Compare entered password with password in database");
            if (password.equalsIgnoreCase(myUser.getPassword()))
            {
                System.out.println("Passwords matched, send LoggedInUser function entered username");
                parent.loggedInUser(username);
                System.out.println("Check if user is a supervisor");
                if (myUser.getSupervisor())
                {
                    System.out.println("User is a supervisor");
                    parent.adminConfig();
                }
                else
                {
                    System.out.println("User isn't a supervisor");
                    parent.generalConfig();
                    userConfig(myUser.getDepartment1());
                    userConfig(myUser.getDepartment2());
                    userConfig(myUser.getDepartment3());
                }
                dispose();
            }
            else
            {
                System.out.println("Passwords didn't match");
                JOptionPane.showMessageDialog(parent,"The login details used can't be found\n Please check your details and try again");
                passwordTxtbx.setText("");
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex);
            JOptionPane.showMessageDialog(parent, "Account with supplied details couldn't be found\nPlease check details and try again");
        }
    }//GEN-LAST:event_submitBttnActionPerformed

    private void userConfig(String department)
    {
        if (department.equalsIgnoreCase("Lifeguard"))
        {
            parent.guardConfig();
        }
        else if (department.equalsIgnoreCase("LTS"))
        {
            parent.ltsConfig();
        }
        else if (department.equalsIgnoreCase("ISC"))
        {
            parent.iscConfig();
        }
    }
    
    private void usernameTxtbxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTxtbxKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            passwordTxtbx.requestFocusInWindow();
        }
    }//GEN-LAST:event_usernameTxtbxKeyPressed

    private void passwordTxtbxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtbxKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            submitBttn.doClick();
        }
    }//GEN-LAST:event_passwordTxtbxKeyPressed

    private void usernameTxtbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtbxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordTxtbx;
    private javax.swing.JButton submitBttn;
    private javax.swing.JTextField usernameTxtbx;
    // End of variables declaration//GEN-END:variables
}
