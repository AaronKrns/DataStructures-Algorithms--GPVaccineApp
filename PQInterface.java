
package GPVaccineApp;

import java.util.Iterator;

/**
 * PQInterface.java
 * Product Version: Apache NetBeans IDE 12.5
 * @author Aaron Kearns
 * 25/03/2022
*/
public interface PQInterface {
    public void enqueue(int key, Object element);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String printPQ();
}
