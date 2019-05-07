import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest_JFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창의 이름");
		frame.setLocation(850, 300);
		frame.setPreferredSize(new Dimension(300, 200)); //사이즈 확실하게 지정 X, 필요할 때 알아서 키움
//		frame.setSize(300, 400); //사이즈를 확실하게 지정해줌
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("라벨이다.");
		label.setText("안녕");
//		label.setOpaque(true);
//		label.setBackground(Color.lightGray);
		
		JTextField tf = new JTextField("라벨이다22.");
		
		panel.add(label);
		panel.add(tf);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
