/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Apr-20
 *  Time: 10:37 AM
 */
package secd.student;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
      /*
       int response = 0;

       if(this.rollNo == o.rollNo && this.name.equals(o.name)){
           response = 0;
       }
       else{
           if(this.rollNo < o.rollNo){
               response = -1;
           }
           else{
               response = 1;
           }
       }

       return response;
       */
        return this.rollNo - o.rollNo;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRollNo() == student.getRollNo() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNo(), getName());
    }
}
