import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest5_ImageIcon {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		//ImageIcon, JLabel
		ImageIcon cat = new ImageIcon("src/images/cat.PNG");
		JLabel imageLabel = new JLabel(cat);
		
		//ImageIcon, JButton
		ImageIcon cat2 = new ImageIcon("src/images/cat2.PNG");
		
		//ImageIcon 크기 수정
		ImageIcon smallcat2 = new ImageIcon(cat2.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		JButton imageButton = new JButton(smallcat2);
		imageButton.setRolloverIcon(cat); //마우스를 올리면 그림이 변화
		imageButton.setPressedIcon(cat2); //마우스를 클릭하면 그림이 변화
		
		panel.add(imageLabel);
		panel.add(imageButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
