public class StudentRunner{

        public static void main(String args[]){

        Student student = new Student();

        String names[] = {"Malli","Ram","Venkat","Lucky"};
        student.setNames(names);
        System.out.println("Names:");
                for(String name : student.getNames()){
                System.out.println(name);
                }
        int marks[] = {78,92,83,71,};
        student.setMarks(marks);
        System.out.println("Marks:");
                for(int mark : student.getMarks()){
                System.out.println(mark);
                }
        int roll_numbers[] = {302,305,301,307};
        student.setRollNumbers(roll_numbers);
        System.out.println("Roll Numbers:");
                for(int roll_no : student.getRollNumbers()){
                System.out.println(roll_no);
                }
        char grades[] = {'A','C','B','D'};
        student.setGrades(grades);
        System.out.println("Grades:");
                for(char grade : student.getGrades()){
                System.out.println(grade);
                }
        }
}