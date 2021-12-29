package member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ZipcodeFrame extends Frame implements ActionListener{

	JLabel label;
	JButton searchBtn, selectBtn;
	List list;
	TextField tf;
	JPanel p1,p2;
	MemberMgr mgr;
	DialogBox err1, err2;
	
	public ZipcodeFrame() {
		setTitle("ZipcodeFrame");
		setBounds(300,500,300,500);
		mgr = new MemberMgr();
		p1=new JPanel();
		p1.setBackground(Color.LIGHT_GRAY);
		p1.add(label = new JLabel ("동이름:",label.CENTER));
		p1.add(tf = new TextField("강남대로",15));
		p1.add(searchBtn = new JButton("검색"));
		tf.addActionListener(this);
		searchBtn.addActionListener(this); 
		//////////////////////////////////////
		list = new List();
		list.addActionListener(this);
		//////////////////////////////////////
		p2=new JPanel();
		p2.add(selectBtn = new JButton("선택"));
		selectBtn.addActionListener(this);
		p2.setBackground(Color.LIGHT_GRAY);
		///////////////////////////////////////
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		add(p1,BorderLayout.NORTH);
		add(list,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		tf.requestFocus();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트에서 소스란, 이벤트를 발생시킨 컴포넌트.
		Object obj = e.getSource();
		if(obj == searchBtn || obj == tf) {
//			System.out.println("검색");
			if(tf.getText().trim().length()==0) {
				if(err1 == null) {
					err1 = new DialogBox(this, "알림", "검색어를 입력하세요");
				} else { // 두번째부터는 기존 객체 그대로 사용
					// 보여지는 위치 조정
					err1.setLocation(this.getX()+this.getWidth()/2-(err1.getWidth()/2),
							this.getY()+this.getHeight()/2-(err1.getHeight()/2));
					err1.setVisible(true);
				}
			} else /*검색어를 입력했을 때*/ {
				list.removeAll(); // 기존에 검색결과 삭제
				Vector<ZipcodeBean> vlist= mgr.zipcodeRead(tf.getText());
				if(vlist.isEmpty()) { // 결과값이 없음
					
				}else { // 결과값이 있음
					
				}
			}
		} else if(obj == list || obj == selectBtn) {
//			System.out.println("선택");
		}
	}
	
	public static void main(String[] args) {
		new ZipcodeFrame();
	}

}









