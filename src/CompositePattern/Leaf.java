/**
 * 파일명 : Leaf.java
 * 작성일 : 2015. 8. 31.
 * 파일설명 : 
 */
package CompositePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// ----------------- 하위 Leaf(하위 노드 가질 수 없음) ----------------- 
public class Leaf extends Component{
    public Leaf(String componentName) {
        super(componentName);
    }
    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }
}