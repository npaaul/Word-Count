package com.hewen.object;

public class studentOperator {
    private Student student;
    public studentOperator(Student student) {
        this.student = student;
    }
    public void printpass(){
        if(student.getScore() >=60){
            System.out.println(student.getName()+"通过了考试");
        }
        else{
            System.out.println(student.getName()+"没通过考试");
        }
    }
}

