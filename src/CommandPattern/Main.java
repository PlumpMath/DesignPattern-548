/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 27.
 * 파일설명 : 
 */
package CommandPattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/*

﻿- 커맨드 패턴은 특정 객체에 대한 특정 작업 요청을 캡슐화하여 요청을 하는 객체와 그 요청을 수행하는 객체를 분리시킨다.

- 요청을 객체의 형태로 캡슐화하여 서로 요청이 다른 사용자의 매개변수와 요청 저장, 로깅, 연산의 취소를 지원하게 한다.

- 요청과 수행을 분리시켜 느슨한 결합을 유지한다.

- 일련의 행동을 특정 Receiver하고 연결을 통해 캡슐화하고 execute()라는 메소드 하나만 외부에 공개한다.

프로그래밍을 하다 보면 사용자가 선택한(또는 입력한) 명령어에 따라 그에 알맞은 처리를 해야 할 때가 있다. 
예를 들어, 워드 프로세서를 생각해보자. 사용자들은 복사(copy), 잘라내기(cut), 붙여넣기(paste) 기능을 사용한다. 이때 복사, 잘라내기, 붙여넣기 등은 모두 한 번의 명령어에 해당한다. 
사용자들은 메뉴나 툴바의 아이콘 또는 키보드 단축키를 사용함으로써 워드 프로세서에 이 명령들을 실행할 것을 요청하며, 워드 프로세서는 사용자가 전달한 명령어에 알맞은 기능을 실행한다. 
그리고 대부분의 워드 프로세서는 사용자가 실행한 명령을 취소할 수 있는 '명령 취소(undo)' 기능을 제공하고 있다. 이러한 취소 기능을 제공하기 위해서는 사용자가 실행한 명령어들을 순서대로 저장할 수 있어야 한다. 
이처럼 명령어를 실행하고, 실행한 명령어를 저장, 취소, 재실행하면서 그러한 명령어를 처리할 때 사용되는 패턴이 바로 Command Pattern(커맨드 패턴)이다.

*/

// Command 인터페이스 선언

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

	// 그림 그린 이력
	private MacroCommand history = new MacroCommand();
	// 그림 그리는 영역
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	// 제거 버튼
	private JButton clearButton = new JButton("Clear");
	
	// 생성자
	public Main(String title) {
		super(title);
		
		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(this);
		
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);
		
		pack();
		show();
	}
	
	// ActionListener용
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clearButton) {
			history.clear();
			canvas.repaint();
		}
	}

	// MouseMotionListener용
	public void mouseMoved(MouseEvent e) {}
	
	public void mouseDragged(MouseEvent e) {
		Command cmd = new DrawCommand(canvas, e.getPoint());
		history.append(cmd);
		cmd.execute();
	}
	
	// WindowListener용
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	
	public static void main(String[] args) {
		new Main("Command Pattern");
	}
	
}
