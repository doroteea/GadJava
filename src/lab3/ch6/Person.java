package lab3.ch6;

import lab3.builder.Computer;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMarried;

    public Person(Builder builder) {
        this.name = name;
        this.job = job;
        this.university = university;
        this.drivingLicense = drivingLicense;
        this.isMarried = isMarried;
    }
    public static class Builder{
        private String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMarried;

        public void setJob(String job) {
            this.job = job;
        }

        public void setUniversity(String university) {
            this.university = university;
        }

        public void setDrivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
        }

        public void setMarried(boolean married) {
            isMarried = married;
        }

        public Builder(String name){
            this.name= name;
        }

        public Person build(){
            return new Person(this);
        }


    }



}
