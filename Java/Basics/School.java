public class School {
    public static void main(String[] args) {
        
    }
}

class Student{
    String name;
    String studentID;
    int[] marks;

    public void calculateAverage(){
        int sum = 0;
        for(int mark : marks){
            sum += mark;
        }
        System.out.println(sum / marks.length);
    }
}