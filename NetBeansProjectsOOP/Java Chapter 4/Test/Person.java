package Test;
//import java.util.Date;
public class Person {
    //char chaeacter;//''
    //boolean koko;//false
    //Date date;//null
    String Name;
    private int age;
    private int ageindays=365;
        public Person(){
        }
        public Person(String newName,int newAge){
            setName(newName);
            setAge(newAge);
        }
//        public String getName(){
//            return Name;
//        }
        public int getAge(){
            return age;
        }
        public String setName(String newName){
            Name=newName;
            return Name;
        }
        public void setAge(int newAge){
            age=newAge;
        }
        public int computeAge(){
            ageindays=age*365;
            return ageindays;
        }
        public String printPerson(){
            String MSG="Name: "+setName(Name)+"\nAge: "+
                        getAge()+"\nAge in Days: "+
                         computeAge();
            return MSG;
        }
}

