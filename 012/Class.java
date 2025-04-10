class Class {
    int id;
    List<Student> students;

    void enrollStudent(Student student) {
        students.add(student);
    }


    Student[] getStudents() {
        return students;
    }

}