
public class Consonent {
	public static void main(String[] args)

	{
		String name = "GeeksForGeeks";
		name = name.toLowerCase();
		
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			// check if char[i] is vowel
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e'
				|| name.charAt(i) == 'i'
				|| name.charAt(i) == 'o'
				|| name.charAt(i) == 'u') {
				
				
			}else if(name.charAt(i) != ' '){
				count++;
			}
		}

		
		System.out.println("Total no of consonents in string are: " + count);
	}
}
