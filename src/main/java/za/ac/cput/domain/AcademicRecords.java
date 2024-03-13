package za.ac.cput.domain;
/**
 * AcademicRecords.java
 * @author: Gilberto Silva (218239300)
 * Date: 13 March 2024
 */

import java.util.Objects;

public class AcademicRecords {
    private String academicID;
    private String studentNumber;
    private String course;
    private String subject;
    private String results;

    //--------------- Constructor -----------------------------

    public AcademicRecords() {}

    public AcademicRecords(Builder builder) {
        this.academicID = builder.academicID;
        this.studentNumber = builder.studentNumber;
        this.course = builder.course;
        this.subject = builder.subject;
        this.results = builder.results;
    }

    //--------------- Getters ---------------------------------


    public String getAcademicID() { return academicID; }

    public String getStudentNumber() { return studentNumber; }

    public String getCourse() { return course; }

    public String getSubject() { return subject; }

    public String getResults() { return results; }

    //--------------- Has Code -----------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcademicRecords that = (AcademicRecords) o;
        return Objects.equals(academicID, that.academicID) && Objects.equals(studentNumber, that.studentNumber) && Objects.equals(course, that.course) && Objects.equals(subject, that.subject) && Objects.equals(results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(academicID, studentNumber, course, subject, results);
    }


    //--------------- to string -----------------------------


    @Override
    public String toString() {
        return "AcademicRecords{" +
                "academicID='" + academicID + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", course='" + course + '\'' +
                ", subject='" + subject + '\'' +
                ", results='" + results + '\'' +
                '}';
    }

    //--------------- Builder -----------------------------
    public static class Builder{
        private String academicID;
        private String studentNumber;
        private String course;
        private String subject;
        private String results;

        public Builder setAcademicID(String academicID) {
            this.academicID = academicID;
            return this;
        }

        public Builder setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
            return this;
        }

        public Builder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder setResults(String results) {
            this.results = results;
            return this;
        }

        public Builder copy(AcademicRecords academicRecords) {
            this.academicID = academicRecords.academicID;
            this.studentNumber = academicRecords.studentNumber;
            this.course = academicRecords.course;
            this.subject = academicRecords.subject;
            this.results = academicRecords.results;
            return this;
        }
        public AcademicRecords build(){
            return new AcademicRecords(this);
        }
    }
}
