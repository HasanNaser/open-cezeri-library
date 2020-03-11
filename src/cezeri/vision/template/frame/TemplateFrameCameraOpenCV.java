/*
 * Just Copy the *.java to your project and set suitable package name
 */
package cezeri.vision.template.frame;

import cezeri.image_processing.ImageProcess;
import cezeri.factory.FactoryUtils;
import cezeri.vision.PanelPicture;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import org.opencv.core.Core;

/**
 *
 * @author BAP1
 */
public class TemplateFrameCameraOpenCV extends javax.swing.JFrame {

    Webcam webcam = null;
    BufferedImage bf = null;

    /**
     * Creates new form TemplateFrameImage2
     */
    public TemplateFrameCameraOpenCV() {
        initComponents();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        List<Webcam> lst = Webcam.getWebcams();
        if (lst.size() > 0) {
            ComboBoxModel model = new DefaultComboBoxModel(lst.toArray());
            combo_cam.setModel(model);
        } else {
            JOptionPane.showMessageDialog(this, "No cam was found");
        }
        jSplitPane1.setDividerLocation(1100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        panel = new PanelPicture();
        jPanel1 = new javax.swing.JPanel();
        btn_connectCam = new javax.swing.JToggleButton();
        btn_online = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        combo_cam = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btn_offline = new javax.swing.JButton();
        chk_flip = new javax.swing.JCheckBox();
        chk_isLive = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(650);

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.setPreferredSize(new java.awt.Dimension(800, 467));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(panel);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 467));

        btn_connectCam.setText("Start Camera");
        btn_connectCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_connectCamActionPerformed(evt);
            }
        });

        btn_online.setText("Online Processing");
        btn_online.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_onlineActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Camera");

        combo_cam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_cam.setPreferredSize(new java.awt.Dimension(190, 40));

        jButton1.setText("Options");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_offline.setText("Offline  Processing-1");
        btn_offline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_offlineActionPerformed(evt);
            }
        });

        chk_flip.setSelected(true);
        chk_flip.setText("flip");

        chk_isLive.setSelected(true);
        chk_isLive.setText("live");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_connectCam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_offline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_online, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_cam, 0, 195, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chk_isLive)
                        .addGap(18, 18, 18)
                        .addComponent(chk_flip)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_cam, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_flip)
                    .addComponent(chk_isLive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_connectCam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btn_online, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_offline, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_connectCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_connectCamActionPerformed
        if (btn_connectCam.isSelected()) {
            if (webcam == null) {
                webcam = Webcam.getWebcams().get(combo_cam.getSelectedIndex());
                webcam.setViewSize(WebcamResolution.VGA.getSize());
                webcam.open();
                btn_online.setEnabled(true);
                SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
                    public Void doInBackground() {
                        return getLiveVideoStream();
                    }
                };
                worker.execute();
            }
            btn_connectCam.setText("Stop Camera");
        } else {
            btn_connectCam.setText("Start Camera");
            webcam.close();
            webcam = null;
        }
    }//GEN-LAST:event_btn_connectCamActionPerformed


    private void btn_onlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_onlineActionPerformed
        if (webcam != null && chk_isLive.isSelected()) {
            SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
                public Void doInBackground() {
                    return runProcess();
                }
            };
            worker.execute();
            btn_online.setText("Stop Online Process");
        }
        if (!btn_online.isSelected()) {
            btn_online.setText("Start Online Process");
        }
    }//GEN-LAST:event_btn_onlineActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_offlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_offlineActionPerformed
        doOfflineProcessing();
    }//GEN-LAST:event_btn_offlineActionPerformed

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
            java.util.logging.Logger.getLogger(TemplateFrameCameraOpenCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemplateFrameCameraOpenCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemplateFrameCameraOpenCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemplateFrameCameraOpenCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemplateFrameCameraOpenCV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_connectCam;
    private javax.swing.JButton btn_offline;
    private javax.swing.JToggleButton btn_online;
    private javax.swing.JCheckBox chk_flip;
    private javax.swing.JCheckBox chk_isLive;
    private javax.swing.JComboBox<String> combo_cam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    private Void getLiveVideoStream() {
        bf = null;
        long t = FactoryUtils.tic();
        double fps = 0;
        while (true) {
            if (!btn_online.isSelected()) {
                if (chk_isLive.isSelected()) {
                    bf = webcam.getImage();
                    if (chk_flip.isSelected()) {
                        bf = ImageProcess.flipVertical(bf);
                    }
                    bf = ImageProcess.drawText(bf, "True FPS:" + fps, 10, 20, Color.yellow);
                    getPanel().setImage(bf);
                    fps = FactoryUtils.fps(t);
                    t = System.nanoTime();
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(TemplateFrameCameraOpenCV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private Void runProcess() {
        long t = FactoryUtils.tic();
        double fps = 0;
        while (btn_online.isSelected()) {
            bf = webcam.getImage();
            if (chk_flip.isSelected()) {
                bf = ImageProcess.flipVertical(bf);
            }
            bf = ImageProcess.toBGR(bf);

            bf = ImageProcess.rgb2hsv(bf);
            bf = ImageProcess.drawText(bf, "True FPS:" + fps, 10, 20, Color.yellow);
            getPanel().setImage(bf);
            fps = FactoryUtils.fps(t);
            t = System.nanoTime();
        }
        return null;
    }

    private void doOfflineProcessing() {
        bf = webcam.getImage();
        bf = ImageProcess.toHSVColorSpace(bf);
        getPanel().setImage(bf);
    }

    public PanelPicture getPanel() {
        return (PanelPicture) panel;
    }

}
