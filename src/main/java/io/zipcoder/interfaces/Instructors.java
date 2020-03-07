package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE;
    private Instructor[] instructorArray;

    private Instructors(){

        Instructor roberto  = new Instructor(10L, "roberto");
        Instructor dolio = new Instructor(20L, "dolio");
        Instructor chris = new Instructor(30L, "chris");
        Instructor kris = new Instructor(40L, "kris");

    }

    @Override
    public Instructor[] toArray() {
        Instructor[] instructor =  personList.toArray(new Instructor[0]);
        return instructor;
    }

    public static Instructors getInstance(){

        if(INSTANCE == null){
            //INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

    static {
        INSTANCE = new Instructors();
        for (int i = 0; i < 4; i++) {
            INSTANCE.personList.add(new Instructor(i + 0L, "INSTRUCTOR" + i));
        }
    }
}