package jdk17;

public class SealedClassExample {
    static abstract sealed class Shape permits Circle, Rectangle {
        public abstract double area();
    }

    static final class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI*radius*radius;
        }
    }

    static non-sealed class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length*width;
        }
    }

    static class Square extends Rectangle {
        public Square(double side) {
            super(side, side);
        }
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectacngle = new Rectangle(10, 10);
        System.out.println("Circle area: "+circle.area());
        System.out.println("Rectangle area: "+rectacngle.area());
    }
}
