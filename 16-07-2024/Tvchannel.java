public class Tvchannel{
	public String name;
	public int total_channels;
	public byte watch_channels;
	public String[] channel_names;

public Tvchannel(){
	
}

	
	
public Tvchannel(String name,int total_channels,byte watch_channels,String[] channel_names){
	
	this.name=name;
	this.total_channels=total_channels;
	this.watch_channels=watch_channels;
	this.channel_names=channel_names;
	System.out.println("name is "+name);
	System.out.println("total_channels is "+total_channels);
	System.out.println("watch_channels is "+watch_channels);
	for(int i=0;i<channel_names.length;i++){
			
	System.out.println("channel_names is "+channel_names[i]);
	}

	
}

}