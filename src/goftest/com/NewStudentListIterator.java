package goftest.com;

public class NewStudentListIterator implements Iterator{
    private NewStudentList newStudentList;
    private int index;

    public NewStudentListIterator(NewStudentList list){
        this.newStudentList = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if( newStudentList.students.size() > index){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        Student s = newStudentList.getStudentAd(index);
        index++;
        return s;
    }
}
