public class Cat{

        public String name; 
        public String breed;
        public int age;
        public float weight;
        public String color;

        public Cat(){
        System.out.println("Pet Details:");
        }
        public Cat(String name,String breed,int age,float weight,String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.color = color;
        }
        public void catinfo(){
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
        System.out.println("Age: "+age);
        System.out.println("Weight: "+weight);
        System.out.println("Color: "+color);
        }
}