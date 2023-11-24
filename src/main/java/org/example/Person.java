package org.example;

public class Person {
        private String name = "Yeva";
        private String lastName = "Sokhatska";
        public Person(){}

        public Person(String name, String lastName){
            this.name = name;
            this.lastName = lastName;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

}
