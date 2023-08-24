package com.itacademy.lesson11.hw.task3_1;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students;
    int Group;

    public Group(){
        this.students = null;
    }

    public Group(List<Student> mas, int group){
        this.students = mas;
        this.Group = group;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getGroup() {
        return Group;
    }

    public List<Student> getExcellents(List<Student> group){
        List<Student> Excellents = new ArrayList<>();

        for(int i = 0; i < group.size(); i++){
            int[] pf = group.get(i).getPerformance();
            boolean ex = true;
            for (int j = 0; j < pf.length; j++){
                if(pf[j] < 9){
                    ex = false;
                    break;
                }
            }
            if(ex){
                Excellents.add(group.get(i));
            }
        }
        return Excellents;
    }
}
