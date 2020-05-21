/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cezeri.gui;

import cezeri.types.TFigureAttribute;
import cezeri.image_processing.ImageProcess;
import cezeri.matrix.CMatrix;
import cezeri.factory.FactoryMatrix;
import cezeri.factory.FactoryUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author BAP1
 */
public class FramePlot extends javax.swing.JFrame {

    private CMatrix cm;
    private TFigureAttribute figureAttribute;
    private boolean isSort = true;

    /**
     * Creates new form CPlot
     */

    public FramePlot(CMatrix cm) {
        this.cm = cm;
        this.setTitle(cm.name+" :: Plot");
        initComponents();
        TFigureAttribute attr=new TFigureAttribute();
        this.figureAttribute=attr;
        getPlotPanel().setFigureAttribute(attr); 
    }
    
    public FramePlot(CMatrix cm,double[] x) {
        this.cm = cm;
        this.setTitle(cm.name+" :: Plot");
        initComponents();
        TFigureAttribute attr=new TFigureAttribute();
        this.figureAttribute=attr;
        getPlotPanel().setFigureAttribute(attr); 
        getPlotPanel().setXAxis(x);
    }
    
    public FramePlot(CMatrix cm,TFigureAttribute attr) {
        this.cm = cm;
        this.figureAttribute=attr;
        this.setTitle((attr.figureCaption.isEmpty())? cm.name+" :: Plot":attr.figureCaption);
        initComponents();
        getPlotPanel().setFigureAttribute(this.figureAttribute);
    }

    public FramePlot(CMatrix cm,TFigureAttribute attr,double[] x) {
        this.cm = cm;
        this.figureAttribute=attr;
        this.setTitle((attr.figureCaption.isEmpty())? cm.name+" :: Plot":attr.figureCaption);
        initComponents();
        getPlotPanel().setFigureAttribute(this.figureAttribute);
        getPlotPanel().setXAxis(x);
    }
    
    public void setMatrix(CMatrix cm){
        this.cm = cm;
        getPlotPanel().setMatrix(cm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_plot = new cezeri.gui.PanelPlot(cm);
        jPanel2 = new javax.swing.JPanel();
        btn_dataGrid = new javax.swing.JButton();
        btn_scatter = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        txt_dpi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_plot.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panel_plotLayout = new javax.swing.GroupLayout(panel_plot);
        panel_plot.setLayout(panel_plotLayout);
        panel_plotLayout.setHorizontalGroup(
            panel_plotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_plotLayout.setVerticalGroup(
            panel_plotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_dataGrid.setText("Data Grid");
        btn_dataGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dataGridActionPerformed(evt);
            }
        });

        btn_scatter.setText("scatter");
        btn_scatter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scatterActionPerformed(evt);
            }
        });

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        txt_dpi.setText("300");

        jLabel2.setText("dpi");

        btnSort.setText("sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_dataGrid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_scatter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_dpi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
                .addComponent(btnSort)
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_dataGrid)
                .addComponent(btn_scatter)
                .addComponent(btn_save)
                .addComponent(txt_dpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(btnSort))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_plot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_plot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dataGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dataGridActionPerformed
        CMatrix cm = getPlotPanel().getMatrix();
        new FrameDataGrid(cm).setVisible(true);
    }//GEN-LAST:event_btn_dataGridActionPerformed

    private void btn_scatterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scatterActionPerformed
        TFigureAttribute attr=new TFigureAttribute();
        attr.figureCaption=this.getTitle();
        getPlotPanel().getMatrix().scatter(attr);
    }//GEN-LAST:event_btn_scatterActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        savePanel();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        sort();
    }//GEN-LAST:event_btnSortActionPerformed

    public PanelPlot getPlotPanel() {
        return (PanelPlot) panel_plot;
    }

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
            java.util.logging.Logger.getLogger(FramePlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FramePlot frm = new FramePlot(CMatrix.getInstance().rand(2, 13));
                frm.setVisible(true);
                String[] s = {"Observed", "Simulated"};
                TFigureAttribute attr=new TFigureAttribute();
                attr.items=s;
                frm.getPlotPanel().setFigureAttribute(attr);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btn_dataGrid;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_scatter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_plot;
    private javax.swing.JTextField txt_dpi;
    // End of variables declaration//GEN-END:variables

    private void savePanel() {
        PanelPlot cp = getPlotPanel();
        int dpi = Integer.parseInt(txt_dpi.getText());
        double scale = dpi / 96.0;
        cp.setSize((int) (cp.getWidth() * scale), (int) (cp.getHeight() * scale));
        File file = FactoryUtils.getFileFromChooser();
        if (file != null) {
            ImageProcess.saveGridImage(ImageProcess.getBufferedImage(getPlotPanel()), file.getAbsolutePath());
        } else {
            FactoryUtils.showMessage("kaydedilemedi CPlotFrame.savePanel()");
        }
        cp.setSize((int) (cp.getWidth() / scale), (int) (cp.getHeight() / scale));
    }


    private void sort() {
        if (isSort) {
            String sortType=FactoryUtils.inputMessage("Write sorting type [asc,desc]", "asc");
            CMatrix m2 = cm.clone(cm);
            double[][] d = m2.toDoubleArray2D();
            double[] d2 = FactoryMatrix.clone(FactoryUtils.transpose(d)[0]);
            int[] index = FactoryUtils.sortArrayAndReturnIndex(d2, sortType);
            CMatrix cmx = FactoryUtils.sortRows(m2, index);
            getPlotPanel().setMatrix(cmx);
            isSort=false;
            btnSort.setText("unsort");
            return;
        }else{
            getPlotPanel().setMatrix(cm);
            btnSort.setText("sort");
            isSort=true;
        }
    }

    public void setPlotType(String plotType) {
        getPlotPanel().setPlotType(plotType);
    }

    public void setFigureAttribute(TFigureAttribute fg) {
        this.figureAttribute=fg;
        getPlotPanel().setFigureAttribute(this.figureAttribute);
    }
}
