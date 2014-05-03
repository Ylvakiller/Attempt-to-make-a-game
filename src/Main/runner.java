package Main;
import java.awt.EventQueue;

import javax.swing.JFrame;

import Console.Console;

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
                window.add(test);
                window.setVisible(true);
                
                
            }
        });
    }
}

