
package GPVaccineApp;

/**
 * Person.java
 * Product Version: Apache NetBeans IDE 12.5
 * @author Aaron Kearns
 * 25/03/2022
*/
public class Person {
    protected String name;
    protected int age;
    protected String medicalCondition;
    private int priority;
    
    
    public Person() {
        name = " ";
        age = ' ';
        medicalCondition = " ";
        priority = ' ';
    }

    public Person(String name, int age, String medicalCondition, int priority) {
        this.name = name;
        this.age = age;
        this.medicalCondition = medicalCondition;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
    
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    
    public String printPeopleRegistered() {
        return ("Name = "+name+", age = "+age+", medical condition = "+medicalCondition+".");
    }
    
    
}
