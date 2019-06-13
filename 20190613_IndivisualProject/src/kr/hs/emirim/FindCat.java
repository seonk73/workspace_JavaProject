package kr.hs.emirim;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FindCat {
	public static void main(String[] args) {
		JFrame frame = new JFrame("고양이를 찾아라");
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		frame.setPreferredSize(new Dimension(800, 500));
		//자 다 까먹었지? 밑 페널에 상자 3개 나오는 것부터해봐 ..
		JLabel score = new JLabel("점수 : ");
		
		ImageIcon box1 = new ImageIcon("src/image/box.PNG");
		ImageIcon box2 = new ImageIcon(box1.getImage().getScaledInstance(210, 170, Image.SCALE_DEFAULT));
		JLabel imageBox1 = new JLabel(box2);
		JLabel imageBox2 = new JLabel(box2);
		JLabel imageBox3 = new JLabel(box2);
		
		GridLayout gl = new GridLayout(2, 1);
		JPanel panel2 = new JPanel();
		panel2.setLayout(gl);
		
		frame.add(panel);
		panel.add(panel1);
		panel1.add(score);
		panel2.add(imageBox1);
		panel2.add(imageBox2);
		panel2.add(imageBox3);
		
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
