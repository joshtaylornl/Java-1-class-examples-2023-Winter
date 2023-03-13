package ca.nl.cna.java1.staticexamples;

/**
 * Rectangle class. All lengths and widths must be greater than 0. Default value for length and width is 1.
 *
 * •	Rectangles must have lengths and widths larger than 0
 * •	Use the application class ‘FunWithRectangles.java’ in the midterm folder to test your class. Note that your class will be tested with a more robust class so make sure you test your class completely.
 */
public class Rectangle {

    private double length;
    private double width;

    /**
     * Constructor that takes in length and width. Both values must be greater than 0. Negative or 0 values will result
     * in the default value of 1 being used.
     * @param length length
     * @param width
     */
    public Rectangle(double length, double width) {
        if(length > 0){
            this.length = length;
        } else {
            this.length = 1;
        }

        if(width > 0){
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    /**
     * Get the length
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * Set the length. Length must be greater than 0 or it defaults to 1
     * @param length length
     */
    public void setLength(double length) {
        if(length > 0){
            this.length = length;
        } else {
            this.length = 1;
        }
    }

    /**
     * Get the width
     * @return width
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Set the width. Width must be greater than 0 or it defaults to 1
     * @param width width
     */
    public void setWidth(double width) {
        if(width > 0){
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    /**
     * Calculate the area of the rectangle. Area is length * width
     * @return area
     */
    public double area(){
        //An example of using a static method in a dynamic context
        return area(this.length, this.width);
    }

    /**
     * Calculate the perimeter of the rectangle. Perimeter is 2 * length + 2 * width.
     * @return perimeter
     */
    public double perimeter(){
        return 2 * this.length + 2 * this.width;
    }

    /**
     * Determine if the rectangle is a square
     * @return true if square
     */
    public boolean isSquare(){
        return this.length == this.width;
    }


    /**
     * Calculate the area of a rectangle based on a lenght and width
     * @param length length (must be >0)
     * @param width width (must be >0)
     * @return
     */
    public static double area(double length, double width){
        return length * width;
    }


}
