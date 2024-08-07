public class Student{

        private String names[];
        private int marks[];
        private int roll_numbers[];
        private char grades[];

        public void setNames(String names[]){
        this.names = names;
        }
        public String[] getNames(){
        return this.names;
        }
        public void setMarks(int marks[]){
        this.marks = marks;
        }
        public int[] getMarks(){
        return this.marks;            
        }
        public void setRollNumbers(int roll_numbers[]){
        this.roll_numbers = roll_numbers;
        }
        public int[] getRollNumbers(){
        return this.roll_numbers;
        }
        public void setGrades(char grades[]){
        this.grades = grades;
        }
        public char[] getGrades(){
        return this.grades;
        }
}