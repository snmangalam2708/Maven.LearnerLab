package io.zipcoder.interfaces;

import java.util.LinkedHashMap;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    static Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public ZipCodeWilmington(){

    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){

        Student[] s = students.toArray();
        teacher.lecture(s, numberOfHours);

    }

    public void hostLecture(long id, double numberOfHours){
        Instructor currentInstructor = instructors.findById(id);
        hostLecture(currentInstructor, numberOfHours);
    }

    public static LinkedHashMap<Student, Double> getStudyMap() {

        Student[] s = students.toArray();
        LinkedHashMap<Student, Double> myMap = new LinkedHashMap<>();
        for (Student student : s) {
            myMap.put(student, student.getTotalStudyTime());
        }

        return myMap;
    }
}