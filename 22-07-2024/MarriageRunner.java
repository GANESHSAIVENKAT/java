public class MarriageRunner{

public static void main(String args[]){

Marriage info = new Marriage();
Marriage marriage = new Marriage("Vaasanthi",20,"Btech",5.0f);

marriage.profile_details("Vaasanthi");
marriage.profile_details("Vaasanthi",18);
marriage.profile_details("Vaasanthi",18,4.7f);
marriage.profile_details("Vaasanthi",18,"Btech",4.7f);
}
}