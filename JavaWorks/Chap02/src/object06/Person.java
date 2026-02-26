package object06;

public class Person {
    // 멤버변수
    String name;
    int height;
    double weight;
    char gender;
    boolean married;

    // 생성자
    public Person(String name, int height, double weight, char gender, boolean married) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.married = married;
    }

    // Getter / Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
    
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
    
    public char getGender() { return gender; }
    public void setGender(char gender) { this.gender = gender; }
    
    public boolean getMarried() { return married; }
    public void setMarried(boolean married) { this.married = married; }
    
}
