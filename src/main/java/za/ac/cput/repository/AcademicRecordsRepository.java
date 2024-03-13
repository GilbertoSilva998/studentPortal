package za.ac.cput.repository;
/**
 * AcademicRecordsRepository.java
 * author: Gilberto Silva (218239300)
 * Date: 13 March 2024
 */

import za.ac.cput.domain.AcademicRecords;
import java.util.ArrayList;
import java.util.List;

public class AcademicRecordsRepository implements IAcademicRecordsRepository{

    private static AcademicRecordsRepository academicRepository = null;

    private List <AcademicRecords> academicRecordsList = new ArrayList<>();

    private AcademicRecordsRepository(){
        academicRecordsList = new ArrayList<AcademicRecords>();
    }

    public static AcademicRecordsRepository getAcademicRepository(){
        if (academicRepository == null) {
            academicRepository = new AcademicRecordsRepository();
        }
        return academicRepository;
    }

    @Override
    public AcademicRecords create(AcademicRecords academicRecords) {
        boolean success = academicRecordsList.add(academicRecords);
        if (!success)
        return null;
        return academicRecords;
    }

    @Override
    public AcademicRecords read(String academicID) {
        AcademicRecords academicRecords = academicRecordsList.stream()
                            .filter(s -> s.getAcademicID().equals(academicID))
                            .findAny()
                            .orElse(null);
        return academicRecords;
    }

    @Override
    public AcademicRecords update(AcademicRecords academicRecords) {
        AcademicRecords oldAcademic = read(academicRecords.getAcademicID());
        if (oldAcademic != null) {
            academicRecordsList.remove(oldAcademic);
            academicRecordsList.add(academicRecords);
            return academicRecords;
        }
        return null;
    }

    @Override
    public boolean delete(String academicID) {
        AcademicRecords deleteAcademic = read(academicID);
        if (deleteAcademic == null)
            return false;
            academicRecordsList.remove(deleteAcademic);
        return true;
    }
    @Override
    public List<AcademicRecords> getAll() {
        return academicRecordsList;
    }
}
