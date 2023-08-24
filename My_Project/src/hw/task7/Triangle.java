package com.itacademy.lesson11.hw.task7;


public class Triangle {
    private Coordinates A;
    private Coordinates B;
    private Coordinates C;

    public Triangle(Coordinates a, Coordinates b, Coordinates c) {
        A = a;
        B = b;
        C = c;
    }

    public Triangle() {
        A = new Coordinates(0, 4);
        B = new Coordinates();
        C = new Coordinates(3, 0);
    }

    public float getAx() {
        Coordinates a = this.A;;
        float x = a.getX();
        return x;
    }

    public float getAy() {
        Coordinates a = this.A;
        float y = a.getY();
        return y;
    }

    public float getBx() {
        Coordinates a;
        a = this.B;
        float x;
        x = a.getX();
        return x;
    }

    public float getBy() {
        Coordinates a;
        a = this.B;
        float y;
        y = a.getY();
        return y;
    }

    public float getCx() {
        Coordinates a;
        a = this.C;
        float x;
        x = a.getX();
        return x;
    }

    public float getCy() {
        Coordinates a;
        a = this.C;
        float y;
        y = a.getY();
        return y;
    }

    public float perimeter() {

        float ax, ay;
        float bx, by;
        float cx, cy;

        ax = this.getAx();
        ay = this.getAy();

        bx = this.getBx();
        by = this.getBy();

        cx = this.getCx();
        cy = this.getCy();

        float ab, bc, ca;

        ab = (float) Math.sqrt(Math.pow((bx - ax), 2) + Math.pow((by - ay), 2));
        bc = (float) Math.sqrt(Math.pow((cx - bx), 2) + Math.pow((cy - by), 2));
        ca = (float) Math.sqrt(Math.pow((ax - cx), 2) + Math.pow((ay - cy), 2));

        float p = ab + bc + ca;

        return p;
    }

    public float square() {

        float ax, ay;
        float bx, by;
        float cx, cy;

        ax = this.getAx();
        ay = this.getAy();

        bx = this.getBx();
        by = this.getBy();

        cx = this.getCx();
        cy = this.getCy();


        float s;
        s = 0.5f * Math.abs(ax * (by - cy) + bx * (cy - ay) + cx * (ay - by));
        return s;
    }

    public Coordinates medianPoint() {

        float ax, ay;
        float bx, by;
        float cx, cy;

        ax = this.getAx();
        ay = this.getAy();

        bx = this.getBx();
        by = this.getBy();

        cx = this.getCx();
        cy = this.getCy();

        float mx, my;
        mx = (ax + bx + cx) / 3;
        my = (ay + by + cy) / 3;

        Coordinates median = new Coordinates(mx, my);
        return median;

    }

    public Triangle getTriangle() {
        Triangle t = new Triangle(this.A, this.B, this.C);
        return t;
    }
}
