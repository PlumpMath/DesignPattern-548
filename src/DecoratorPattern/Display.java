/**
 * 파일명 : Display.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 
 */
package DecoratorPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public abstract class Display {
    public abstract int getColumns();               
    public abstract int getRows();                  
    public abstract String getRowText(int row);    
    public void show() {                            
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
