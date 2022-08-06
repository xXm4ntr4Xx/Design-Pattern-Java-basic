package com.controller;
import com.model.Student;
import com.view.StudentView;

public class StudentController {
  private Student model;
  private StudentView view;

  public StudentController(Student model,StudentView view){
    this.model=model;
    this.view=view;
  }


  public void setStudentName(String name){
    model.setName(name);
  }

  public String getStudentName(){
    return model.getName();
  }


  public void view(){
    view.showName(model.getName());;
  }
}
