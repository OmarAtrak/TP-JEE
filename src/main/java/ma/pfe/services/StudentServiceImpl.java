package ma.pfe.services;

import ma.pfe.dto.StudentDto;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    @Override
    public long create(StudentDto e) {
        return 0;
    }

    @Override
    public boolean update(StudentDto e) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StudentDto> readAll() {
        return null;
    }
}
