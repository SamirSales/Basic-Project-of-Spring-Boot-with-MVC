package io.github.samirsales.Dao;

import io.github.samirsales.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao {

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1,"Mario","Italiano"));
                add(new Student(2,"Sonic","Corrida"));
                add(new Student(3,"Ryu","Karatê"));
                add(new Student(4,"Bruce","Ninjutso"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDB(Student student) {

    }
}
