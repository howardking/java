package cn.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class ExGui2
{
    private Frame frame;
    private Button bn, bs, bw, be, bc;
    
    public void go(){
        frame = new Frame("Border Layout");
        bn = new Button("b1");
        bs = new Button("b2");
        bw = new Button("b3");
        be = new Button("b4");
        bc = new Button("b5");
        
        frame.add(bn, BorderLayout.NORTH);
        frame.add(bs, BorderLayout.SOUTH);
        frame.add(bw, BorderLayout.WEST);
        frame.add(be, BorderLayout.EAST);
        frame.add(bc, BorderLayout.CENTER);
        
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        ExGui2 gui = new ExGui2();
        gui.go();
    }
}
