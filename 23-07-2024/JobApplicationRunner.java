public class JobApplicationRunner{

public static void main(String args[]){

JobApplication info=new JobApplication();
String[] skills={"Java","Html","Css","Spring","Springboot","Bootstarp"};

JobApplication data = new JobApplication("Ramu", "Developer", "Terralogic","BE","Coverletter text...",25,skills,false);

info.jobdetail(17);
info.jobdetail(22,"BE");
info.calculatePercentage();
info.detail();
info.criteria("B.E");
}
}