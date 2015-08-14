/**
 * 파일명 : SideBorder.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 
 */
package DecoratorPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class SideBorder extends Border {
    private char borderChar;                        
    public SideBorder(Display display, char ch) {   
        super(display);
        this.borderChar = ch;
    }
    public int getColumns() {                       
        return 1 + display.getColumns() + 1;
    }
    public int getRows() {                         
        return display.getRows();
    }
    public String getRowText(int row) {            
        return borderChar + display.getRowText(row) + borderChar;
    }
}
