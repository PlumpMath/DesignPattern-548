/**
 * 파일명 : DrawCommand.java
 * 작성일 : 2015. 8. 27.
 * 파일설명 : 
 */
package CommandPattern;

import java.awt.Point;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class DrawCommand implements Command {
	// 그림 그리는 대상
	protected Drawable drawable;
	
	// 그림 그리는 위치
	private Point position;
	
	// 생성자
	public DrawCommand(Drawable drawable, Point position){
		this.drawable = drawable;
		this.position = position;
	}

	// 실행
	public void execute() {
		drawable.draw(position.x, position.y);
	}
}
