public class Charger{

        public String brand;
        public int output;
        public String color;

        public  Charger(){
        System.out.println("Charger Details:");
        }

        public void getCharger(){
        getCharger("Samsung");
        }
        public void getCharger(String brand){
        this.brand = brand;
        System.out.println("Brand: "+brand);
        System.out.println("OutPut: "+getCharger(25,"White")+" watts");
        }
        public int getCharger(int output,String color){
        this.output = output;
        this.color = color;
        System.out.println("Color: "+color);
        return output;
        }

}