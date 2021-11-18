package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setDate("10");
        student.setFio("D B R");
        student.setGroup("2b");
        System.out.println(" date: " + student.getDate()
                + "  Fio: " + student.getFio() + " group: " + student.getGroup());
    }
}
