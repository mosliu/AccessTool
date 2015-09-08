/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.liuxuan.unitconverter;

import java.awt.event.ItemEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.liuxuan.utils.SwingUtils.GUIPrintStream;
import net.liuxuan.unitconverter.unitconvert.Unit;
import net.liuxuan.unitconverter.unitconvert.UnitCellRenderer;
import net.liuxuan.unitconverter.unitconvert.UnitCombleBoxModel;
import net.liuxuan.unitconverter.unitconvert.UnitConverterFactory;
import net.liuxuan.unitconverter.unitconvert.UnitType;

/**
 *
 * @author Moses
 */
public class UnitConverterUI extends javax.swing.JFrame {

    /**
     * Creates new form UnitConverter
     */
    public UnitConverterUI() {
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

        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jComboBox_From1 = new javax.swing.JComboBox();
        jButton_compute = new javax.swing.JButton();
        jComboBox_From2 = new javax.swing.JComboBox();
        jComboBox_From3 = new javax.swing.JComboBox();
        jComboBox_From4 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox_From5 = new javax.swing.JComboBox();
        jComboBox_From6 = new javax.swing.JComboBox();
        jComboBox_From7 = new javax.swing.JComboBox();
        jComboBox_From8 = new javax.swing.JComboBox();
        jFormattedTextField_inputvalue = new javax.swing.JFormattedTextField();
        jPanel8 = new javax.swing.JPanel();
        jComboBox_To1 = new javax.swing.JComboBox();
        jComboBox_To2 = new javax.swing.JComboBox();
        jComboBox_To3 = new javax.swing.JComboBox();
        jComboBox_To4 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBox_To5 = new javax.swing.JComboBox();
        jComboBox_To6 = new javax.swing.JComboBox();
        jComboBox_To7 = new javax.swing.JComboBox();
        jComboBox_To8 = new javax.swing.JComboBox();
        jPanel_output = new javax.swing.JPanel();
        jButton_emptyoutput = new javax.swing.JButton();
        jScrollPane_output = new javax.swing.JScrollPane();
        jTextArea_output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("From"));

        jComboBox_From1.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_From1.setRenderer(new UnitCellRenderer());
        jComboBox_From1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_From1ItemStateChanged(evt);
            }
        });

        jButton_compute.setText("Compute");
        jButton_compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_computeActionPerformed(evt);
            }
        });

        jComboBox_From2.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_From2.setRenderer(new UnitCellRenderer());
        jComboBox_From2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_From2ItemStateChanged(evt);
            }
        });

        jComboBox_From3.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_From3.setRenderer(new UnitCellRenderer());
        jComboBox_From3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_From3ItemStateChanged(evt);
            }
        });

        jComboBox_From4.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_From4.setRenderer(new UnitCellRenderer());
        jComboBox_From4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_From4ItemStateChanged(evt);
            }
        });

        jComboBox_From5.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_From5.setRenderer(new UnitCellRenderer());
        jComboBox_From5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_From5ItemStateChanged(evt);
            }
        });

        jComboBox_From6.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_From6.setRenderer(new UnitCellRenderer());
        jComboBox_From6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_From6ItemStateChanged(evt);
            }
        });

        jComboBox_From7.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_From7.setRenderer(new UnitCellRenderer());
        jComboBox_From7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_From7ItemStateChanged(evt);
            }
        });

        jComboBox_From8.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_From8.setRenderer(new UnitCellRenderer());
        jComboBox_From8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_From8ItemStateChanged(evt);
            }
        });

        jFormattedTextField_inputvalue.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.000000"))));
        jFormattedTextField_inputvalue.setText("1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jFormattedTextField_inputvalue, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(jButton_compute))
                    .addComponent(jComboBox_From1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_From2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_From3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_From4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_From5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_From6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_From7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_From8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox_From1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_From2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_From3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_From4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_From5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_From6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_From7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_From8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_compute)
                    .addComponent(jFormattedTextField_inputvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("To"));

        jComboBox_To1.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_To1.setRenderer(new UnitCellRenderer());

        jComboBox_To2.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_To2.setRenderer(new UnitCellRenderer());

        jComboBox_To3.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_To3.setRenderer(new UnitCellRenderer());

        jComboBox_To4.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_To4.setRenderer(new UnitCellRenderer());

        jComboBox_To5.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_To5.setRenderer(new UnitCellRenderer());

        jComboBox_To6.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_To6.setRenderer(new UnitCellRenderer());

        jComboBox_To7.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_To7.setRenderer(new UnitCellRenderer());

        jComboBox_To8.setModel(new UnitCombleBoxModel(ucf.getComboVector()));
        jComboBox_To8.setRenderer(new UnitCellRenderer());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_To1, 0, 314, Short.MAX_VALUE)
                    .addComponent(jComboBox_To2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_To3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_To4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_To5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_To6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_To7, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_To8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox_To1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_To2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_To3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_To4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_To5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_To6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_To7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_To8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel7, jPanel8});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel_output.setBorder(javax.swing.BorderFactory.createTitledBorder("信息输出区"));

        jButton_emptyoutput.setText("清空");
        jButton_emptyoutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_emptyoutputActionPerformed(evt);
            }
        });

        jTextArea_output.setColumns(20);
        jTextArea_output.setRows(5);
        jScrollPane_output.setViewportView(jTextArea_output);

        javax.swing.GroupLayout jPanel_outputLayout = new javax.swing.GroupLayout(jPanel_output);
        jPanel_output.setLayout(jPanel_outputLayout);
        jPanel_outputLayout.setHorizontalGroup(
            jPanel_outputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_outputLayout.createSequentialGroup()
                .addComponent(jScrollPane_output)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_emptyoutput)
                .addContainerGap())
        );
        jPanel_outputLayout.setVerticalGroup(
            jPanel_outputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane_output, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
            .addGroup(jPanel_outputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_emptyoutput)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_From1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_From1ItemStateChanged
        JComboBox target = jComboBox_To1;
        DoFromComboxChanged(evt, target);


//        System.out.println((state == ItemEvent.SELECTED) ? "Selected" : "Deselected");
//        System.out.println("Item: " + evt.getItem());
//        ItemSelectable is = evt.getItemSelectable();
//
//        Object selected[] = is.getSelectedObjects();
//        System.out.println(", Selected: " + ((selected.length == 0) ? "null" : ((Unit) selected[0]).getUnitName()));
    }//GEN-LAST:event_jComboBox_From1ItemStateChanged

    private void jButton_computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_computeActionPerformed



        Unit u_from1 = (Unit) jComboBox_From1.getSelectedItem();
        Unit u_from2 = (Unit) jComboBox_From2.getSelectedItem();
        Unit u_from3 = (Unit) jComboBox_From3.getSelectedItem();
        Unit u_from4 = (Unit) jComboBox_From4.getSelectedItem();
        Unit u_from5 = (Unit) jComboBox_From5.getSelectedItem();
        Unit u_from6 = (Unit) jComboBox_From6.getSelectedItem();
        Unit u_from7 = (Unit) jComboBox_From7.getSelectedItem();
        Unit u_from8 = (Unit) jComboBox_From8.getSelectedItem();
        Unit u_to1 = (Unit) jComboBox_To1.getSelectedItem();
        Unit u_to2 = (Unit) jComboBox_To2.getSelectedItem();
        Unit u_to3 = (Unit) jComboBox_To3.getSelectedItem();
        Unit u_to4 = (Unit) jComboBox_To4.getSelectedItem();
        Unit u_to5 = (Unit) jComboBox_To5.getSelectedItem();
        Unit u_to6 = (Unit) jComboBox_To6.getSelectedItem();
        Unit u_to7 = (Unit) jComboBox_To7.getSelectedItem();
        Unit u_to8 = (Unit) jComboBox_To8.getSelectedItem();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        double inputvalue = getDoubleFromjFormattedTextField(jFormattedTextField_inputvalue);
        double outputvalue = inputvalue;


        double factorefrom1to1;
        double factorefrom2to2;
        double factorefrom3to3;
        double factorefrom4to4;
        double factorefrom5to5;
        double factorefrom6to6;
        double factorefrom7to7;
        double factorefrom8to8;
        double allfactor = 1;
        sb1.append("(");
        sb2.append("(");
        if (u_from1 != null) {
            factorefrom1to1 = 1 / u_from1.computefactor(u_to1);
            allfactor *= factorefrom1to1;
            sb1.append(u_from1.getUnitNameAbbr()).append("·");
            sb2.append(u_to1.getUnitNameAbbr()).append("·");
        }
        if (u_from2 != null) {
            factorefrom2to2 = 1 / u_from2.computefactor(u_to2);
            allfactor *= factorefrom2to2;
            sb1.append(u_from2.getUnitNameAbbr()).append("·");
            sb2.append(u_to2.getUnitNameAbbr()).append("·");
        }
        if (u_from3 != null) {
            factorefrom3to3 = 1 / u_from3.computefactor(u_to3);
            allfactor *= factorefrom3to3;
            sb1.append(u_from3.getUnitNameAbbr()).append("·");
            sb2.append(u_to3.getUnitNameAbbr()).append("·");
        }
        if (u_from4 != null) {
            factorefrom4to4 = 1 / u_from4.computefactor(u_to4);
            allfactor *= factorefrom4to4;
            sb1.append(u_from4.getUnitNameAbbr()).append("·");
            sb2.append(u_to4.getUnitNameAbbr()).append("·");
        }
        sb1.append(")");
        sb2.append(")");
        if (u_from5 != null || u_from6 != null || u_from7 != null || u_from8 != null) {
            sb1.append("/(");
            sb2.append("/(");
            if (u_from5 != null) {
                factorefrom5to5 = 1 / u_from5.computefactor(u_to5);
                allfactor *= factorefrom5to5;
                sb1.append(u_from5.getUnitNameAbbr()).append("·");
                sb2.append(u_to5.getUnitNameAbbr()).append("·");
            }
            if (u_from6 != null) {
                factorefrom6to6 = 1 / u_from6.computefactor(u_to6);
                allfactor *= factorefrom6to6;
                sb1.append(u_from6.getUnitNameAbbr()).append("·");
                sb2.append(u_to6.getUnitNameAbbr()).append("·");
            }
            if (u_from7 != null) {
                factorefrom7to7 = 1 / u_from7.computefactor(u_to7);
                allfactor *= factorefrom7to7;
                sb1.append(u_from7.getUnitNameAbbr()).append("·");
                sb2.append(u_to7.getUnitNameAbbr()).append("·");
            }
            if (u_from8 != null) {
                factorefrom8to8 = 1 / u_from8.computefactor(u_to8);
                allfactor *= factorefrom8to8;
                sb1.append(u_from8.getUnitNameAbbr());
                sb2.append(u_to8.getUnitNameAbbr());
            }
            sb1.append(")");
            sb2.append(")");
        }

        String out = inputvalue + "  " + sb1.toString().replaceAll("·\\)", "\\)") + "  Equals  " + allfactor * inputvalue + "  " + sb2.toString().replaceAll("·\\)", "\\)");
        jTextArea_output.append(out);
//        System.out.println(out);


    }//GEN-LAST:event_jButton_computeActionPerformed

    private void jButton_emptyoutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_emptyoutputActionPerformed
        gpstream.clear();
        //        System.out.flush();
        //        System.out.close();
        this.jTextArea_output.setText("");
        //        System.setOut(new GUIPrintStream(System.out, ut.jTextArea_output));
    }//GEN-LAST:event_jButton_emptyoutputActionPerformed

    private void jComboBox_From2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_From2ItemStateChanged
        JComboBox target = jComboBox_To2;
        DoFromComboxChanged(evt, target);
    }//GEN-LAST:event_jComboBox_From2ItemStateChanged

    private void jComboBox_From3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_From3ItemStateChanged
        JComboBox target = jComboBox_To3;
        DoFromComboxChanged(evt, target);
    }//GEN-LAST:event_jComboBox_From3ItemStateChanged

    private void jComboBox_From4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_From4ItemStateChanged
        JComboBox target = jComboBox_To4;
        DoFromComboxChanged(evt, target);
    }//GEN-LAST:event_jComboBox_From4ItemStateChanged

    private void jComboBox_From5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_From5ItemStateChanged
        JComboBox target = jComboBox_To5;
        DoFromComboxChanged(evt, target);
    }//GEN-LAST:event_jComboBox_From5ItemStateChanged

    private void jComboBox_From6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_From6ItemStateChanged
        JComboBox target = jComboBox_To6;
        DoFromComboxChanged(evt, target);
    }//GEN-LAST:event_jComboBox_From6ItemStateChanged

    private void jComboBox_From7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_From7ItemStateChanged
        JComboBox target = jComboBox_To7;
        DoFromComboxChanged(evt, target);
    }//GEN-LAST:event_jComboBox_From7ItemStateChanged

    private void jComboBox_From8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_From8ItemStateChanged
        JComboBox target = jComboBox_To8;
        DoFromComboxChanged(evt, target);
    }//GEN-LAST:event_jComboBox_From8ItemStateChanged

    public void initOutput() {
        gpstream = new GUIPrintStream(System.out, jTextArea_output, true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UnitConverterUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UnitConverterUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UnitConverterUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UnitConverterUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UnitConverterUI ut = new UnitConverterUI();
                ut.setVisible(true);
                ut.initOutput();
                System.setOut(ut.gpstream);

//                new InfraredSimulator().setVisible(true);
            }
        });
    }
    GUIPrintStream gpstream;
    UnitConverterFactory ucf = new UnitConverterFactory();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_compute;
    private javax.swing.JButton jButton_emptyoutput;
    private javax.swing.JComboBox jComboBox_From1;
    private javax.swing.JComboBox jComboBox_From2;
    private javax.swing.JComboBox jComboBox_From3;
    private javax.swing.JComboBox jComboBox_From4;
    private javax.swing.JComboBox jComboBox_From5;
    private javax.swing.JComboBox jComboBox_From6;
    private javax.swing.JComboBox jComboBox_From7;
    private javax.swing.JComboBox jComboBox_From8;
    private javax.swing.JComboBox jComboBox_To1;
    private javax.swing.JComboBox jComboBox_To2;
    private javax.swing.JComboBox jComboBox_To3;
    private javax.swing.JComboBox jComboBox_To4;
    private javax.swing.JComboBox jComboBox_To5;
    private javax.swing.JComboBox jComboBox_To6;
    private javax.swing.JComboBox jComboBox_To7;
    private javax.swing.JComboBox jComboBox_To8;
    private javax.swing.JFormattedTextField jFormattedTextField_inputvalue;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel_output;
    private javax.swing.JScrollPane jScrollPane_output;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea_output;
    // End of variables declaration//GEN-END:variables

    private double getDoubleFromjFormattedTextField(JFormattedTextField jftf) throws NumberFormatException {
        double deltam;
        String sdeltam = jftf.getText();
        if (sdeltam == null || sdeltam.equals("")) {
            sdeltam = "0";
        }
        deltam = Double.parseDouble(sdeltam);
        return deltam;
    }

    private void DoFromComboxChanged(ItemEvent evt, JComboBox target) {
        int state = evt.getStateChange();
        Unit u = null;
        if (state == ItemEvent.SELECTED) {
            u = (Unit) evt.getItem();
        }
        UnitType ut = null;
        if (u == null) {
            //donothing
        } else {
            ut = ucf.getUnitTypeFromMap(u.getBaseName());
        }
        if (ut != null) {
            target.setModel(new UnitCombleBoxModel(ut.getConversionsVector()));
            target.setSelectedIndex(0);
        } else {
            //donothing
        }
    }
}
