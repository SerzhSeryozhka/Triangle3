public class Triangle {
    double ab;
    double ac;
    double bc;

    public Triangle(double ab, double ac, double bc) {
        this.ab = ab;
        this.ac = ac;
        this.bc = bc;
    }


    public double calculationArea() {
        double per = (ab + bc + ac) / 2;
        return Math.sqrt((per * (per - ab) * (per - bc) * (per - ac)));
    }

    public static boolean check(double ab, double ac, double bc) {
        if ((ab < ac + bc) && (ac < ab + bc) && (bc < ab + ac)) {
            return true;}
    else{
        return false;}
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "ab=" + ab +
                ", ac=" + ac +
                ", bc=" + bc +
                ", S = "+this.calculationArea()+
                '}';
    }
}