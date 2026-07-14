package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        Student data[] = new Student[4];

        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = new Student("Manoj", null);
        data[3] = null;

        StudentReport report = new StudentReport();

        System.out.println("---- Grade Report ----");

        for (int i = 0; i < data.length; i++) {

            try {
                String grade = report.findGrades(data[i]);
                System.out.println("Student " + (i + 1) + " Grade : " + grade);

            } catch (NullStudentObjectException e) {
                System.out.println("Student " + (i + 1) + " : " + e);

            } catch (NullNameException e) {
                System.out.println("Student " + (i + 1) + " : " + e);

            } catch (NullMarksArrayException e) {
                System.out.println("Student " + (i + 1) + " : " + e);
            }
        }

        StudentService service = new StudentService();

        System.out.println();
        System.out.println("Number of Null Marks Objects : "
                + service.findNumberOfNullMarks(data));

        System.out.println("Number of Null Name Objects : "
                + service.findNumberOfNullNames(data));

        System.out.println("Number of Null Student Objects : "
                + service.findNumberOfNullObjects(data));
    }
}