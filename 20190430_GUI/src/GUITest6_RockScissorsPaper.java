import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest6_RockScissorsPaper {
	static String[] filename = {"src/images/rock.PNG", "src/images/scissors.PNG", "src/images/paper.PNG"};
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("가위바위보 게임");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		//Component 만들자
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon(filename[0]);
		JLabel computerLabel = new JLabel(computerImage); //컴퓨터 패의 그림
		
		ImageIcon scissorsImage = new ImageIcon(filename[1]); //가위 버튼
		JButton scissorsButton = new JButton(scissorsImage);
		ImageIcon rockImage = new ImageIcon(filename[0]); //바위 버튼
		JButton rockButton = new JButton(rockImage);
		ImageIcon paperImage = new ImageIcon(filename[2]); //보 버튼
		JButton paperButton = new JButton(paperImage);
		
		
		panel.add(result); //까먹지 말고 꼭 하기 !
		panel.add(computerLabel);
		panel.add(scissorsButton);
		panel.add(rockButton);
		panel.add(paperButton);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
