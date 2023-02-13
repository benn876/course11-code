package org.fasttrackit.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DataProvider {
    public static List<StudentGrade> provideStudentGrades(String fileName) throws FileNotFoundException {
        List<StudentGrade> studentGrades = new ArrayList<>();
        Scanner scanner = new Scanner(new File("files", fileName));
        while (scanner.hasNext()) {
            String[] result = scanner.nextLine().split(Pattern.quote("|"));
            studentGrades.add(new StudentGrade(result[0], result[1], Integer.parseInt(result[2])));
        }
        return studentGrades;
    }
}
