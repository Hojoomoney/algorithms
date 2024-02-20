package kaupOOP;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getBmi(){
        return this.bmi;
    }
    public String getBodyMass(){
        return this.bodyMass;
    }
    public void createBmi(){
        this.bmi = this.weight / (this.height/100 * this.height/100);
    }
    public void createBodyMass(){
        if(this.bmi < 18.5){
            this.bodyMass = "저체중";
        } else if (this.bmi < 23) {
            this.bodyMass = "정상";
        } else if (this.bmi < 25){
            this.bodyMass = "과체중";
        } else {
            this.bodyMass = "비만";
        }
    }
    public double createRandomHeight(){
        return (Math.random() * 50)+150;
    }
    public double createRandomWeight(){
        return (Math.random() * 69)+30;
    }
}
