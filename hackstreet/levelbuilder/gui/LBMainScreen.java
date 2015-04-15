package hackstreet.levelbuilder.gui;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class LBMainScreen extends AbstractScreen{
	public LBMainScreen(LevelBuilderApplication application) {
		
		//Inherits JLabel from LevelBuilderApplication
		super(application, "Main Screen");

		setLayout(null);

		JButton btnCreateNew = new JButton("Create New");
		btnCreateNew.setBounds(195, 150, 400, 100);
		add(btnCreateNew);

		JButton btnEditExisting = new JButton("Edit Existing");
		btnEditExisting.setBounds(195, 260, 400, 100);
		add(btnEditExisting);

		JButton btnLevelManagement = new JButton("Level Management");
		btnLevelManagement.setBounds(195, 370, 400, 100);
		add(btnLevelManagement);
	}
}
