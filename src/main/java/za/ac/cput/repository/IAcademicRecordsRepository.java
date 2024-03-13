package za.ac.cput.repository;
/**
 * IAcademicRecordsRepository.java
 * author: Gilberto Silva (218239300)
 * Date: 13 March 2024
 */

import za.ac.cput.domain.AcademicRecords;
import java.util.List;

public interface IAcademicRecordsRepository extends IRepository<AcademicRecords, String> {
    public List<AcademicRecords> getAll();

}
