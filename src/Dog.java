public class Dog {

    private String name;
    private String color;
    private int age;

    public Dog(){
      this.name="";
      this.color="";
      this.age=0;
    }
    public Dog(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void addOneAge(){
        this.age+=1;
    }

    public int birthday(){
        addOneAge();
        return this.age;
    }


    public String toString() {
        return "The dog is named "+name+" and is "+age+" years old. This dog is "+color+".";
    }
}

