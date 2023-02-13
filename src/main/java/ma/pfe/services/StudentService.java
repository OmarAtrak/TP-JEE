package ma.pfe.services;

import ma.pfe.dto.StudentDto;
import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentService {
    long create(StudentDto e);
    boolean update(StudentDto e);
    boolean delete(long id);
    List<StudentDto> readAll();
}
