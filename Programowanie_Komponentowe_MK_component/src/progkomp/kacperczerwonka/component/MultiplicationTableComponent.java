/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package progkomp.kacperczerwonka.component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author karolrvn
 */
public class MultiplicationTableComponent extends JComponent {

	private int numbersHorizontally = 10;
	private int numbersVertically = 10;



	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int margin = 7;
		int numberHeight = 26;
		int numberWidth = 26;
		g.setColor(Color.BLACK);
		g.setFont(getFont());
		int fontHeight = g.getFontMetrics().getHeight();
		for ( int x = 1; x<= getNumbersHorizontally(); ++x ) {
			//g.drawString(""+x, margin+x*numberWidth, margin+0 );
			for ( int y = 1; y<= getNumbersVertically(); ++y ) {
				g.drawString(""+x*y, margin+x*numberWidth, margin+y*numberHeight+fontHeight );
			}
		}

		// naglowki:
		g.setColor(Color.BLUE);
		for ( int x = 1; x <= getNumbersHorizontally(); ++x ) {
			g.drawString(""+x, margin+x*numberWidth, margin+0*numberHeight+fontHeight );
		}
		for ( int y = 1; y <= getNumbersVertically(); ++y ) {
			g.drawString(""+y, margin+0*numberWidth, margin+y*numberHeight+fontHeight );
		}
		g.drawString("X", margin, margin+fontHeight);
	}

	/**
	 * @return the numbersHorizontally
	 */
	public int getNumbersHorizontally() {
		return numbersHorizontally;
	}

	/**
	 * @param numbersHorizontally the numbersHorizontally to set
	 */
	public void setNumbersHorizontally(int numbersHorizontally) {
		this.numbersHorizontally = numbersHorizontally;
		repaint();
	}

	/**
	 * @return the numbersVertically
	 */
	public int getNumbersVertically() {
		return numbersVertically;
	}

	/**
	 * @param numbersVertically the numbersVertically to set
	 */
	public void setNumbersVertically(int numbersVertically) {
		this.numbersVertically = numbersVertically;
		repaint();
	}

	

}
