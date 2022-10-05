
package GPVaccineApp;

import java.util.*;

/**
 * MyPriorityQueue.java
 * Product Version: Apache NetBeans IDE 12.5
 * @author Aaron Kearns
 * 25/03/2022
*/
public class MyPriorityQueue implements PQInterface 
{
    private ArrayList<PQElement> thePQ;
    
    public MyPriorityQueue() {
        thePQ = new ArrayList<PQElement>();    
    } 
    
    
    public boolean isEmpty() { 
        return thePQ.isEmpty(); 
    }
  
    
    public int size(){
	  return thePQ.size();
    }
 
    
    private int findInsertPosition(int newkey) {
          boolean found;
          PQElement elem;
          int position;
          found = false;
          position=0;
          
          while (position<thePQ.size() && !found)
          {
            elem = thePQ.get(position);
            if(elem.getKey()>newkey)  
                position = position +1;
            else
            {
                found = true;
            }
          }
         return position;
        }
     
    
    public void enqueue(int priorkey, Object item)
    {
        int index;
        PQElement elem = new PQElement(priorkey,(PersonPrioritised)item);
        
        index = findInsertPosition(priorkey);

        if (index == size())
            thePQ.add(elem);
        else
            thePQ.add(index, elem);
    }

    
    public Object dequeue()
    {
        return thePQ.remove(0);
    }
    
    
    public String printPQ()
    {
        String printStr = new String();
        PQElement elem;
        for (int i = 0; i<thePQ.size();i++)
        {
            elem = thePQ.get(i);
            printStr = printStr.concat (elem.printPersonPrioritised()+", priority ="+elem.getKey()+"."+"\n");
        }
        return printStr;
    }

}







