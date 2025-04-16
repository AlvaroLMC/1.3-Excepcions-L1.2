import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("lunes");
        list.add("martes");
        list.add("miercoles");
        list.add("jueves");
        list.add("viernes");
        list.add("sabado");
        list.add("domingo");

        System.out.println(list);

        ArrayList<String> reverseList = new ArrayList<>();

        ListIterator<String> iterador = list.listIterator();

        while (iterador.hasNext()) {
            iterador.next();
        }

        while (iterador.hasPrevious()) {
            reverseList.add(iterador.previous());
        }
        
        System.out.println(reverseList);
    }
}