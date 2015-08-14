/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 
 */
package StatePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 시간설정
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

