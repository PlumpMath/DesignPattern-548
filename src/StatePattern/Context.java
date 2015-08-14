/**
 * 파일명 : Context.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 
 */
package StatePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public interface Context {

    public abstract void setClock(int hour);                // 시간설정
    public abstract void changeState(State state);          // 상태전환
    public abstract void callSecurityCenter(String msg);     // 경비센터 호출
    public abstract void recordLog(String msg);            // 경비센터 기록
}

