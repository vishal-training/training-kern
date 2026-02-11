class Student {
    private int id;
    private String name;
    private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else {
            return 'C';
        }
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Rahul");
        s1.setMarks(85);

        System.out.println("Student: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
        System.out.println("Grade: " + s1.calculateGrade());
    }
}
