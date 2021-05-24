package com.wmw5;

public class teacher {
    Integer id;
    String name;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "teacher{" + "id=" + id + ", name='" + name + '}';
    }
    public teacher(){
    }

    public teacher(Integer id, String name,String gender,Integer age,String e_mail,Integer dept_id,String phone){
        this.id = id;
        this.name = name;
    }
}
