/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cezeri.gui;

import cezeri.matrix.CMatrix;
import java.awt.image.BufferedImage;
import java.util.Vector;

/**
 *
 * @author BAP1
 */
public class FrameCanvas extends javax.swing.JFrame {

    private BufferedImage img;
    int pw = 180;
    int ph = 180;
    BufferedImage currBufferedImage = null;
    private Vector<String> listImageFile = new Vector<String>();
    int listIndex = 0;
    CMatrix cm=null;

    /**
     * Creates new form FrameImage
     */
    public FrameCanvas() {
        initComponents();
//        getPicturePanel().setFrame(this);
    }

    /**
     * Draws A Picture Frame
     *
     * @param img : image to be drawn
     * @param title : Caption of the frame
     */
    public FrameCanvas(CMatrix cm, String title) {
        super(title);
        initComponents();
        this.cm=cm;
        this.img=cm.getImage();
        this.setSize(img.getWidth() + pw, img.getHeight() + ph);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        getPicturePanel().setFrame(this);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPicture = new PanelCanvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelPicture.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelPictureLayout = new javax.swing.GroupLayout(panelPicture);
        panelPicture.setLayout(panelPictureLayout);
        panelPictureLayout.setHorizontalGroup(
            panelPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        panelPictureLayout.setVerticalGroup(
            panelPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public  PanelCanvas getCanvasPanel() {
        return ((PanelCanvas) panelPicture);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPicture;
    // End of variables declaration//GEN-END:variables
}
