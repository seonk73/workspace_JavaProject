import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("윈도우 창");
		JLabel label = new JLabel("라벨");
		frame.add(label);
		frame.setPreferredSize(new Dimension(400, 100));
		frame.setLocation(200, 500);
		frame.pack();
		frame.setVisible(true);
		
		JFrame frame2 = new JFrame("창 2");
		frame2.pack();
		frame2.setVisible(true);
	}
}
