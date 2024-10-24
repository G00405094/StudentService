package ie.atu.studentservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student>getStudents(){
        return studentRepository.findAll();
    }

    public String addStudent(Student student){
        studentRepository.save(student);
        return null;
    }
}
