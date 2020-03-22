import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
//    static class Csucs {
//        Allapot allapot;
//        Csucs szulo;
//        Operator eloallito;
//        List<Operator> nemProbalt = new ArrayList<Operator>();
//
//        public Csucs(Allapot allapot, Csucs parent, Operator creator, Problema p) {
//            this.allapot = allapot;
//            this.szulo = parent;
//            this.eloallito = creator;
//            for (Operator o: p.operatorok())
//                if (o.alkalmazhato(allapot))
//                    this.nemProbalt.add(o);
//        }
//    }
//    public List<Operator> megoldas(Csucs terminalis) {
//        LinkedList<Operator> megoldas = new LinkedList<Operator>();
//        for (Csucs cs=terminalis; cs.szulo != null; cs=cs.szulo)
//            megoldas.addFirst(cs.eloallito);
//        return (List<Operator>) megoldas;
//    }
//    public List<Operator> keres(Problema p) {
//        Csucs aktualis;
//        // 1.
//        aktualis = new Csucs(p.kezdo(), null, null, p);
//
//        while (true) {
//            // 2.
//            if ( aktualis.allapot.cel() ) {
//                return megoldas(aktualis);
//            }
//            // 3.
//            if ( ! aktualis.nemProbalt.isEmpty() ) {
//                Operator o = aktualis.nemProbalt.remove(0);
//                Allapot uj = o.alkalmaz(aktualis.allapot);
//                System.out.println(uj);
//                aktualis = new Csucs(uj, aktualis, o, p);
//            } else {
//                // 4.
//                if ( aktualis.szulo != null ) {
//                    aktualis = aktualis.szulo;
//                } else {
//                    return null;
//                }
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Problema p = new Problema();
//        List<Operator> m = new Alap().keres(p);
//        System.out.println(m);
//    }
}
