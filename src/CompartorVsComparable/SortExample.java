package CompartorVsComparable;
import java.util.ArrayList;
import java.util.Collections;
public class SortExample {
    @Override
    public String toString() {
        return "SortExample{}";
    }

    public static void main(String[] args) {
        ArrayList<Emp> marks = new ArrayList<>();
        marks.add(new Emp("Deep","9429604323",15));
        marks.add(new Emp("Neel","8460602551",8));
        marks.add(new Emp("Abhay","9429604323",5));

        System.out.println(marks);

        /// comparable
        Collections.sort(marks);
        System.out.println(marks);

        //ArrayList
        ///  comparator
        ArrayList<Emp2> emp = new ArrayList<Emp2>();
        emp.add(new Emp2("Deep","9429604323",15));
        emp.add(new Emp2("Neel","8460602551",8));
        emp.add(new Emp2("Abhay","9429604323",5));

        System.out.println(emp);
        Collections.sort(emp, new IdComparator());
        System.out.println(emp);

        ArrayList<Emp2> emp1 = new ArrayList<>(emp);
        Collections.sort(emp1,new NameComparator());
        System.out.println(emp1);




    }
}
