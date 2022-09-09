package Q2;

public class Person implements Comparable{
    private String name;
    private int age;
    private double weight;
    private double height;
    
    public Person(String name, int age, double weight, double height){
        setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(height);
        calculateRecommendWeight();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double calculateRecommendWeight(){
        double TotalWeight = 0;
        TotalWeight = (0.9)*(getHeight() - 100 + ( getAge() / 10 ));
        return TotalWeight;
    }
    
    @Override
    public double calculateDistance(){
        double TotalDistance = 0;
        TotalDistance = getHeight() - calculateRecommendWeight();
        return TotalDistance;
    }
    
    public String toString(){
        String MSG = "";
        MSG =   "Name: "+getName() +
                "\nAge: "+getAge() + 
                "\nWeight: "+getWeight() + 
                "\nHeight: "+getHeight() + 
                "\nRecommended weight: " + calculateRecommendWeight();
        return MSG;
    }
}
