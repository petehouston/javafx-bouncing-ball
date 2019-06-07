package sample;

import javafx.scene.canvas.GraphicsContext;

public class BounceBall {
    private Ball ball;
    private GraphicsContext context;

    public BounceBall(Ball ball, GraphicsContext context) {
        this.ball = ball;
        this.context = context;
    }

    private void clear() {
        context.clearRect(0, 0, context.getCanvas().getWidth(), context.getCanvas().getHeight());
    }

    private void drawBall() {
        context.fillOval(ball.getX(), ball.getY(), ball.getRadius(), ball.getRadius());
    }

    public void move() {
        clear();
        drawBall();
        double width = context.getCanvas().getWidth();
        double height = context.getCanvas().getHeight();
        int r = ball.getRadius();
        if (ball.getX() + r > width || (ball.getX() < 0)) {
            ball.reverseX();
        }

        if (ball.getY() + r > height || (ball.getY() < 0)) {
            ball.reverseY();
        }

        ball.move();
    }

    public Ball getBall() {
        return ball;
    }

    public GraphicsContext getContext() {
        return context;
    }
}
