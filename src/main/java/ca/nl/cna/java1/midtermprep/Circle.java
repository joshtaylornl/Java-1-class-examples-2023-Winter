package ca.nl.cna.java1.midtermprep;

/**
 * Simple class representing a Circle
 */
public class Circle {

    private double radius;

    /**
     * Create a circle. If radius is less than or equal to 0 the radius is set to 1
     * @param radius must be greater than 0 (set to 1 otherwise)
     */
    public Circle(double radius) {
        if(radius > 0){
            this.radius = radius;
        } else {
            this.radius = 1;
        }

    }

    /**
     * Get the radius
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set the radius. Note: must be greater than 0
     * @param radius radius (greater than 0)
     */
    public void setRadius(double radius) {
        if(radius > 0){
            this.radius = radius;
        }
    }

    /**
     * Calculate the area as PI*r^2
     * @return area
     */
    public double getArea(){
        return Math.PI * Math.pow(this.getRadius(),2);
    }

    /**
     * Calculate the perimeter as 2*PI*r
     * @return perimeter
     */
    public double getPerimeter(){
        return 2 * Math.PI * this.getRadius();
    }

}
