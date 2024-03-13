package za.ac.cput.factory;
/**
 * AcademicRecordsFactoryTest.java
 * author: Gilberto Silva (218239300)
 * Date: 13 March 2024
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.domain.AcademicRecords;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class AcademicRecordsFactoryTest {
    private AcademicRecords academicRecords1;
    private AcademicRecords academicRecords2;
    private AcademicRecords academicRecords3;

    @Test
    public void test(){
        AcademicRecords academicRecords = AcademicRecordsFactory.createAcademicRecords
                ("218239300",
                "ICT",
                "ADP",
                "89");
        System.out.println(academicRecords.toString());
        assertNotNull(academicRecords);
    }

    @Test
    void testEquality (){assertEquals(academicRecords1, academicRecords3);}

    @Test
    void testIdentity (){assertSame(academicRecords1, academicRecords3);}

    @Test
    void testFail(){assertEquals(academicRecords1, academicRecords2);}

    @Test
    @Timeout(value = 10000, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){System.out.println("Time has passed");}

    @Test
    @Disabled("Disabled ERROR 808")
    void testWillBeSkipped(){}

}