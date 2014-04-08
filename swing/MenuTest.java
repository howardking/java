package cn.swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuTest
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("file");
        JMenu m2 = new JMenu("save");
        JMenu m3 = new JMenu("load");
        JMenu m4 = new JMenu("quit");
        
        JMenuItem item1 = new JMenuItem("New");
        JMenuItem item2 = new JMenuItem("hello");
        JMenuItem item3 = new JMenuItem("world");
        JMenuItem item4 = new JMenuItem("welcome");
        
        frame.setJMenuBar(mb);
        
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        
        m1.add(item1);
        m1.add(item2);
        m1.add(item3);
        m1.add(item4);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);
//        frame.pack();
        frame.setVisible(true);
    }
}
