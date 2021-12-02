package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class RedButtonListener implements ActionListener {
	private MainPanel mainPanel;
	public RedButtonListener(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(Color.RED);
	}
}

class BlueButtonListener implements ActionListener {
	private MainPanel mainPanel;
	public BlueButtonListener(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(Color.BLUE);
	}
	
}


public class Toolbar extends JToolBar {
	private static final long serialVersionUTD = 1L;
	
	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		// 버튼에 이벤트를 연결('클릭' 이벤트)
		redButton.addActionListener(new RedButtonListener(mainPanel));
		blueButton.addActionListener(new BlueButtonListener(mainPanel));
		
		// 툴바에 버튼을붙임
		add(redButton);
		add(blueButton);
	}
}
