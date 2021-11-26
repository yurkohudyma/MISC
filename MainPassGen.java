package PassGen;


import javax.swing.JFrame;

public class MainPassGen {

	public static void main(String[] args) {
		PassGen r = new PassGen("Hudyma PassGen 1.0");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(310,75);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}

}
