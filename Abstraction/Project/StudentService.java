package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentService {

    StudentReport report = new StudentReport();

    // Count the number of students with grade A
    public int findNumberOfNullMarks(Student[] students) {

        int count = 0;

        for (Student student : students) {
            try {
                report.findGrades(student);
            } catch (NullMarksArrayException e) {
                count++;
            } catch (NullNameException | NullStudentObjectException e) {
                // Ignore
            }
        }

        return count;
    }

    // Count the number of students with null names
    public int findNumberOfNullNames(Student[] students) {

        int count = 0;

        for (Student student : students) {
            try {
                report.findGrades(student);
            } catch (NullNameException e) {
                count++;
            } catch (NullMarksArrayException | NullStudentObjectException e) {
                // Ignore
            }
        }

        return count;
    }

    // Count the number of null student objects
    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        for (Student student : students) {
            try {
                report.validate(student);
            } catch (NullStudentObjectException e) {
                count++;
            }
        }

        return count;
    }
}