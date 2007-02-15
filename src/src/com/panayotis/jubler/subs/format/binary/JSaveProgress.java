/*
 * JSaveProgress.java
 *
 * This file is part of Jubler.
 *
 * Jubler is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 2.
 *
 *
 * Jubler is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Jubler; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 */

package com.panayotis.jubler.subs.format.binary;

import java.awt.Frame;
import static com.panayotis.jubler.i18n.I18N._;

/**
 *
 * @author  teras
 */
public class JSaveProgress extends javax.swing.JDialog {
    
    /** Creates new form JSaveProgress */
    public JSaveProgress() {
        super((Frame)null, false);
        initComponents();
    }
    
    
    void start(int size) {
        setVisible(true);
        SaveBar.setMaximum(size);
        SaveBar.setValue(0);
    }
    
    void updateID(int id) {
        SaveBar.setValue(id);
    }
    
    void stop() {
        setVisible(false);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        SaveLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SaveBar = new javax.swing.JProgressBar();

        getContentPane().setLayout(new java.awt.GridLayout(2, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(_("Save progress"));
        setResizable(false);
        getContentPane().add(SaveLabel);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        SaveBar.setToolTipText(_("Save progress"));
        jPanel1.add(SaveBar, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar SaveBar;
    private javax.swing.JLabel SaveLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
}