/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Medicine.Medicine;
import Business.Medicine.MedicineDirectory;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mantr
 */
public class AlternateMedicinePage extends javax.swing.JPanel {

    /**
     * Creates new form AlternateMedicineJPanel
     */
    private MedicineDirectory med;
    private JPanel RightPaneldashboard;
    private ArrayList<Medicine> list;
    private HashSet<Medicine> hashlist;
      private UserAccount account;
   private Enterprise enterprise;
   private Pharmacy phar;
   private EcoSystem system;
 
    public AlternateMedicinePage(JPanel Rightpaneldashboard,UserAccount account,EcoSystem system) {
        initComponents();
        this.RightPaneldashboard = Rightpaneldashboard;
       this.account = account;
         this.system=system;
         phar = new Pharmacy();
       list = new ArrayList<Medicine>();
       
       
        AlternateMedicineTable.setRowSelectionAllowed(true);
        AlternateMedicineTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
     
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
        DiseaseListComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AlternateMedicineTable = new javax.swing.JTable();
        ViewDetailsBtn = new javax.swing.JButton();
        ConsultDoctorBtn = new javax.swing.JButton();
        SearchSaltOrMedicineTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setBackground(null);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search For Alternate Medicine");
        jLabel1.setAutoscrolls(true);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 130);

        jLabel2.setBackground(null);
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Disease");
        add(jLabel2);
        jLabel2.setBounds(30, 120, 102, 33);

        DiseaseListComboBox.setBackground(null);
        DiseaseListComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DiseaseListComboBox.setForeground(new java.awt.Color(0, 51, 102));
        DiseaseListComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "ColdNflu", "Malaria", "Typhoid", "Cancer" }));
        DiseaseListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiseaseListComboBoxActionPerformed(evt);
            }
        });
        add(DiseaseListComboBox);
        DiseaseListComboBox.setBounds(30, 150, 105, 40);

        jLabel3.setBackground(null);
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search By Salt or Medicine Name");
        add(jLabel3);
        jLabel3.setBounds(340, 120, 249, 33);

        AlternateMedicineTable.setAutoCreateRowSorter(true);
        AlternateMedicineTable.setBackground(new java.awt.Color(0, 51, 102));
        AlternateMedicineTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AlternateMedicineTable.setForeground(new java.awt.Color(255, 255, 255));
        AlternateMedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Medicine Name", "Salt Comp 1", "Salt comp 2", "Salt comp 3", "Price", "Disease Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AlternateMedicineTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 260, 760, 260);

        ViewDetailsBtn.setBackground(null);
        ViewDetailsBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ViewDetailsBtn.setForeground(new java.awt.Color(0, 51, 102));
        ViewDetailsBtn.setText("View Details");
        ViewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsBtnActionPerformed(evt);
            }
        });
        add(ViewDetailsBtn);
        ViewDetailsBtn.setBounds(430, 540, 160, 48);

        ConsultDoctorBtn.setBackground(null);
        ConsultDoctorBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ConsultDoctorBtn.setForeground(new java.awt.Color(0, 51, 102));
        ConsultDoctorBtn.setText("Request Pharmacist");
        ConsultDoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultDoctorBtnActionPerformed(evt);
            }
        });
        add(ConsultDoctorBtn);
        ConsultDoctorBtn.setBounds(20, 540, 170, 48);

        SearchSaltOrMedicineTxt.setBackground(null);
        SearchSaltOrMedicineTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchSaltOrMedicineTxt.setForeground(new java.awt.Color(0, 51, 102));
        SearchSaltOrMedicineTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSaltOrMedicineTxtActionPerformed(evt);
            }
        });
        add(SearchSaltOrMedicineTxt);
        SearchSaltOrMedicineTxt.setBounds(340, 150, 249, 40);

        jButton1.setBackground(null);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(620, 150, 120, 40);

        jButton2.setBackground(null);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Consult Doctor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(620, 540, 160, 48);

        jButton3.setBackground(null);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 102));
        jButton3.setText("Save list of Alternatives");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(210, 540, 200, 48);

        jLabel4.setBackground(null);
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("                      Please select the rows of Alternative Medicines you searched for and Save the list!");
        add(jLabel4);
        jLabel4.setBounds(10, 210, 680, 17);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PatientRole/back.jpg"))); // NOI18N
        jLabel5.setAutoscrolls(true);
        add(jLabel5);
        jLabel5.setBounds(-10, -10, 1120, 1050);
    }// </editor-fold>//GEN-END:initComponents
    

    
    private void ConsultDoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultDoctorBtnActionPerformed
        // TODO add your handling code here:
//        ConsultDoctorPage consult = new ConsultDoctorPage(RightPaneldashboard, list,account,enterprise);
//        RightPaneldashboard.add("ViewProductDetailJPanelSupplier", consult);
//        CardLayout layout = (CardLayout)RightPaneldashboard.getLayout();
//        layout.next(RightPaneldashboard);
        
        RequestMedicinesJPanel pmed = new RequestMedicinesJPanel(RightPaneldashboard,account,system);
        RightPaneldashboard.add("ViewProductDetailJPanelSupplier", pmed);
        CardLayout layout1 = (CardLayout)RightPaneldashboard.getLayout();
        layout1.next(RightPaneldashboard);
    }//GEN-LAST:event_ConsultDoctorBtnActionPerformed

    private void SearchSaltOrMedicineTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSaltOrMedicineTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchSaltOrMedicineTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    
        
         DefaultTableModel model = (DefaultTableModel) AlternateMedicineTable.getModel();
        String medname = SearchSaltOrMedicineTxt.getText();
        String disease = (String) DiseaseListComboBox.getSelectedItem();
        model.setRowCount(0);
        
         for(Medicine medi : med.getMedicineList()){
             if(medname.equals(medi.getSaltname())||(medname.equals(medi.getSaltComposition1())||(medname.equals(medi.getSaltComposition2())||(medname.equals(medi.getSaltComposition3()))))){
                 if(disease.equals(medi.getDisease()))
             {
                Object[] row = new Object[7];
                row[0]=medi.getBrand();
            row[1] = medi;
            row[2] = medi.getSaltComposition1();
            row[3]= medi.getSaltComposition2();
            row[4]=medi.getSaltComposition3();
            row[5] = medi.getPrice();
           
            row[6]=medi.getDisease();
      
            list.add(medi);
            model.addRow(row);
             }
             }
         }
//        int productId = Integer.parseInt(idField.getText());
//        product = supplier.getProductCatalog().searchProduct(productId);
//        ViewProductDetailJPanel vpdjp = new ViewProductDetailJPanel(userProcessContainer, product);
//        userProcessContainer.add("ViewProductDetailJPanelSupplier", vpdjp);
//        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DiseaseListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiseaseListComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiseaseListComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ConsultDoctorPage consult = new ConsultDoctorPage(RightPaneldashboard, hashlist,account,enterprise,system);
        RightPaneldashboard.add("ViewProductDetailJPanelSupplier", consult);
        CardLayout layout = (CardLayout)RightPaneldashboard.getLayout();
        layout.next(RightPaneldashboard);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ViewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        int row = AlternateMedicineTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Medicine s = (Medicine)AlternateMedicineTable.getValueAt(row, 1);
        
        ViewMedicineDetailsPage vs = new ViewMedicineDetailsPage(RightPaneldashboard, s);
        RightPaneldashboard.add("ViewSupplier", vs);
        CardLayout layout = (CardLayout)RightPaneldashboard.getLayout();
        layout.next(RightPaneldashboard);
    }                                              

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO adald your handling code here:
        list.clear();
          int[] selectedrows = AlternateMedicineTable.getSelectedRows();
        if (selectedrows.length != -1) {
          
            
            for (int i = 0; i < selectedrows.length; i++)
            {
                
               Medicine m= (Medicine) AlternateMedicineTable.getValueAt(selectedrows[i], 1);
               list.add(m);
                
                
            }
            JOptionPane.showMessageDialog(null, "List is saved!!");
        } else {
             JOptionPane.showMessageDialog(null, "Please select a row");
        }
       hashlist = new HashSet<Medicine>(list);
      
    }//GEN-LAST:event_jButton3ActionPerformed

                                                  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AlternateMedicineTable;
    private javax.swing.JButton ConsultDoctorBtn;
    private javax.swing.JComboBox DiseaseListComboBox;
    private javax.swing.JTextField SearchSaltOrMedicineTxt;
    private javax.swing.JButton ViewDetailsBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
