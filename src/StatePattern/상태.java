/**
 * 파일명 : 상태.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package StatePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public enum 상태 {
	배고픔 {
		public 상태 행동하다(행동 행동) {
			switch (행동) {
			case 먹다:
				return 배부름;
			default:
				return null;
			}
		}
	},
	배부름 {
		public 상태 행동하다(행동 행동) {
			switch (행동) {
			case 먹다:
				return 화남;
			case 소화하다:
				return 배고픔;
			case 잠자러가다:
				return 졸림;
			default:
				return null;
			}
		}
	},
	화남{
		public 상태 행동하다(행동 행동) {
			switch (행동) {
			case 소화하다:
				return 배부름;
			default:
				return null;
			}
		}
	},
	졸림{
		public void onEntry() {
			System.out.println("이부자리깜");
		}
		public 상태 행동하다(행동 행동) {
			return null;
		}
	};
	
	abstract 상태 행동하다(행동 행동);
	
	public static 상태 get초기상태() {
		return 배고픔;
	}
	public static boolean is마지막상태(상태 상태) {
		return 상태 == 졸림;
	}
	public void onEntry(){}
	public void onExit(){}
}
