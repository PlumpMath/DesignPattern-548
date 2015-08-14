/**
 * 파일명 : Border.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 
 */
package DecoratorPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public abstract class Border extends Display {
    protected Display display;          
    protected Border(Display display) { 
        this.display = display;
    }
}
