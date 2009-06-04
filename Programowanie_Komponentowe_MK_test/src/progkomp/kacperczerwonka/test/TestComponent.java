/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package progkomp.kacperczerwonka.test;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import progkomp.kacperczerwonka.component.MultiplicationTableComponent;

/**
 *
 * @author karolrvn
 */
public class TestComponent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame ("Test komponentu");
				//MultiplicationTableComponent comp = new MultiplicationTableComponent();

				NewJPanel comp = new NewJPanel();
				frame.setLayout(new BorderLayout());
				frame.add(comp,BorderLayout.CENTER);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				//frame.setSize(400,400);
				frame.setVisible(true);
			}
		});
    }

}
