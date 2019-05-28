import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.omg.CORBA.INTERNAL;

public class GUITest10_CounterButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Counter Button");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(300, 100));
		
		//JLabel, JButton
		JLabel lbNumber = new JLabel("0");
		lbNumber.setHorizontalAlignment(SwingConstants.CENTER);
		JButton btCount = new JButton("Click Counter");
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//lblNumber에서 택스트 가져와
				String input = lbNumber.getText();
				int i = Integer.parseInt(input);
				//+1
				String output = Integer.toString(i+1);
				//lbNumber에 설정해
				lbNumber.setText(output);
			}
		};
		btCount.addActionListener(listener); //*****
		
		
		GridLayout gl = new GridLayout(1, 2);
		panel.setLayout(gl);
		panel.add(lbNumber);
		panel.add(btCount);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
