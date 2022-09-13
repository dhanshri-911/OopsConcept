package com.example;

public class Encapsulation {

        private String name;
        private double marks;
        private int rollNo;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getMarks() {
            return marks;
        }
        public void setMarks(double marks) {
            this.marks = marks;
        }
        public int getRollNo() {
            return rollNo;
        }
        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }


        public Encapsulation(String name, double marks, int rollNo) {
            super();
            this.name = name;
            this.marks = marks;
            this.rollNo = rollNo;
        }

        public Encapsulation() {
            super();
        }
        @Override
        public String toString() {
            return "Encapsulation [name=" + name + ", marks=" + marks + ", rollNo=" + rollNo + "]";
        }
        public void display() {
            // TODO Auto-generated method stub
            System.out.println("name= " + name + ", marks= " + marks + ", rollNo= " + rollNo );
        }


    }

