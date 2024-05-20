extends java.lang.Object

public class PongBall {
    private double xVelocity;
    private double yVelocity;

    PongBall(int x,
             int y,
             int xVelocity,
             int yVelocity){

    }
    void bounceX(){
        xVelocity = -1 * xVelocity
       
    }
    void bounceY(){
        yVelocity = -1 * yVelocity
    }
    int getX(){
        int x1 = getX();
    }
    int getY(){
        int y1 = getY();
    }
    void move(){
        x += xVelocity;
        return x;
        y+= yVelocity;
        return y;
    }
}
