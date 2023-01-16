import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frames extends JFrame {

	public frames() {

		JFrame x = new JFrame();
		JPanel y = new JPanel();
		x.setTitle("My Gui");
		x.setSize(200, 300);
		JLabel label = new JLabel("Descrip");
		JLabel label2 = new JLabel("amount");
		y.add(label);
		JTextField tfName = new JTextField("....", 15);
		y.add(tfName);
		y.add(label2);
		JTextField beitrag = new JTextField("Beitrag", 15);
		y.add(beitrag);
		tfName.setForeground(Color.BLUE);
		// Hintergrundfarbe wird gesetzt
		tfName.setBackground(Color.YELLOW);
		// Textfeld wird unserem Panel hinzugefügt

		JButton buttonOK = new JButton("OK");
		y.add(buttonOK);

		buttonOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = tfName.getText();
				DatabaseExample.addToTabel(text);
			}
		});

		x.add(y);
		x.setVisible(true);
	}
}
