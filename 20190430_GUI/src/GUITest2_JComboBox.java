import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest2_JComboBox {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창의 이름");
		frame.setLocation(850, 300);
		frame.setPreferredSize(new Dimension(300, 200)); //사이즈 확실하게 지정 X, 필요할 때 알아서 키움
//		frame.setSize(300, 400); //사이즈를 확실하게 지정해줌
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("태어난 달 : ");
		
//		String[] picnics = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};

		JComboBox<String> cb = new JComboBox<>();
		
		for(int i = 1; i<=12; i++) {
			cb.addItem(i+"월");
		}
	
		panel.add(label);
		panel.add(cb);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
