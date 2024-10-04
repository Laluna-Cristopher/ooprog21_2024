public class Circle {
    public static void main(String[] args) {
       
        double radius1 = 3.0;
        double diameter1 = 2 * radius1;
        double area1 = Math.PI * Math.pow(radius1, 2);
        
        
        double radius2 = 20.0;
        double diameter2 = 2 * radius2;
        double area2 = Math.PI * Math.pow(radius2, 2);
        
                System.out.printf("Radius of the first circle: %.1f%n", radius1);
        System.out.printf("Diameter of the first circle: %.1f%n", diameter1);
        System.out.printf("Area of the first circle: %.15f%n", area1);
        
        
        System.out.printf("Radius of the second circle: %.1f%n", radius2);
        System.out.printf("Diameter of the second circle: %.1f%n", diameter2);
        System.out.printf("Area of the second circle: %.15f%n", area2);
    }
}

