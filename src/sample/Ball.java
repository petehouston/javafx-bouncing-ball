package sample;

public class Ball {
    private int x;
    private int y;
    private int radius;
    private int dx;
    private int dy;

    public Ball(int radius) {
        this.radius = radius;
        x = radius; y = radius;
        dx = 1; dy = 1;
    }

    public int getRadius() {
        return radius;
    }

    public void reverseX() {
        dx *= -1;
    }

    public void updateX(int x) {
        this.x = x;
    }

    public void updateY(int y) {
        this.y = y;
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public void reverseY() {
        dy *= -1;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }
}
