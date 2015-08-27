/**
 * 파일명 : MacroCommand.java
 * 작성일 : 2015. 8. 27.
 * 파일설명 : 
 */
package CommandPattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class MacroCommand implements Command {
	// 명령어 집합
	private Stack commands = new Stack();
	
	// 실행
	/*
	복수의 명령을 실행하기 위해서는 commands 필드에 저장되어 있는 각각의 인스턴스의 execute 메소드를 호출하면 된다. 
	이렇게 하면 자신이 저장하고 있는 복수의 Command를 모두 실행한 결과가 된다.
	*/
	public void execute() {
		Iterator it = commands.iterator();
		while(it.hasNext()) {
			((Command)it.next()).execute();
		}
	}
	
	// 추가
	/*
	append 메소드는 이 MacroCommand 클래스에 다른 Command를 추가하는 메소드
	(‘Command를 추가 한다는 것은 ‘Command를 구현(implements)하는 클래스의 인스턴스를 추개 한다는 의미) 
	이 클래스에서는 if문이 사용되고 있는데， 이것은 자기 자신(this)을 실수로 add하지 않도록 검사하고 있다. 
	그렇지 않으면 execute 메소드는 영원히 종료되지 않음. 
	여기에서 사용하고 있는 java. util.Stack 클래스의 push 메소드는 java. util.Stack 클래스의 인스턴스의 마지막에 요소를추가하는것.
	*/
	public void append(Command cmd) {
		if(cmd != this) {
			commands.push(cmd);
		}
	}
	
	// 마지막 명령 삭제
	public void undo() {
		if(!commands.empty()) {
			commands.pop();
		}
	}
	
	// 전부삭제
	public void clear() {
		commands.clear();
	}
}
