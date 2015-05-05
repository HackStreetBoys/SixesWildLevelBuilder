package hackstreet.levelbuilder.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.plaf.basic.BasicTextFieldUI;
import javax.swing.text.JTextComponent;


public class TextFieldUI extends BasicTextFieldUI {

	private String hint;
	private Color color;


	public TextFieldUI(String hint, Color color) {
		this.hint = hint;
		this.color = color;
	}

	@Override
	protected void paintSafely(Graphics g) {
		super.paintSafely(g);

		JTextComponent component = getComponent();
		if(component.getText().length() == 0){
			g.setColor(color);
			int padding = (component.getHeight() - component.getFont().getSize())/2;
			g.drawString(hint, 2, component.getHeight()-padding-1);          
		}
	}
}