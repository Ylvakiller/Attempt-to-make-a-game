import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Console.Console;

public class runner {
	static JFrame window;
	static Console console;

    @SuppressWarnings("serial")
	public static class Test extends JPanel {

        

        public Test() {
            
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            Test.border(g);
            
        }
        
        private static void border(Graphics g){
        	int [] windowsSize = Test.properWindowSize();
        	g.setColor(Color.RED);
        	g.drawLine(0, 0, windowsSize[0], 0);
        	console.out("window.getWidth returns : " +  window.getWidth());
        	console.out("window.getHeight returns : " +  (window.getHeight()-39));
        	g.drawLine(0, 0, 0, windowsSize[1]);
        	g.drawLine(0, windowsSize[1], windowsSize[0], windowsSize[1]);
        	g.drawLine(windowsSize[0], 0, windowsSize[0],  windowsSize[1]);
        }
        
        private static int[] properWindowSize(){
        	int[] temp = {(window.getWidth()-17), (window.getHeight()-39)};
        	return temp;
        }

    }

    
    
    public static void main(String[] a) {
    	
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                

                console = new Console();
                console.out("testing");
	                
                Test test = new Test();
                window = new JFrame();
                window.setSize(840, 560);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.add(test);
                window.setVisible(true);
                
                
            }
        });
    }
}

