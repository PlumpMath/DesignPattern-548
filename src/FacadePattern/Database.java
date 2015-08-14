/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 4.
 * 파일설명 : 
 */
package FacadePattern;


/**
 * @author 임승한(lim_designer@naver.com)
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
	// new에서 인스턴스를 생성시키지 않기 위한 private 선언
	private Database() {
	}

	// getProperties라는 static 메소드를 매개로 Properties의 인스턴스를 얻음
	// dbname에서 Properties를 얻음
	public static Properties getProperties(String dbname) {
		
		// src/maildata.txt
		String filename = dbname + ".txt";
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream(filename));
		} catch (IOException e) {
			System.out.println("Warning: " + filename + " is not found.");
		}
		
		// maildata.txt으로부터 읽은 내용 return
		return prop;
		
	}
}
