package cn.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestButton
{
    public static void main(String[] args) {
        Frame frame = new Frame("Test Button");
        Button button = new Button("Press me!");
        
//        增加事件处理器
        button.addActionListener(new ButtonHandler());
        button.addActionListener(new ButtonHandler());//同一个action可以增加多个ActionListener
        
        frame.add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}


class ButtonHandler implements ActionListener
{
    static int i = 0;
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String label = e.getActionCommand();
//        System.out.println(label);
        if ("Press me!".equals(label)){
            System.out.println("用户按下了该键" + ++i + "次");
        }
    }
}