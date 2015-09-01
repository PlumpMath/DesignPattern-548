/**
 * 파일명 : 복잡한정보클래스.java
 * 작성일 : 2015. 8. 29.
 * 파일설명 : 
 */
package PrototypePattern;

import java.util.Date;

/**
 * @author 임승한(lim_designer@naver.com)
 */

public class 복잡한정보클래스 implements Cloneable {
	private String 복잡한정보;
	private Date 날짜;

	public 복잡한정보클래스(String 복잡한정보) {
		this.복잡한정보 = 복잡한정보;
	}
	public String get복잡한정보() {
		return 복잡한정보;
	}
	public void set날짜(Date 날짜) {
		this.날짜 = new Date(날짜.getTime());
	}
	public Date get날짜() {
		return 날짜;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		복잡한정보클래스 temp = (복잡한정보클래스) super.clone();
		return temp;
	}
}
