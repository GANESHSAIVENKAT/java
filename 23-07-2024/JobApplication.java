public class JobApplication {
    // Properties
    private String applicantName;
    private String jobTitle;
    private String company;
    private String qualification;
    private String coverLetter;
    private int age;
    private String[] skills;
    private boolean isAccepted;

    // Constructor
	public JobApplication(){
	System.out.println("Default Constructor");
	}
     public JobApplication(String applicantName, String jobTitle, String company,String qualification, String coverLetter,int age,String[] skills,boolean isAccepted) {
        this.applicantName = applicantName;
        this.jobTitle = jobTitle;
        this.company = company;
        this.qualification = qualification;
        this.coverLetter = coverLetter;
        this.age = age;
        this.skills = skills;
        this.isAccepted = isAccepted;
		System.out.println("Applicant Name"+applicantName);
		System.out.println("Job Title"+jobTitle);
		System.out.println("Company Name"+company);
		System.out.println("Applicant qualification is :"+qualification);
		System.out.println(coverLetter);
		System.out.println("age :"+age);
		System.out.println("Reviewed :"+skills);
		System.out.println("Did Applicant Accepted :"+isAccepted);
		
		for(int i=0;i<skills.length;i++){
			
		System.out.println("skills is "+skills[i]);
		}
    }
	public String jobdetail(int age){
		if(age<18){
			System.out.println("Not eligible for job :"+age);
		}else{
			System.out.println("Eligible for job");
		}
		return"Yes";
	}
	public void jobdetail(int age,String qualification){
		if(age>21 && qualification=="BE"){
			System.out.println("Eligible for Software job");
		}else{
			System.out.println("Not Eligible for Software job");
		}
		
	}
	 public double calculatePercentage() {
		 int obtainedMarks=55;
		 int totalMarks=75;
        double percentage =(obtainedMarks * 100) / totalMarks;
		System.out.println(percentage+"%");
        return percentage;
    }
	public void detail(){
		double degree=5.0;
		String qualification="BE";
        if(degree>=5.0 && qualification=="BE"){
			System.out.println("Eligible to apply for Software developer");
		}else{
			System.out.println("Not eligible to apply for Software developer");
		}
    }
	public boolean criteria(String qualification){
		String[] skills={" ","Java","MySql"};
		if(qualification=="B.E" && skills[1]=="Java" && skills[2]=="MySql"){
			System.out.println("Eligible for Job");
		}else{
			System.out.println("Not Eligible for Job");
		}
		return true;
	}
}