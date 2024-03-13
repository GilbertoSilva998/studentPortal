package za.ac.cput.repository;
/**
 * AcademicRecordsRepositoryTest.java
 * author: Gilberto Silva (218239300)
 * Date: 13 March 2024
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.AcademicRecords;
import za.ac.cput.factory.AcademicRecordsFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AcademicRecordsRepositoryTest {

    private static final AcademicRecordsRepository academicRecordsRepository = AcademicRecordsRepository.getAcademicRepository();
    private static final AcademicRecords academicRecords = AcademicRecordsFactory.createAcademicRecords
                   ("ABC0001",
                    "ICT",
                    "ADP",
                    "89");

    @Test
    void a_create() {
        AcademicRecords created = academicRecordsRepository.create(academicRecords);
        assert academicRecords != null;
        assertEquals(academicRecords.getAcademicID(), created.getAcademicID());
        System.out.println("Create" + created);
    }

    @Test
    void b_read() {
        assert academicRecords != null;
        AcademicRecords read = academicRecordsRepository.read(academicRecords.getAcademicID());
        assertNotNull(read);
        System.out.println("Read" + read);
    }

    @Test
    void c_update() {
        assert academicRecords != null;
        AcademicRecords updated = new AcademicRecords.Builder().copy(academicRecords)/*.setAcademicID("ACA111")*/
                .setStudentNumber("123456")
                .setCourse("Multimedia")
                .setSubject("Multimedia1")
                .setResults("98")
                .build();
        assertNotNull(academicRecordsRepository.update(updated));
        System.out.println("Updated" +updated);
    }

    @Test
    void e_delete() {
        assert academicRecords != null;
        boolean deleted = academicRecordsRepository.delete(academicRecords.getAcademicID());
        assertTrue(deleted);
        System.out.println("Deleted " + true);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(academicRecordsRepository.getAll());
    }
}