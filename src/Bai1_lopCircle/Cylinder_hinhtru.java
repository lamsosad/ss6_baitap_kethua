package Bai1_lopCircle;

public class Cylinder_hinhtru extends Circle_hinhtron {
    private double height;

    public Cylinder_hinhtru() {
    }

    public Cylinder_hinhtru(double height) {
        this.height = height;
    }

    public Cylinder_hinhtru(double height,double radius, String color) {
        super(radius,color);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder_hinhtru{" +
                "height=" + height +
                super.toString()+
                '}';
    }
}
