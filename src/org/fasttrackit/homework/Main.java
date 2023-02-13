package org.fasttrackit.homework;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<StudentGrade> studentGrades = DataProvider.provideStudentGrades("grades.txt");
        System.out.println(studentGrades);

        Classroom classroom = new Classroom(studentGrades);
        System.out.println(classroom.getGradesForDiscipline("Mathematics"));

        ReportGenerator.generateReport(classroom);
    }
}
