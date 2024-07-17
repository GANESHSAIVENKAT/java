public class Anime{
	public String anime_app_name;
	public int total_anime_apps;
	public short rating;
	public String[] animeapp_names;
	public float space_occupied;


public Anime(){
	
}

	
	
public Anime(String anime_app_name,int total_anime_apps,short rating,String[] animeapp_names,float space_occupied){
	
	this.anime_app_name=anime_app_name;
	this.total_anime_apps=total_anime_apps;
	this.rating=rating;
	this.animeapp_names=animeapp_names;
	this.space_occupied=space_occupied;

	System.out.println("Anime name is "+anime_app_name);
	System.out.println("Total Anime apps is "+total_anime_apps);
	System.out.println("App Rating is "+rating);
	System.out.println("Space occupied is "+space_occupied);

	for(int i=0;i<animeapp_names.length;i++){
			
	System.out.println("animeapp_names is "+animeapp_names[i]);
	}

	
}

}