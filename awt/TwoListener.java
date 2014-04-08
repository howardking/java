package cn.awt;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TwoListener implements MouseListener, MouseMotionListener
{
    private Frame frame;
    private TextField textField;
    
    public void go(){
        frame = new Frame("Two Listener Example");
        frame.add(new Label("hello"), BorderLayout.NORTH);
        textField = new TextField(30);
        frame.add(textField, BorderLayout.SOUTH);
        frame.addMouseMotionListener(this);
        frame.addMouseListener(this);
        frame.addMouseListener(new MyMouseListener());
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        TwoListener two = new TwoListener();
        two.go();
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        String str = "The mouse has left the Frame";
        this.textField.setText(str);
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        String str = "x: " + e.getX() + " Y: " + e.getY();
        this.textField.setText(str);
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}

class MyMouseListener implements MouseListener
{

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        String str = "The mouse has entered the Frame";
        System.out.println(str);
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        String str = "The mouse has exit the Frame";
        System.out.println(str);
    }
    
}