package com.ducle.springanddocker;

public class Todo {

    private Long id;
    private String task;

    public Todo(Long id, String task){
        this.id = id;
        this.task = task;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTask(){
        return this.task;
    }

    public void setTask(String task){
        this.task = task;
    }
}
