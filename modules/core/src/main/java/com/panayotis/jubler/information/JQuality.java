/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panayotis.jubler.information;

import com.panayotis.jubler.JubFrame;
import com.panayotis.jubler.options.Options;
import static com.panayotis.jubler.options.Options.getErrorColor;
import static com.panayotis.jubler.options.Options.getFillPercent;
import static com.panayotis.jubler.options.Options.getMaxCPS;
import static com.panayotis.jubler.options.Options.getMaxDuration;
import static com.panayotis.jubler.options.Options.getMaxLineLength;
import static com.panayotis.jubler.options.Options.getMaxLines;
import static com.panayotis.jubler.options.Options.getMaxSubLength;
import static com.panayotis.jubler.options.Options.getMinDuration;
import static com.panayotis.jubler.options.Options.isCompactSubs;
import static com.panayotis.jubler.options.Options.isSpaceChars;
import com.panayotis.jubler.subs.SubEntry;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import static com.panayotis.jubler.i18n.I18N.__;
/**
 *
 * @author teras
 */
public class JQuality extends javax.swing.JDialog {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public JQuality(JubFrame parent) {
        super(parent, true);
        initComponents();
        ErrorColC.removeItemAt(0);
        ErrorColC.setSelectedIndex(getErrorColor() - 1);
        MaxLineS.setValue(getMaxLines());
        FillPercentS.setValue(getFillPercent());
        MaxLengthS.setValue(getMaxSubLength());
        MaxLengthLineS.setValue(getMaxLineLength());
        MaxCPSS.setValue(getMaxCPS());
        MaxDurS.setValue(getMaxDuration());
        MinDurS.setValue(getMinDuration());
        spaceCharsC.setSelected(isSpaceChars());
        compactC.setSelected(isCompactSubs());

        MaxLineS.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Options.setMaxLines(MaxLineS.getValue());
            }
        });
        FillPercentS.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Options.setFillPercent(FillPercentS.getValue());
            }
        });
        MaxLengthS.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Options.setMaxSubLength(MaxLengthS.getValue());
            }
        });
        MaxLengthLineS.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Options.setMaxLineLength(MaxLengthLineS.getValue());
            }
        });
        MaxCPSS.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Options.setMaxCPS(MaxCPSS.getValue());
            }
        });
        MaxDurS.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Options.setMaxDuration(MaxDurS.getValue());
            }
        });
        MinDurS.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                Options.setMinDuration(MinDurS.getValue());
            }
        });

        pack();
        setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        ErrorColL = new javax.swing.JLabel();
        ErrorColC = new javax.swing.JComboBox();
        jPanel13 = new javax.swing.JPanel();
        spaceCharsC = new javax.swing.JCheckBox();
        compactC = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        MaxCharsL = new javax.swing.JLabel();
        MaxLineS = new javax.swing.JSlider();
        jPanel21 = new javax.swing.JPanel();
        FillPercentL = new javax.swing.JLabel();
        FillPercentS = new javax.swing.JSlider();
        jPanel16 = new javax.swing.JPanel();
        MaxCharsL1 = new javax.swing.JLabel();
        MaxLengthLineS = new javax.swing.JSlider();
        jPanel19 = new javax.swing.JPanel();
        MaxCharsL4 = new javax.swing.JLabel();
        MaxLengthS = new javax.swing.JSlider();
        jPanel17 = new javax.swing.JPanel();
        MaxCharsL2 = new javax.swing.JLabel();
        MaxCPSS = new javax.swing.JSlider();
        jPanel18 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        MinCharsL = new javax.swing.JLabel();
        MinDurS = new javax.swing.JSlider();
        jPanel7 = new javax.swing.JPanel();
        MaxCharsL3 = new javax.swing.JLabel();
        MaxDurS = new javax.swing.JSlider();
        jPanel5 = new javax.swing.JPanel();
        OKB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 12, 0, 12));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, java.awt.Color.darkGray), javax.swing.BorderFactory.createEmptyBorder(0, 0, 4, 0)));
        jPanel11.setLayout(new java.awt.BorderLayout());

        ErrorColL.setText(__("Color to use"));
        ErrorColL.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 12));
        jPanel11.add(ErrorColL, java.awt.BorderLayout.WEST);

        ErrorColC.setModel(new javax.swing.DefaultComboBoxModel(SubEntry.MarkNames));
        ErrorColC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErrorColCActionPerformed(evt);
            }
        });
        jPanel11.add(ErrorColC, java.awt.BorderLayout.CENTER);

        jPanel13.setLayout(new java.awt.GridLayout());

        spaceCharsC.setText(__("Treat spaces as characters"));
        spaceCharsC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaceCharsCActionPerformed(evt);
            }
        });
        jPanel13.add(spaceCharsC);

        compactC.setSelected(true);
        compactC.setText(__("Prefer compact subtitles"));
        compactC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compactCActionPerformed(evt);
            }
        });
        jPanel13.add(compactC);

        jPanel11.add(jPanel13, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel11, java.awt.BorderLayout.NORTH);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.GridLayout(0, 1));

        jPanel15.setLayout(new java.awt.GridLayout(1, 0, 12, 0));

        jPanel14.setLayout(new java.awt.BorderLayout());

        MaxCharsL.setText(__("Maximum number of lines per subtitle"));
        jPanel14.add(MaxCharsL, java.awt.BorderLayout.NORTH);

        MaxLineS.setMajorTickSpacing(2);
        MaxLineS.setMaximum(7);
        MaxLineS.setMinimum(1);
        MaxLineS.setMinorTickSpacing(1);
        MaxLineS.setPaintLabels(true);
        MaxLineS.setPaintTicks(true);
        MaxLineS.setSnapToTicks(true);
        MaxLineS.setValue(2);
        jPanel14.add(MaxLineS, java.awt.BorderLayout.SOUTH);

        jPanel15.add(jPanel14);

        jPanel21.setLayout(new java.awt.BorderLayout());

        FillPercentL.setText(__("Line fill percentage"));
        jPanel21.add(FillPercentL, java.awt.BorderLayout.NORTH);

        FillPercentS.setMajorTickSpacing(10);
        FillPercentS.setMinorTickSpacing(1);
        FillPercentS.setPaintLabels(true);
        FillPercentS.setPaintTicks(true);
        FillPercentS.setSnapToTicks(true);
        jPanel21.add(FillPercentS, java.awt.BorderLayout.SOUTH);

        jPanel15.add(jPanel21);

        jPanel12.add(jPanel15);

        jPanel16.setLayout(new java.awt.BorderLayout());

        MaxCharsL1.setText(__("Maximum number of characters per line"));
        jPanel16.add(MaxCharsL1, java.awt.BorderLayout.NORTH);

        MaxLengthLineS.setMajorTickSpacing(10);
        MaxLengthLineS.setMinimum(10);
        MaxLengthLineS.setMinorTickSpacing(1);
        MaxLengthLineS.setPaintLabels(true);
        MaxLengthLineS.setPaintTicks(true);
        MaxLengthLineS.setSnapToTicks(true);
        MaxLengthLineS.setValue(40);
        jPanel16.add(MaxLengthLineS, java.awt.BorderLayout.SOUTH);

        jPanel12.add(jPanel16);

        jPanel19.setLayout(new java.awt.BorderLayout());

        MaxCharsL4.setText(__("Maximum number of characters per subtitle"));
        jPanel19.add(MaxCharsL4, java.awt.BorderLayout.NORTH);

        MaxLengthS.setMajorTickSpacing(10);
        MaxLengthS.setMaximum(150);
        MaxLengthS.setMinimum(10);
        MaxLengthS.setMinorTickSpacing(1);
        MaxLengthS.setPaintLabels(true);
        MaxLengthS.setPaintTicks(true);
        MaxLengthS.setSnapToTicks(true);
        MaxLengthS.setValue(40);
        jPanel19.add(MaxLengthS, java.awt.BorderLayout.SOUTH);

        jPanel12.add(jPanel19);

        jPanel17.setLayout(new java.awt.BorderLayout());

        MaxCharsL2.setText(__("Maximum number of characters per second"));
        jPanel17.add(MaxCharsL2, java.awt.BorderLayout.NORTH);

        MaxCPSS.setMajorTickSpacing(5);
        MaxCPSS.setMaximum(50);
        MaxCPSS.setMinorTickSpacing(1);
        MaxCPSS.setPaintLabels(true);
        MaxCPSS.setPaintTicks(true);
        MaxCPSS.setSnapToTicks(true);
        MaxCPSS.setValue(5);
        jPanel17.add(MaxCPSS, java.awt.BorderLayout.SOUTH);

        jPanel12.add(jPanel17);

        jPanel18.setLayout(new java.awt.GridLayout(1, 0, 12, 0));

        jPanel20.setLayout(new java.awt.BorderLayout());

        MinCharsL.setText(__("Minimum duration in seconds"));
        jPanel20.add(MinCharsL, java.awt.BorderLayout.NORTH);

        MinDurS.setMajorTickSpacing(10);
        MinDurS.setMaximum(60);
        MinDurS.setMinorTickSpacing(1);
        MinDurS.setPaintLabels(true);
        MinDurS.setPaintTicks(true);
        MinDurS.setSnapToTicks(true);
        MinDurS.setValue(40);
        jPanel20.add(MinDurS, java.awt.BorderLayout.SOUTH);

        jPanel18.add(jPanel20);

        jPanel7.setLayout(new java.awt.BorderLayout());

        MaxCharsL3.setText(__("Maximum duration in seconds"));
        jPanel7.add(MaxCharsL3, java.awt.BorderLayout.NORTH);

        MaxDurS.setMajorTickSpacing(10);
        MaxDurS.setMaximum(60);
        MaxDurS.setMinorTickSpacing(1);
        MaxDurS.setPaintLabels(true);
        MaxDurS.setPaintTicks(true);
        MaxDurS.setSnapToTicks(true);
        MaxDurS.setValue(40);
        jPanel7.add(MaxDurS, java.awt.BorderLayout.SOUTH);

        jPanel18.add(jPanel7);

        jPanel12.add(jPanel18);

        jPanel1.add(jPanel12, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        OKB.setText(__("OK"));
        OKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKBActionPerformed(evt);
            }
        });
        jPanel5.add(OKB);

        getContentPane().add(jPanel5, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKBActionPerformed
        setVisible(false);
    }//GEN-LAST:event_OKBActionPerformed

    private void ErrorColCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErrorColCActionPerformed
        Options.setErrorColor(ErrorColC.getSelectedIndex() + 1);
    }//GEN-LAST:event_ErrorColCActionPerformed

    private void spaceCharsCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceCharsCActionPerformed
        Options.setSpaceChars(spaceCharsC.isSelected());
    }//GEN-LAST:event_spaceCharsCActionPerformed

    private void compactCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compactCActionPerformed
        Options.setCompactSubs(compactC.isSelected());
    }//GEN-LAST:event_compactCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ErrorColC;
    private javax.swing.JLabel ErrorColL;
    private javax.swing.JLabel FillPercentL;
    private javax.swing.JSlider FillPercentS;
    private javax.swing.JSlider MaxCPSS;
    private javax.swing.JLabel MaxCharsL;
    private javax.swing.JLabel MaxCharsL1;
    private javax.swing.JLabel MaxCharsL2;
    private javax.swing.JLabel MaxCharsL3;
    private javax.swing.JLabel MaxCharsL4;
    private javax.swing.JSlider MaxDurS;
    private javax.swing.JSlider MaxLengthLineS;
    private javax.swing.JSlider MaxLengthS;
    private javax.swing.JSlider MaxLineS;
    private javax.swing.JLabel MinCharsL;
    private javax.swing.JSlider MinDurS;
    private javax.swing.JButton OKB;
    private javax.swing.JCheckBox compactC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JCheckBox spaceCharsC;
    // End of variables declaration//GEN-END:variables
}