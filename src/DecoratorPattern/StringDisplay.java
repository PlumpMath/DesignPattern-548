/**
 * 파일명 : StringDisplay.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 
 */
package DecoratorPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class StringDisplay extends Display {
    private String string;                         
    public StringDisplay(String string) {           
        this.string = string;
    }
    public int getColumns() {                      
        return string.getBytes().length;
    }
    public int getRows() {                         
        return 1;
    }
    public String getRowText(int row) {            
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}

