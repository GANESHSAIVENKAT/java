public class CompaniesRunner{
	public static void main(String... args){
		
		Companies company = new Companies();
		int length = company.getlength();
		System.out.println("length is:"+length);
		company.insertbycompany("Terralogic");
		company.insertbycompany("TCS");
		company.insertbycompany("Infosys");
		company.insertbycompany("Techmahendra");
		company.companyreadby();
		System.out.println("----------update--------");
		company.companyupdateby("Terralogic","Ansys");
		company.companyreadby();
		System.out.println("----------delete--------");
		company.companydeleteby("TCS");
		company.companyreadby();
		System.out.println("----------search--------");
		String terralogic = company.companysearchby("Terralogic");
		System.out.println(terralogic);
		company.companyreadby();
	}

}