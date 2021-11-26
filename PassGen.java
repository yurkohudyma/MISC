package PassGen;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PassGen extends JFrame {
	JButton generate;
	JTextField display;
	String[] comboOptions = { "8", "16", "32", "64" };
	JComboBox combo = new JComboBox(comboOptions);

	eHandler handler = new eHandler();

	public PassGen(String s) {
		super(s);
		setLayout(new FlowLayout());
		display = new JTextField(20);
		add(combo);
		add(display);
		combo.addActionListener(handler);
		combo.setSelectedIndex(1);

	}

	static String generator(int min, int max, int size) {
		String result = "";
		for (int i = 0; i < size; i++) {
			result += String.valueOf((char) (new Random().nextInt((max - min) + 1) + min));
		} // overcoder.net
		return result;
	}

	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {

				if (e.getSource() == combo) {
				JComboBox cb = (JComboBox) e.getSource();
				String msg = (String) cb.getSelectedItem();
				switch (msg) {
				case "8":
					display.setText(generator(33, 126, 8));
					break;
				case "32":
					display.setText(generator(33, 126, 32));
					break;
				case "64":
					display.setText(generator(33, 126, 64));
					break;
				default:
					display.setText(generator(33, 126, 16));
					break;
				}
			}
		}
	}
}
