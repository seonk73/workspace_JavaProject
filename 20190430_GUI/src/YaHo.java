import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class YaHo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setSize(200, 300);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("아이디 : ");
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
