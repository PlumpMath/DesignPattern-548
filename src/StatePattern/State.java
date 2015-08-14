/**
 * 파일명 : State.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : State Pattern

	*정의 : 객체의 상태에 따라 동일 루틴에서 다른 행동을 하는 패턴

	*설명 :
	상태 패턴은 현재 상황에 따라 같은 일에 대해 다르게 반응을 하게 만드는 패턴이다.
	
	배가 고플 때 밥을 먹으면 배가 부른다.
	하지만 배가 부를 때 밥을 또 먹으면 배터질 것 같아 화가 난다.
	같은 행동인 "밥을 먹는 것"에 대해 현재 상태가 "배부름"인지 "배고픔"인지에 따라 행동이 달라지는 진다.
	
	*패턴 사용 및 적용 시기
	- 객체의 행위가 객체의 상태에 의존적일때
	- 객체가 run-time 시에 상태에 따라 행위를 바꿔야 할 경우
	- 객체의 상태에 대한 처리를 위해 구현하는 다중 조건 제어문이 거대해질 경우
	
	프로그램에서 복잡한 분기문이 난무해야 될 상황이라고 예상되면 State 패턴을 사용한다.
	이유는 각각의 조건분기점들을 클래스로 분리시키기 때문에 객체의 상태들을 
	다른 객체로부터 다양하게 독립적일 수 있는, 고유의 권리를 갖는 객체로서 취급할 수 있기때문이다.
	*/

package StatePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public interface State {
    public abstract void doClock(Context context, int hour);     // 시간설정
    public abstract void doUse(Context context);                // 금고사용
    public abstract void doAlarm(Context context);              // 비상벨
    public abstract void doPhone(Context context);              // 일반통화
}

