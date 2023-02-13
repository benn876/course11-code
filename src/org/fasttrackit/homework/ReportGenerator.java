package org.fasttrackit.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {
    public static void generateReport(Classroom classroom) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/grade-report.txt"));
        double avg = classroom.getStudentGrades().stream()
                .mapToDouble(StudentGrade::getGrade)
                .average().getAsDouble();
        bufferedWriter.write(String.valueOf(avg));
        bufferedWriter.close();
    }
}
