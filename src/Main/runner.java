package Main;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Console.Console;

import javax.swing.JButton;

public class runner {
	static Console console;
	static JFrame window;
    
	

    
    
    public static void main(String[] a) {
    	
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                

                console = new Console();
                console.out("testing");
	                
                
                window = new JFrame();
                window.setSize(840, 560);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Test test = new Test(window, console);
                window.getContentPane().add(test);
                test.setLayout(null);
                ImageIcon icon = test.createImageIcon("Button1.png", "just an icon");
                JButton btnTest = new JButton(icon);
                
                btnTest.setBounds(10, 11, 244, 85);
                test.add(btnTest);
                window.setVisible(true);
                
                
            }
        });
    }
    
    
}

