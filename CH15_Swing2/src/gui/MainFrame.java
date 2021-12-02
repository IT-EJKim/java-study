package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L; // 워닝 제거

	public MainFrame(String title) { // 생성자
		super(title); // 창의 이름을 넣어서 생성
		// 패널 넣기
		// 먼저 레이아웃 설정
		setLayout(new BorderLayout()); // 창에 컴퓨넌트를 붙이기 위한 레이아웃 설정
		
//		JPanel panel = new JPanel(); // 패너를 생성
//		panel.setBackground(Color.GREEN); // 페널의 녹색 설정
		
		final MainPanel mainPanel = new MainPanel();
//		mainPanel.setBackground(Color.CYAN);
		
		
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		
		add(mainPanel, BorderLayout.CENTER); // 위에서 만든 패널을 레이아웃의 가운데 붙이기
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 종료 시 프로그램 종료
		setVisible(true); // 창이 보이게하는 게 true
	}
	
}
