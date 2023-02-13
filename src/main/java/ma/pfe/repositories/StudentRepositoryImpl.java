package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{
    @Autowired
    private StudentEntity SEntity;

    @Autowired
    private StudentMapper SMapper;

    @Override
    public long create(StudentEntity e) {
        SMapper.convertEntityToDto(SEntity);
        return 1;
    }

    @Override
    public boolean update(StudentEntity e) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StudentEntity> readAll() {
        return null;
    }
}
