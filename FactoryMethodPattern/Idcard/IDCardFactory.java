/**
 * 파일명 : IDCardFactory.java
 * 작성일 : 2015. 8. 11.
 * 파일설명 : 메서드 createProduct, registerProduct를 구현하고 있는 클래스
 */
package Idcard;

import java.util.ArrayList;
import java.util.List;

import Framework.Factory;
import Framework.Product;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class IDCardFactory extends Factory {
	
	private List owners = new ArrayList();
	
	// overriding
	protected Product createProduct(String owner) {
		// ???
		return new IDCard(owner);
	}
	public List getOwners() {
		return owners;
	}
	
}
