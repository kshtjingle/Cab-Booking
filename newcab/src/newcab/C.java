package newcab;


import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*class Customers implements Serializable{
	
	List<String> userID = new ArrayList<String>();
	
	List<String> password = new ArrayList<String>();
	
	List<Integer> location = new ArrayList<Integer>();
	
	List<Integer> isAvailable = new ArrayList<Integer>();
	
	List<Integer> wallet = new ArrayList<Integer>();
        
        List<String> contact_number = new ArrayList<String>();
        
        List<String> emailID = new ArrayList<String>();
        
	
	void addUser(String ID, String pass, int money, String contactnumber, String email_ID) {
		
		int valid = 1;
		
		for(int i = 0; i < userID.size(); i++) {
			
			if(userID.get(i) == ID) {
				
				valid = 0;
				
			}
			
		}
		
		if(valid == 1) {
			
			userID.add(ID);
			
			password.add(pass);
			
			isAvailable.add(1);
			
			wallet.add(money);
                        
                        contact_number.add(contactnumber);
                        
                        emailID.add(email_ID);
			
		}
		
		else {
			
			System.out.println("userID already exists.");
			
		}
		
		try {
			
			FileOutputStream f = new FileOutputStream(new File("Customers.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
		
			o.writeObject(this);
		
			o.close();
			f.close();
		
		}
	
		catch(Exception e) {
		
			System.out.println(e.getStackTrace());
		
		}
		
	}
	
	public String toString() {
		
		int n = userID.size();
		
		String out = "";
		
		for(int i = 0; i < n; i++) {
			
			out = out + userID.get(i) + " " + password.get(i) + " " + contact_number.get(i) + " " + emailID.get(i) + " " + isAvailable.get(i) + "\n";
			
		}
		
		return out;
		
	}
	
	void deleteUser(int i) {
		
		userID.remove(i);
		
		password.remove(i);
		
		//location.remove(i);
                contact_number.remove(i);
                
                emailID.remove(i);
		
		isAvailable.remove(i);
		
		try {
			
			FileOutputStream f = new FileOutputStream(new File("Customers.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
		
			o.writeObject(this);
		
			o.close();
			f.close();
		
		}
	
		catch(Exception e) {
		
			System.out.println(e.getStackTrace());
		
		}
		
	}

}*/
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thanooja Reddy
 */
public class C extends javax.swing.JFrame {
    
    Customers user = new Customers();
    
    /**
     * Creates new form C
     */
    public C() {
        initComponents();
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
        jTextField_userid = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jButton_login_ = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("USER ID");

        jLabel2.setText("PASSCODE");

        jButton_login_.setText("LOG IN");
        jButton_login_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_login_ActionPerformed(evt);
            }
        });

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_userid))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(66, 66, 66)
                .addComponent(jButton_login_)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_login_)
                    .addComponent(jButton1))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_login_ActionPerformed
         String user_ID = jTextField_userid.getText();
         String pass_code = jPasswordField_password.getText();
         
          try {
			
			FileInputStream fi = new FileInputStream(new File("Customers.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			user = (Customers) oi.readObject();
			
			oi.close();
			fi.close();
			
		}
		
		catch(Exception e) {
			
			System.out.println(e.getStackTrace());
			
		}
          int flag=0;
          for(int i=0;i<user.userID.size(); i++)
              
          {
              if(user_ID.equals(user.userID.get(i)) && pass_code.equals(user.password.get(i)))
              {
                  flag=1;
              }
          }
                 if(flag==1)
                 {   
                     user.current_user = user_ID;
                     new D().setVisible(true);
                     this.setVisible(false);
                     
                     
              }
              else 
              {
                  JOptionPane.showMessageDialog(null, "username or password incorrect");
              }
          
    
       try {
		
			FileOutputStream f = new FileOutputStream(new File("Customers.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
		
			o.writeObject(user);
		
			o.close();
			f.close();
		
		}
	
		catch(Exception e) {
		
			System.out.println(e.getStackTrace());
		
		}
    }
        // PreparedStatement st;
         //ResultSet rs;
       
        
        //create a select query to check if the username and the password exist in the database
       // String query = "SELECT * FROM `users` WHERE `user_name` = ? AND `password` = ?";
        
        // show a message if the username or the password fields are empty
        
      /*  for(int i=0;i<userID.size;i++)
           
        if(user_ID.trim().equals("username"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Username", "Empty Username", 2);
        }
        else if(pass_code.trim().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Password", "Empty Password", 2);
        }
        else{
            
            try {
            st = Database_Connector.getConnection().prepareStatement(query);
            
            st.setString(1, user_ID);
            st.setString(2, pass_code);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                // show a new form
                D form = new D();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                this.dispose();
                
            }else{
                // error message
                JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(C.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
    }//GEN-LAST:event_jButton_login_ActionPerformed
*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new A().setVisible(true);
       this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_login_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_userid;
    // End of variables declaration//GEN-END:variables
}
