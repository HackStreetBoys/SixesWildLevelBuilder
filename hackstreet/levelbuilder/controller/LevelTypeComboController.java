package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

/**
 * Takes in a String from the LevelEditor's JComboBox,
 * and uses it to change the kind of AbstractLevelConfig being used.
 * @author Nicholas
 */
public class LevelTypeComboController implements ActionListener{

	LevelBuilderApplication application;
	
	/**
	 * Takes in a String from the LevelEditor's JComboBox,
	 * and uses it to change the kind of AbstractLevelConfig being used.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		@SuppressWarnings("unchecked")
		JComboBox<String> combo = (JComboBox<String>)e.getSource();
        application.changeLevelConfigType((String)combo.getSelectedItem());   
	}
}
