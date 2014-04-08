package cn.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

public class MyFrame2
{
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame2");
        Button button = new Button("click me");
        
        button.addActionListener(new MyListener());
        frame.addWindowListener(new MyWindowListener());
        
        frame.add(button);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}

class MyListener implements ActionListener
{
    @Override
    @SuppressWarnings("deprecation")
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        long millsec = e.getWhen();
        Date date = new Date(millsec);
        System.out.println(date.toLocaleString());
    }
}

class MyWindowListener implements WindowListener
{

    /* (non-Javadoc)
     * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
     */
    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
     */
    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("关闭窗口");
        System.exit(0);
    }

    /* (non-Javadoc)
     * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
     */
    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
     */
    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
     */
    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
     */
    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
     */
    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}