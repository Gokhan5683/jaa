interface Operation {
    double volume();
}
class Cylinder implements Operation {
    double radius;
    double height;
    static final double PI = 3.142;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double volume() {
        return PI * radius * radius * height;
    }
}
class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, 10.0); 
        System.out.println("Volume: " + cylinder.volume());
    }
}
