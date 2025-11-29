package com.geometry;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(5, 3),
            new Square(4),
            new Rectangle(2, 6),
            new Square(5)
        };
        for (Shape shape : shapes) {
            processShape(shape);
        }
    }
    public static void processShape(Shape shape) {
        System.out.println("Figure " + shape);
        System.out.printf("Area: %.2f, perimeter: %.2f\n\n", 
                         shape.getArea(), shape.getPerimeter());
    }
}