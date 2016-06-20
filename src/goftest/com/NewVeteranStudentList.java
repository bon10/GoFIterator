package goftest.com;

import java.util.Vector;

public class NewVeteranStudentList extends NewStudentList implements Aggregate{

    public NewVeteranStudentList(){
        this.students = new Vector<Student>();
    }


    public Iterator iterator(){
        return new NewStudentListIterator(this);
    }

}
