

public class Vector2D{
    double x; 
    double y; 
    /**
     * constructor
     * @param x x-coordinate 
     * @param y y-coordinate
     */
    public Vector2D(double x, double y){
     this.x = x;
     this.y= y; 
    }
    /**
     * getter for the x position of the vector
     * @return the x coordinate
     */
    public double getX(){
        return x; 
    }
    /**
     * getter for the y posiiton of the vector
     * @return the y coordinate
     */
    public double getY(){
        return y; 
    }
    /**
     * method to add a vector to the current vector
     * @param vector the vector to be added 
     * @return the new added vector
     */
    public Vector2D add(Vector2D vector){
        Vector2D result = new Vector2D(this.getX() + vector.getX(), this.getY()+ vector.getY());
        return result; 
    }
    /**
     * method to substract a vector from our current vector
     * @param vector the vector to be substracted
     * @return the substracted new vector
     */
    public Vector2D substract(Vector2D vector){
        Vector2D result = new Vector2D(this.getX() - vector.getX(), this.getY()-vector.getY());
        return result;
    }
    /**
     * method to scale a vector by a scalar 
     * @param scalingFactor scalar 
     * @return a new scaled vector
     */
    public Vector2D scale(double scalingFactor){
        Vector2D result = new Vector2D(this.getX() * scalingFactor, this.getY() * scalingFactor);
        return result;
    }
    /**
     * method to calculate the magnitude of a vector ||v||
     * @return magnitude of the given vector
     */
    public double magnitude(){
        double result = Math.sqrt(((this.getX()*this.getX()) + (this.getY()*this.getY())));
        return result;
    }

    
}