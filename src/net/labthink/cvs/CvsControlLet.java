/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CvsControlLet.java
 *
 * Created on 2010-12-10, 13:11:35
 */

package net.labthink.cvs;

/**
 *
 * @author Mosliu
 */
public class CvsControlLet extends javax.swing.JPanel {

    /** Creates new form CvsControlLet */
    public CvsControlLet() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UI_TF_name = new javax.swing.JTextField();
        UI_CB_all = new javax.swing.JCheckBox();
        UI_CB_read = new javax.swing.JCheckBox();
        UI_CB_write = new javax.swing.JCheckBox();
        UI_CB_create = new javax.swing.JCheckBox();
        UI_CB_tag = new javax.swing.JCheckBox();
        UI_CB_control = new javax.swing.JCheckBox();
        UI_CB_none = new javax.swing.JCheckBox();

        UI_TF_name.setText("name   ");

        UI_CB_all.setText("All");

        UI_CB_read.setText("Read");

        UI_CB_write.setText("Write");

        UI_CB_create.setText("Tag");

        UI_CB_tag.setText("Create");

        UI_CB_control.setText("Control");

        UI_CB_none.setText("None");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UI_TF_name, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UI_CB_all)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UI_CB_read)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UI_CB_write)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UI_CB_tag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UI_CB_create)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UI_CB_control)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UI_CB_none)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(UI_TF_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(UI_CB_all)
                .addComponent(UI_CB_read)
                .addComponent(UI_CB_write)
                .addComponent(UI_CB_tag)
                .addComponent(UI_CB_create)
                .addComponent(UI_CB_control)
                .addComponent(UI_CB_none))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox UI_CB_all;
    private javax.swing.JCheckBox UI_CB_control;
    private javax.swing.JCheckBox UI_CB_create;
    private javax.swing.JCheckBox UI_CB_none;
    private javax.swing.JCheckBox UI_CB_read;
    private javax.swing.JCheckBox UI_CB_tag;
    private javax.swing.JCheckBox UI_CB_write;
    private javax.swing.JTextField UI_TF_name;
    // End of variables declaration//GEN-END:variables

}