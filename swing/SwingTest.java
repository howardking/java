package cn.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println("Hello world In Anonymous Class");
            }
        });
        frame.setSize(200, 300);
        frame.getContentPane().add(button);
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}

//
//class MyListener implements ActionListener
//{
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        // TODO Auto-generated method stub
//        System.out.println("hello world");
//    }
//}