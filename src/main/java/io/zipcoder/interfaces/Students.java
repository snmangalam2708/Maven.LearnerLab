package io.zipcoder.interfaces;

public final class Students extends People<Student>{

    private static final Students INSTANCE = new Students();
    private Student[] stuArray;

    private Students(){

        Student ujjwal = new Student(1L, "Ujjwal");
        Student aarti = new Student(2L, "Aarti");
        Student adam = new Student(3L, "Adam");
        Student jimmy = new Student(4L, "Jimmy");
        Student chip = new Student(5L, "Chip");
        Student dave = new Student(6L, "Dave");

            personList.add(ujjwal);
            personList.add(aarti);
            personList.add(adam);
            personList.add(jimmy);
            personList.add(chip);
            personList.add(dave);

        }


    @Override
    public Student[] toArray() {

        return personList.toArray(new Student[personList.size()]);

    }

    public static Students getInstance(){

        return INSTANCE;
    }

    static {

        Students INSTANCE = new Students();
        for (int i = 0; i < 4; i++) {
            INSTANCE.personList.add(new Student(i + 0L, "Student" + i));
        }
    }

}