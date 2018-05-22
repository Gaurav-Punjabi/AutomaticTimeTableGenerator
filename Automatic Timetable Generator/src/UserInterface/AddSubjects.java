/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import BackEnd.MySqlConnect;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author gauravpunjabi
 */
public class AddSubjects extends javax.swing.JPanel implements Constants,FocusListener{

    /**
     * Creates new form AddSubjects
     */
    public AddSubjects() {
        initComponents();
        initDatabase();
        initTextFields();
        updateBranch();
        updateStaff();
        addListeners();
        updateProgressBar(noOfHours);
    }
    private void updateProgressBar(int noOfHours) {
        int percentage = ((noOfHours*100)/36);
        this.jProgressBar1.setValue(percentage);
    }
    private void initDatabase() {
        connection = MySqlConnect.connectDb();
        if(connection == null)
            JOptionPane.showMessageDialog(null,"Some error in initDatabase : null ");
    }
    private void addListeners() {
        this.jtfBatches.addFocusListener(this);
        this.jtfPractical.addFocusListener(this);
        this.jtfTheory.addFocusListener(this);
        this.jtfSubject.addFocusListener(this);
    }
    private void initTextFields() {
        this.jtfBatches.setText(BATCH_TEXTFIELD_PLACEHOLDER);
        this.jtfPractical.setText(PRACTICAL_TEXTFIELD_PLACEHOLDER);
        this.jtfSubject.setText(SUBJECT_TEXTFIELD_PLACEHOLDER);
        this.jtfTheory.setText(LECTURE_TEXTFIELD_PLACEHOLDER);
    }
    @Override
    public void focusGained(FocusEvent fe) {
        if(fe.getSource() == this.jtfSubject && this.jtfSubject.getText().equals(SUBJECT_TEXTFIELD_PLACEHOLDER))
            this.jtfSubject.setText("");
        else if(fe.getSource() == this.jtfTheory && this.jtfTheory.getText().equals(LECTURE_TEXTFIELD_PLACEHOLDER))
            this.jtfTheory.setText("");
        else if(fe.getSource() == this.jtfPractical && this.jtfPractical.getText().equals(PRACTICAL_TEXTFIELD_PLACEHOLDER))
            this.jtfPractical.setText("");    
        else if(fe.getSource() == this.jtfBatches && this.jtfBatches.getText().equals(BATCH_TEXTFIELD_PLACEHOLDER))
            this.jtfBatches.setText("");    
    }
    @Override
    public void focusLost(FocusEvent fe) {
        if(fe.getSource() == this.jtfSubject && jtfSubject.getText().length() == 0)
            this.jtfSubject.setText(SUBJECT_TEXTFIELD_PLACEHOLDER);
        else if(fe.getSource() == this.jtfBatches && this.jtfBatches.getText().length() == 0)
            this.jtfBatches.setText(BATCH_TEXTFIELD_PLACEHOLDER);
        else if(fe.getSource() == this.jtfTheory && this.jtfTheory.getText().length() == 0)
            this.jtfTheory.setText(LECTURE_TEXTFIELD_PLACEHOLDER);
        else if(fe.getSource() == this.jtfPractical && this.jtfPractical.getText().length() == 0)
            this.jtfPractical.setText(PRACTICAL_TEXTFIELD_PLACEHOLDER);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbngSem = new javax.swing.ButtonGroup();
        jcbYear = new javax.swing.JComboBox<>();
        jtfSubject = new javax.swing.JTextField();
        jsSubject = new javax.swing.JSeparator();
        jlYear = new javax.swing.JLabel();
        jlSubject = new javax.swing.JLabel();
        jcbStaff = new javax.swing.JComboBox<>();
        jlBranch = new javax.swing.JLabel();
        jlSemester = new javax.swing.JLabel();
        jrbEvenSem = new javax.swing.JCheckBox();
        jrbOddSem = new javax.swing.JCheckBox();
        jlTeacher = new javax.swing.JLabel();
        jtfTheory = new javax.swing.JTextField();
        jlTheory = new javax.swing.JLabel();
        jsTheory = new javax.swing.JSeparator();
        jtfPractical = new javax.swing.JTextField();
        jlPractical = new javax.swing.JLabel();
        jsPractical = new javax.swing.JSeparator();
        jtfBatches = new javax.swing.JTextField();
        jlBatcches = new javax.swing.JLabel();
        jsBatches = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jcbBranch = new javax.swing.JComboBox<>();
        jProgressBar1 = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1216, 600));
        setLayout(null);

        jcbYear.setBackground(new java.awt.Color(255, 255, 255));
        jcbYear.setFont(new java.awt.Font("Raleway", 0, 20)); // NOI18N
        jcbYear.setForeground(new java.awt.Color(236, 83, 93));
        jcbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jcbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbYearActionPerformed(evt);
            }
        });
        add(jcbYear);
        jcbYear.setBounds(190, 170, 300, 40);

        jtfSubject.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jtfSubject.setForeground(new java.awt.Color(236, 83, 93));
        jtfSubject.setText("Enter a subject : ");
        jtfSubject.setBorder(null);
        jtfSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSubjectActionPerformed(evt);
            }
        });
        add(jtfSubject);
        jtfSubject.setBounds(190, 80, 297, 42);
        add(jsSubject);
        jsSubject.setBounds(190, 120, 297, 10);

        jlYear.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jlYear.setForeground(new java.awt.Color(236, 83, 93));
        jlYear.setText("Year           : ");
        add(jlYear);
        jlYear.setBounds(10, 170, 150, 40);

        jlSubject.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jlSubject.setForeground(new java.awt.Color(236, 83, 93));
        jlSubject.setText("Subject       : ");
        add(jlSubject);
        jlSubject.setBounds(10, 90, 150, 40);

        jcbStaff.setBackground(new java.awt.Color(255, 255, 255));
        jcbStaff.setFont(new java.awt.Font("Raleway", 0, 20)); // NOI18N
        jcbStaff.setForeground(new java.awt.Color(236, 83, 93));
        jcbStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbStaffActionPerformed(evt);
            }
        });
        add(jcbStaff);
        jcbStaff.setBounds(190, 420, 300, 40);

        jlBranch.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jlBranch.setForeground(new java.awt.Color(236, 83, 93));
        jlBranch.setText("Branch       : ");
        add(jlBranch);
        jlBranch.setBounds(10, 250, 140, 40);

        jlSemester.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jlSemester.setForeground(new java.awt.Color(236, 83, 93));
        jlSemester.setText("Semester  : ");
        add(jlSemester);
        jlSemester.setBounds(10, 330, 140, 40);

        jbngSem.add(jrbEvenSem);
        jrbEvenSem.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jrbEvenSem.setForeground(new java.awt.Color(236, 83, 93));
        jrbEvenSem.setText("Even Sem");
        add(jrbEvenSem);
        jrbEvenSem.setBounds(350, 340, 150, 34);

        jbngSem.add(jrbOddSem);
        jrbOddSem.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jrbOddSem.setForeground(new java.awt.Color(236, 83, 93));
        jrbOddSem.setText("Odd Sem");
        add(jrbOddSem);
        jrbOddSem.setBounds(190, 340, 140, 34);

        jlTeacher.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jlTeacher.setForeground(new java.awt.Color(236, 83, 93));
        jlTeacher.setText("Staff           :");
        add(jlTeacher);
        jlTeacher.setBounds(10, 420, 150, 40);

        jtfTheory.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jtfTheory.setForeground(new java.awt.Color(236, 83, 93));
        jtfTheory.setText("Enter no. of lectures : ");
        jtfTheory.setBorder(null);
        jtfTheory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTheoryActionPerformed(evt);
            }
        });
        add(jtfTheory);
        jtfTheory.setBounds(830, 80, 297, 42);

        jlTheory.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jlTheory.setForeground(new java.awt.Color(236, 83, 93));
        jlTheory.setText("Theory         : ");
        add(jlTheory);
        jlTheory.setBounds(650, 90, 150, 40);
        add(jsTheory);
        jsTheory.setBounds(830, 120, 297, 10);

        jtfPractical.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jtfPractical.setForeground(new java.awt.Color(236, 83, 93));
        jtfPractical.setText("Enter no. of practicals : ");
        jtfPractical.setBorder(null);
        jtfPractical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPracticalActionPerformed(evt);
            }
        });
        add(jtfPractical);
        jtfPractical.setBounds(830, 150, 297, 42);

        jlPractical.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jlPractical.setForeground(new java.awt.Color(236, 83, 93));
        jlPractical.setText("Practical       : ");
        add(jlPractical);
        jlPractical.setBounds(650, 160, 150, 40);
        add(jsPractical);
        jsPractical.setBounds(830, 190, 297, 10);

        jtfBatches.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jtfBatches.setForeground(new java.awt.Color(236, 83, 93));
        jtfBatches.setText("Enter no. of batches : ");
        jtfBatches.setBorder(null);
        jtfBatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBatchesActionPerformed(evt);
            }
        });
        add(jtfBatches);
        jtfBatches.setBounds(830, 240, 297, 42);

        jlBatcches.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jlBatcches.setForeground(new java.awt.Color(236, 83, 93));
        jlBatcches.setText("Batches       : ");
        add(jlBatcches);
        jlBatcches.setBounds(650, 250, 150, 40);
        add(jsBatches);
        jsBatches.setBounds(830, 280, 297, 10);

        jButton1.setBackground(new java.awt.Color(236, 83, 93));
        jButton1.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.setBorder(null);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(880, 580, 140, 50);

        jButton2.setBackground(new java.awt.Color(236, 83, 93));
        jButton2.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jButton2.setBorder(null);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(1060, 580, 130, 50);

        jcbBranch.setBackground(new java.awt.Color(255, 255, 255));
        jcbBranch.setFont(new java.awt.Font("Raleway", 0, 20)); // NOI18N
        jcbBranch.setForeground(new java.awt.Color(236, 83, 93));
        jcbBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBranchActionPerformed(evt);
            }
        });
        add(jcbBranch);
        jcbBranch.setBounds(190, 250, 300, 40);

        jProgressBar1.setBackground(new java.awt.Color(236, 83, 93));
        jProgressBar1.setBorder(null);
        add(jProgressBar1);
        jProgressBar1.setBounds(-4, 0, 1210, 20);
    }// </editor-fold>//GEN-END:initComponents
    private void updateBranch() {
        try {
            jcbBranch.removeAllItems();
            String query = "SELECT name FROM department";
            resultSet = connection.createStatement().executeQuery(query);
            while(resultSet.next()) 
                jcbBranch.addItem(resultSet.getString("name"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR in updateBranch : " + e.getMessage());
        }
    }
    private void updateStaff() {
        try {
            jcbStaff.removeAllItems();
            String query = "SELECT name FROM staff";
            resultSet = connection.createStatement().executeQuery(query);
            while(resultSet.next()) 
                jcbStaff.addItem(resultSet.getString("name"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR in updateBranch : " + e.getMessage());
        }
    }
    private void addStaff() {
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO subjects(name, staff, lecture_no, practical_no, batch_no, year, deparment) VALUES (?,?,?,?,?,?,?)");
            preparedStatement.setString(1,this.jtfSubject.getText());
            preparedStatement.setString(2,(String)this.jcbStaff.getSelectedItem());
            preparedStatement.setInt(3,Integer.parseInt(this.jtfTheory.getText()));
            preparedStatement.setInt(4,Integer.parseInt(this.jtfPractical.getText()));
            preparedStatement.setInt(5,Integer.parseInt(this.jtfBatches.getText()));
            preparedStatement.setInt(6,Integer.parseInt((String)this.jcbYear.getSelectedItem()));
            preparedStatement.setString(7,(String)jcbBranch.getSelectedItem());
            preparedStatement.execute();
            this.noOfHours += Integer.parseInt(this.jtfPractical.getText()) + Integer.parseInt((this.jtfTheory.getText()));
            updateProgressBar(noOfHours);
//            JOptionPane.showMessageDialog(null,"Subject entered Sucessfully.");
        } catch (Exception e) {
        }
    }
    private void jtfSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSubjectActionPerformed

    }//GEN-LAST:event_jtfSubjectActionPerformed

    private void jcbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbYearActionPerformed

    }//GEN-LAST:event_jcbYearActionPerformed

    private void jcbStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbStaffActionPerformed

    }//GEN-LAST:event_jcbStaffActionPerformed

    private void jtfTheoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTheoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTheoryActionPerformed

    private void jtfPracticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPracticalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPracticalActionPerformed

    private void jtfBatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBatchesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBatchesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addStaff();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbBranchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        submit();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void submit() {
        if(this.noOfHours < 36) {
            JOptionPane.showMessageDialog(null, "Please enter more subjects to complete the timetable.");
            return;
        }
        JOptionPane.showMessageDialog(null,"Records entered sucessfully.");
    }
    private int noOfHours = 0;
    private Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.ButtonGroup jbngSem;
    private javax.swing.JComboBox<String> jcbBranch;
    private javax.swing.JComboBox<String> jcbStaff;
    private javax.swing.JComboBox<String> jcbYear;
    private javax.swing.JLabel jlBatcches;
    private javax.swing.JLabel jlBranch;
    private javax.swing.JLabel jlPractical;
    private javax.swing.JLabel jlSemester;
    private javax.swing.JLabel jlSubject;
    private javax.swing.JLabel jlTeacher;
    private javax.swing.JLabel jlTheory;
    private javax.swing.JLabel jlYear;
    private javax.swing.JCheckBox jrbEvenSem;
    private javax.swing.JCheckBox jrbOddSem;
    private javax.swing.JSeparator jsBatches;
    private javax.swing.JSeparator jsPractical;
    private javax.swing.JSeparator jsSubject;
    private javax.swing.JSeparator jsTheory;
    private javax.swing.JTextField jtfBatches;
    private javax.swing.JTextField jtfPractical;
    private javax.swing.JTextField jtfSubject;
    private javax.swing.JTextField jtfTheory;
    // End of variables declaration//GEN-END:variables
}
