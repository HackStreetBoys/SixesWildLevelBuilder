package hackstreet.levelbuilder.gui;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class LevelManagerScreen extends AbstractScreen{
	public LevelManagerScreen(LevelBuilderApplication application) {
		
		
		
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 0, 200, 600);
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 16, 200, 600);
		panel_1.add(panel);
	}
}
