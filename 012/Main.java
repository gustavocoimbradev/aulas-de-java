class Main {
    static void main(String[] args) {

        Student s1  = new Student();
        s1.id       = 1;
        s1.name     = "Student 1";

        Student s2  = new Student();
        s2.id       = 2;
        s2.name     = "Student 2";

        Student s3  = new Student();
        s3.id       = 3;
        s3.name     = "Student 3";

        Class c1    = new Class();
        c1.id       = 1;

        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c1.enrollStudent(s3);

        System.out.println(c1.getStudents());

    }
}