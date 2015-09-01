/**
 * 파일명 : Composite.java
 * 작성일 : 2015. 8. 31.
 * 파일설명 : 
 */
package CompositePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// ----------------- 하위 Composite(하위 노드 가질 수 있음) ----------------- 
public class Composite extends Component {
    public Composite(String componentName) {
        super(componentName);
    }
    @Override
    public void add(Component c) {
        children.add(c);
    }
}