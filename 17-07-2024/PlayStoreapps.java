public class PlayStoreapps{
	public String app_name;
	public int total_apps;
	public short study_apps;
	public String[] gameapp_names;
	public float space_occupied;


public PlayStoreapps(){
	
}

	
	
public PlayStoreapps(String app_name,int total_apps,short study_apps,String[] gameapp_names,float space_occupied){
	
	this.app_name=app_name;
	this.total_apps=total_apps;
	this.study_apps=study_apps;
	this.gameapp_names=gameapp_names;
	this.space_occupied=space_occupied;

	System.out.println("App name is "+app_name);
	System.out.println("Total apps is "+total_apps);
	System.out.println("Study apps is "+study_apps);
	System.out.println("Space occupied is "+space_occupied);

	for(int i=0;i<gameapp_names.length;i++){
			
	System.out.println("gameapp_names is "+gameapp_names[i]);
	}

	
}

}