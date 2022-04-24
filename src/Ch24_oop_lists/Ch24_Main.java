package Ch24_oop_lists;

import java.util.ArrayList;
import java.util.List;

public class Ch24_Main {

    public static void main(String[] args) {
        List<Cable> cables = new ArrayList<>();

        Cable cable1 = new Cable("prosty");
        Cable cable2 = new Cable("krzywy");
        Cable cable3 = new Cable("długi");
        Cable cable4 = new Cable("krótki");
        Cable cable5 = new Cable("okrągły");

        cables.add(cable1);
        cables.add(cable2);
        cables.add(cable3);
        cables.add(cable4);
        cables.add(cable5);

        for (int i = 0; i < cables.size(); i++) {
            cables.get(i).print();
        }

        System.out.println("Lista zawiere: " + cables.size() + " elementów");


    }
}
