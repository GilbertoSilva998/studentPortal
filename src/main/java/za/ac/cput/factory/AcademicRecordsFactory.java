package za.ac.cput.factory;

import za.ac.cput.domain.AcademicRecords;
import za.ac.cput.util.Helper;

/**
 * AcademicRecordsFactory.java
 * author: Gilberto Silva (218239300)
 * Date: 13 March 2024
 */
public class AcademicRecordsFactory {
    public static AcademicRecords createAcademicRecords (String studentNumber, String course, String subject, String results) {

        if (Helper.isNullorEmpty(studentNumber) || Helper.isNullorEmpty(course)) {
            return null;
        }

            String academicID = Helper.generateId();

            AcademicRecords academicRecords = new AcademicRecords.Builder().setAcademicID(academicID)
                    .setStudentNumber(studentNumber)
                    .setCourse(course)
                    .setSubject(subject)
                    .setResults(results)
                    .build();
            return academicRecords;
        }
    }

