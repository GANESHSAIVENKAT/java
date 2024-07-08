public class Drive{
	public static void detail(){
	String file_Name="JavaTask";
	System.out.println("File name is:"+file_Name);
	}
	public static void detail(String file, int totalfiles){
	System.out.println("file name:"+file);
	System.out.println("Total files are:"+totalfiles);		
		
	}
	public static String detail(int spaceoccupied){
		String internal="Files";
	    System.out.println("Internal space by : "+internal+"Total Space Occupied :"+spaceoccupied);
	return "End";		
		
	}
	public static void detail(String file[]){
    for(int index=0;index<file.length;index++){
    System.out.println("Required file are:"+file[index]);
 }
}



}