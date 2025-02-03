public abstract class Volume {
    public abstract double getVolume();

    public static class Cube extends Volume {
        private double side;

        public Cube(double side) {
            this.side = side;
        }

        // Override getVolume() to calculate volume of the cube
        @Override
        public double getVolume() {
            return Math.pow(side, 3); // Volume of a cube is side^3
        }
    }

    public static class Cylinder extends Volume {
        private double radius;
        private double height;

        public Cylinder(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        // Override getVolume() to calculate volume of the cylinder
        @Override
        public double getVolume() {
            return Math.PI * Math.pow(radius, 2) * height; // Volume of a cylinder is π * r^2 * h
        }
    }

    public static void main(String[] args) {
        // Create objects for cube and cylinder
        Volume cube = new Cube(3);
        Volume cylinder = new Cylinder(5, 10);

        // Calculate and display volume of both shapes
        System.out.println("Volume of Cube: " + cube.getVolume());
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
    }
}