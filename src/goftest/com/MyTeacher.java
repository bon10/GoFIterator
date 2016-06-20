package goftest.com;

public class MyTeacher extends Teacher{

    @Override
    public void createStudentList() {
        studentList = new MyStudentList(5);
        studentList.add(new Student("赤井亮太",1));
        studentList.add(new Student("赤羽里美",2));
        studentList.add(new Student("岡田美央",2));
        studentList.add(new Student("西森俊介",1));
        studentList.add(new Student("中ノ森玲菜",2));

    }

    @Override
    public void callStudents() {
        // ようするにgetLastNumメソッドが依存関係なので、
        // メソッドの処理が変わったりすると、実装に関係のないこの部分も処理変更の煽りを受ける的な話。
        /*int size = studentList.getLastNum();
        *for(int n=0;n<size;n++){
        *    System.out.println(studentList.getStudentAt(n).getName());
        *}
        */
        // その点Iterator使えば実装を意識する必要はなっしんぐ。
        Iterator itr = studentList.iterator();
        while(itr.hasNext()){
            System.out.println(((Student)itr.next()).getName());
        }
    }

}
