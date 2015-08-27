/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 23.
 * 파일설명 : 
 */
package CompositePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// p.203 그림 참고
// Client(의뢰자)의 역할
public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("root 엔트리들을 만드는중...");
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");

			// root 하위폴더 생성 - ArrayList에 추가 추가
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);

			// bindir의 하위폴더로 vi와 latex 생성
			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));
			rootdir.printList();

			System.out.println("");
			System.out.println("user 엔트리들을 만드는중...");
			Directory Kim = new Directory("Kim");
			Directory Lee = new Directory("Lee");
			Directory Park = new Directory("Park");
			
			// usr 하위폴더 생성 ArrayList에 추가 추가
			usrdir.add(Kim);
			usrdir.add(Lee);
			usrdir.add(Park);
			
			Kim.add(new File("test01.html", 100));
			Kim.add(new File("test02.html", 200));
			Lee.add(new File("test01.txt", 300));
			Park.add(new File("test01.doc", 400));
			Park.add(new File("test01.java", 500));
			rootdir.printList();

		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}
