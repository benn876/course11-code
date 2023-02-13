package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<StudentGrade> studentGrades = new ArrayList<>();

    public Classroom(List<StudentGrade> studentGrades) {
        if (studentGrades != null) {
            this.studentGrades.addAll(studentGrades);
        }
    }

    public List<StudentGrade> getStudentGrades() {
        return studentGrades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        if (discipline == null || discipline.equals("")) {
            return new ArrayList<>();
        }

        List<Integer> gradesForDiscipline = new ArrayList<>();
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                gradesForDiscipline.add(studentGrade.getGrade());
            }
        }
        return gradesForDiscipline;
    }
}
