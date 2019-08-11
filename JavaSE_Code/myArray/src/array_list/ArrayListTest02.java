package array_list;

import java.util.ArrayList;

public class ArrayListTest02{
    public static void main(String[] args){
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("XU",18);
        Student s2 = new Student("chun",19);
        Student s3 = new Student("tao",20);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for(int i = 0;i < array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
