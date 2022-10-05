
package GPVaccineApp;

/**
 * PersonPrioritised.java
 * Product Version: Apache NetBeans IDE 12.5
 * @author Aaron Kearns
 * 25/03/2022
*/
public class PersonPrioritised {
    private String name;
    private int age;
    private String medicalCondition;
    
    public PersonPrioritised(){
        name = new String();
        medicalCondition = new String();
    }

    public void setName(String n){
        name = n;
    }
    
    public void setAge(int a){
        age = a;
    }

    public void setMedicalCondition(String mc){
        medicalCondition = mc;
    }

    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }

    public String getMedicalCondition(){
        return medicalCondition;
    }
}