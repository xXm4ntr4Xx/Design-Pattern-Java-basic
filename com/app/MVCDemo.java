package com.app;

import com.controller.StudentController;
import com.model.Student;
import com.view.StudentView;

public class MVCDemo {
  public static void main(String[]s){
    //model
    Student st = takeStudentFromDB();
    //view
    StudentView sw = new StudentView();
    //controller
    StudentController sc = new StudentController(st,sw);

    sc.view();

   sw.showName("tom");

   sc.view();

    sc.setStudentName("cris");

    sc.view();
  }


  private static  Student takeStudentFromDB(){
    Student student = new Student();
    student.setName("Chris");
    return student;

  }
}
