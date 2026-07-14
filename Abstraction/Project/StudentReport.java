package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    // Method to find grade
    public String findGrades(Student student)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null)
            throw new NullStudentObjectException();

        if (student.getName() == null)
            throw new NullNameException();

        if (student.getMarks() == null)
            throw new NullMarksArrayException();

        int[] marks = student.getMarks();
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double average = sum / (double) marks.length;

        if (average >= 80)
            return "A";

        if (average >= 60)
            return "B";

        if (average >= 40)
            return "C";

        return "F";
    }

    // Method to validate student
    public String validate(Student student)
            throws NullStudentObjectException {

        if (student == null)
            throw new NullStudentObjectException();

        return "VALID";
    }
}