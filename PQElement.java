
package GPVaccineApp;

/**
 * PQElement.java
 * Product Version: Apache NetBeans IDE 12.5
 * @author Aaron Kearns
 * 25/03/2022
*/
public class PQElement {
      private int key;
      private PersonPrioritised element;
     
      public PQElement(int priority, PersonPrioritised e){
		key = priority;
                element = e;
	}

      public int getKey() {
		return key;
	}

      public void setKey(int value) {
		key = value;
	}
	
	public PersonPrioritised getElement() {
            return element;
      }

	public void setElement(PersonPrioritised e) {
		element = e;
      }

      public String printPersonPrioritised() {
          String msg ; 
          msg = "Name = " + element.getName() + ", age = " + element.getAge() + ", medical condition = " + element.getMedicalCondition();
          return msg;
      }
}
