public class AlphabetsRunner{
	public static void main(String... args){
	
	Alphabets alphabet=new Alphabets();
	int length = alphabet.getarraylength();
	System.out.println(length);
	alphabet.details('A');
	alphabet.details('B');
	alphabet.details('C');
	alphabet.details('D');
	alphabet.details('E');
	alphabet.details('F');
	alphabet.details('G');
	alphabet.details('H');
	alphabet.details('I');
	alphabet.details('J');
	alphabet.details('K');
	
	alphabet.read();
	
	
	}
}