package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    ROBERTO(10L, "roberto"),
    DOLIO(20L, "dolio"),
    CHRIS(30L, "chris"),
    KRIS(40L, "kris");

    final Instructor instructor;
    double timeWorked;

        Educator(long id, String name) {

            instructor = new Instructor(id,name);
        }

    public double getTimeWorked() {
            return timeWorked;
        }

        @Override
        public void teach(Learner learner, double numberOfHours) {
            instructor.timeWorked += numberOfHours;
            learner.learn(numberOfHours);

        }

        @Override
        public void lecture(Learner[] learners, double numberOfHours) {
            instructor.timeWorked += numberOfHours;
            double numberOfHoursPerLearner = numberOfHours / learners.length;

            for (int i = 0; i < learners.length; i++) {
                learners[i].learn(numberOfHoursPerLearner);
            }

        }
    }