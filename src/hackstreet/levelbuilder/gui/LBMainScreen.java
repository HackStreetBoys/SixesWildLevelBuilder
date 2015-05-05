package hackstreet.levelbuilder.gui;

import hackstreet.levelbuilder.controller.transport.ToEditLevelController;
import hackstreet.levelbuilder.controller.transport.ToLevelManagerController;
import hackstreet.levelbuilder.controller.transport.ToNewLevelController;

import javax.swing.JButton;


/**
 * Main Screen of LevelBuilder
 * @author Himanshu
 */

@SuppressWarnings("serial")
public class LBMainScreen extends AbstractScreen{
	public LBMainScreen(LevelBuilderApplication application) {
		
		//Inherits JLabel from LevelBuilderApplication
		super(application, "Main Screen");

		setLayout(null);

		JButton btnCreateNew = new JButton("Create New");
		btnCreateNew.setBounds(195, 150, 400, 100);
		btnCreateNew.addActionListener(new ToNewLevelController(application)); // TODO
		add(btnCreateNew);

		JButton btnEditExisting = new JButton("Edit Existing");
		btnEditExisting.setBounds(195, 260, 400, 100);
		btnEditExisting.addActionListener(new ToEditLevelController(application)); // TODO
		add(btnEditExisting);

		JButton btnLevelManagement = new JButton("Level Management");
		btnLevelManagement.setBounds(195, 370, 400, 100);
		btnLevelManagement.addActionListener(new ToLevelManagerController(application));
		add(btnLevelManagement);		  
		
	}
}
