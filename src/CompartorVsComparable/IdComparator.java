package CompartorVsComparable;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp2> {
    @Override
    public int compare(Emp2 o1, Emp2 o2) {
        return o1.getEmpId() - o2.getEmpId();
    }
}
