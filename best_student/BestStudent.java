import java.util.Scanner;

class Student {
    private String id;
    private String firstName;
    private String lastName;
    private double grade;

    public Student(String id ,String firstName ,String lastName ,double grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getGrade(){
        return grade;
    }

}

class BestStudent{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Student[] students = new Student[n];
        int index = 0;
        double gradeMax = 0.0;

        for (int i = 0;i < n ;i++ ) {
            String id = scan.next();
            String firstName = scan.next();
            String lastName = scan.next();
            double grade = scan.nextDouble();

            students[i] = new Student(id ,firstName ,lastName ,grade);

        }

        for (int i = 0;i < n ;i++ ) {
            if (students[i].getGrade() > gradeMax) {
                index = i;
                gradeMax = students[i].getGrade();
            }
        }
        System.out.print(students[index].getId() + " ");
        System.out.print(students[index].getFirstName() + " ");
        System.out.print(students[index].getLastName() + " ");
        System.out.printf("%.2f",students[index].getGrade());



    }
}
