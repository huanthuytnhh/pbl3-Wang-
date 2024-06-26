/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.dashboard.admin_dashboard;

import controller.dashboard_controller.admin_dashboard_controller.MealController;
import java.sql.SQLException;

/**
 *
 * @author huant
 */
public class MealPanel extends javax.swing.JPanel {

    /**
     * Creates new form MealPanel
     */
    public MealPanel() throws SQLException, ClassNotFoundException {
        initComponents();
        MealController controller = new MealController(viewPanel,menuComboBox,addMenuButton,removeMenuButton, addDishButton, deleteButton,dayComboBox,saveButton , foodNameTextField,mealPhotoLabel,choosePhotoButton);
        controller.setComboBox();
        controller.setDataToTable();
        controller.setEvent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewPanel = new javax.swing.JPanel();
        menuComboBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        mealPhotoLabel = new javax.swing.JLabel();
        addDishButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        foodNameTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        addMenuButton = new javax.swing.JButton();
        choosePhotoButton = new javax.swing.JButton();
        dayComboBox = new javax.swing.JComboBox<>();
        removeMenuButton = new javax.swing.JButton();

        viewPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        menuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));

        mealPhotoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mealPhotoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mealPhotoLabel.setText("Meal photo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mealPhotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mealPhotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        addDishButton.setBackground(new java.awt.Color(0, 153, 0));
        addDishButton.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        addDishButton.setForeground(new java.awt.Color(255, 255, 255));
        addDishButton.setText("Add Dishes");
        addDishButton.setBorder(null);

        deleteButton.setBackground(new java.awt.Color(255, 0, 0));
        deleteButton.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete Dishes");
        deleteButton.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Food name :");

        saveButton.setBackground(new java.awt.Color(153, 153, 153));
        saveButton.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.setBorder(null);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        addMenuButton.setBackground(new java.awt.Color(0, 51, 255));
        addMenuButton.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        addMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        addMenuButton.setText("New Menu");
        addMenuButton.setBorder(null);

        choosePhotoButton.setBackground(new java.awt.Color(51, 204, 0));
        choosePhotoButton.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        choosePhotoButton.setForeground(new java.awt.Color(255, 255, 255));
        choosePhotoButton.setText("Choose photo");
        choosePhotoButton.setBorder(null);

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NULL", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));

        removeMenuButton.setBackground(new java.awt.Color(255, 0, 51));
        removeMenuButton.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        removeMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        removeMenuButton.setText("Remove Menu");
        removeMenuButton.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(menuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(addMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addDishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(foodNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(choosePhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(foodNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(choosePhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(235, 235, 235))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDishButton;
    private javax.swing.JButton addMenuButton;
    private javax.swing.JButton choosePhotoButton;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField foodNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mealPhotoLabel;
    private javax.swing.JComboBox<String> menuComboBox;
    private javax.swing.JButton removeMenuButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables
}
