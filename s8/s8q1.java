class Sphere {
    double radius;
    Sphere(double r) {
        radius = r;
    }
    double surfaceArea() {
        return 4 * 3.14 * radius * radius;
    }
    double volume() {
        return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }
    public static void main(String[] args) {
        Sphere s = new Sphere(5);  // Sphere with radius 5
        System.out.println("Surface Area: " + s.surfaceArea());
        System.out.println("Volume: " + s.volume());
    }
}
