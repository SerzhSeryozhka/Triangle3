import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        exTriangle();
    }

    public static void exTriangle() throws FileNotFoundException {
        ArrayList<Triangle> triangles=readNumFromFile("Side of triangle");
        System.out.println(triangles);
    }
    public static ArrayList<Triangle> readNumFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        ArrayList<Triangle> triangles = new ArrayList<>();
        while (scanner.hasNext()) {
            double ab = scanner.nextDouble();
            double bc = scanner.nextDouble();
            double ac = scanner.nextDouble();
            if (Triangle.check(ab,bc,ac)){
            Triangle r=new Triangle(ab, bc, ac);
            triangles.add(r);
            }
        }
        scanner.close();
        return triangles;
    }
}

