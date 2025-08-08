public class Main{
    public static void main(String[]args){
        int studentPassing = 0;
        int totalStudents = 3;

        System.out.println("Student Information:");

        Student student1 = new Student("Jose Surabasquez", "19", "BSIT", 69, 90,89);
        if (student1.averageGrade > 70){
            studentPassing++;
        }
        Student student2 = new Student("Bob Malong", "19", "BSIT", 69, 69,69);
        if (student2.averageGrade > 70){
            studentPassing++;
        }
        Student student3 = new Student("Jed Agustero", "19", "BSIT", 69, 85,76);
        if (student3.averageGrade > 70){
            studentPassing++;
        }

        student1.displayInfo();
        student1.getLetterGrade();
        student1.isPassing();
        student1.calculateAverage();
        System.out.println(" ");

        student2.displayInfo();
        student2.getLetterGrade();
        student2.isPassing();
        student2.calculateAverage();
        System.out.println(" ");

        student3.displayInfo();
        student3.getLetterGrade();
        student3.isPassing();
        student3.calculateAverage();



        System.out.println(" ");
        System.out.println("Summary: " + studentPassing + " out of " + totalStudents + " are passing");
    }
}
