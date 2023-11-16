package com.Workintech.model;

public class Point {

    private int x;
    private int y;

    public Point(int x,int y){
        this.y=y;
        this.x=x;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((this.x-0)*(this.x-0) + (this.y-0)*(this.y-0));
    }
    public double distance(Point a){
        return Math.sqrt((this.x-a.x)*(this.x-a.x) + (this.y-a.y)*(this.y-a.y));
    }

    public double distance(int a,int b){
        return Math.sqrt((this.x-a)*(this.x-a) + (this.y-b)*(this.y-b));
    }


}
