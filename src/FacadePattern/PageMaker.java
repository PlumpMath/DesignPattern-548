/**
 * 파일명 : PageMaker.java
 * 작성일 : 2015. 8. 4.
 * 파일설명 : 
 */
package FacadePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {   
    }
    // makeWelcomePage("lim_designer@naver.com", "welcome.html");
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {


        	// maildata.txt으로부터 읽은 내용 받아옴
        	// ** Database Class에서 Database를 private으로 선언했기 때문에 new 생성자를 이용하여 선언 못함
            Properties mailprop = Database.getProperties("src/maildata");
            //System.out.println(mailprop);

            // lim_designer@naver.com를 key값으로, 매칭되는 value값을 username으로 지정 
            String username = mailprop.getProperty(mailaddr);
            
            
            // .html 문서 생성 및 작성
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "의 페이지에 오신 걸 환영합니다.");
            writer.paragraph("메일을 기다리고 있습니다.");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
