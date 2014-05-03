package Main;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Console.Console;


@SuppressWarnings("serial")
public class Test extends JPanel {

	static Console console; 
	static JFrame window;

        public Test(JFrame window1, Console console1) {
        	console = console1;
        	window = window1;
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            Test.border(g);
            
        }
        
        private static void border(Graphics g){
        	int [] windowsSize = Test.properWindowSize();
        	console.out("Drawing borders");
        	g.setColor(Color.RED);
        	g.drawLine(0, 0, windowsSize[0], 0);
        	g.drawLine(0, 0, 0, windowsSize[1]);
        	g.drawLine(0, windowsSize[1], windowsSize[0], windowsSize[1]);
        	g.drawLine(windowsSize[0], 0, windowsSize[0],  windowsSize[1]);
        }
        
        private static int[] properWindowSize(){
        	int[] temp = {(window.getWidth()-17), (window.getHeight()-39)};
        	return temp;
        }
        
        /** Returns an ImageIcon, or null if the path was invalid. */
        protected ImageIcon createImageIcon(String path,
                                                   String description) {
            java.net.URL imgURL = getClass().getResource(path);
            if (imgURL != null) {
                return new ImageIcon(imgURL, description);
            } else {
                System.err.println("Couldn't find file: " + path);
                return null;
            }
        }

    }
