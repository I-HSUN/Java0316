package com.ocp.day18;

public class Student extends Person{
    private int scores;
    private Teacher teacher;

    public Student() {
    }

    public Student(int scores, Teacher teacher, String name, int age) {
        super(name, age);
        this.scores = scores;
        this.teacher = teacher;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" + "scores=" + scores + ", teacher=" + teacher + '}';
    }

    
}
