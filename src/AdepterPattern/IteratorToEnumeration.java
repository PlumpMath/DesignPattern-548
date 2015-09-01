/**
 * 파일명 : IteratorToEnumeration.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package AdepterPattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class IteratorToEnumeration implements Enumeration<String>{
	private Iterator<String> iter;
	public IteratorToEnumeration(Iterator<String> iter){
		this.iter = iter;
	}
	public boolean hasMoreElements() {
		return iter.hasNext();
	}
	public String nextElement() {
		return iter.next();
	}
}
