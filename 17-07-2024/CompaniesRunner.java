public class CompaniesRunner{

public static void main(String... args){

Companies info=new Companies();
System.out.println("Companies");
	String[] skills={"Java","Html","Css","Spring","Springboot","Bootstarp"};
	
Companies data=new Companies("Terralogic",10000,(short)5000,skills,100.0f);
Companies info1=new Companies("Tcs",10000,(short)7000,skills,100.0f);
Companies collection=new Companies("infosys",10000,(short)6000,skills,100.0f);
Companies details=new Companies("Techmahendra",10000,(short)1050,skills,100.0f);



}
}