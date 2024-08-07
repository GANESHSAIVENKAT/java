public class JobApplication {
    // Private fields
    private String name;
    private int age;
	private String fatherName;
	private String motherName;
	private String qualification;
	private float cgpa;
	private String skills;
	private String companyName;
	private int salary;
	private boolean selected;
	

    // Constructor
    public JobApplication(String name, int age,String fatherName,String motherName,String qualification, float cgpa,String skills,String companyName,int salary,boolean selected) {
        this.name = name;
        this.age = age;
		this.fatherName = fatherName;
        this.motherName = motherName;
		this.qualification = qualification;
        this.cgpa = cgpa;
		this.skills = skills;
        this.companyName = companyName;
	    this.salary = salary;
        this.selected = selected;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        // You can add validation here if needed
        this.age = age;
    }
	public String getFatherName() {
        return fatherName;
    }
	public void setFatherName(String fathername) {
        this.fatherName = fathername;
    }
	public String getMotherName() {
        return motherName;
    }
	public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
	public String getQualificationName() {
        return qualification;
    }
	public void setQualificationName(String qualification) {
        this.qualification = qualification;
    }
	public float getCgpa() {
        return cgpa;
    }
	public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
	public String getSkillsName() {
        return skills;
    }
	public void setSkillsName(String skills) {
        this.skills = skills;
    }
	public String getCompanyName() {
        return companyName;
    }
	public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
	public int getSalary() {
        return salary;
    }
	public void setSalary(int salary) {
        this.salary = salary;
    }
	public boolean getSelected() {
        return selected;
    }
	public void setSelected(boolean selected) {
        this.selected = selected;
    }
	
}