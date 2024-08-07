public class EarphonesRunner{

        public static void main(String args[]){

        Earphones earphone = new Earphones();

        earphone.setBrand("ptron");
        System.out.println("Brand: "+earphone.getBrand());

        earphone.setMaterial("polymer");
        System.out.println("Material: "+earphone.getMaterial());

       

        earphone.setColor("Black color");
        System.out.println("Color: "+earphone.getColor());

        earphone.setPrice(899);
        System.out.println("Price: "+earphone.getPrice());
        }
}