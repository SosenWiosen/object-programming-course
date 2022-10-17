package random;

import java.io.IOException;

class Snake {
}

class Cobra extends Snake {
}


public class LearningForTest {
    private Snake snake;

    public void setSnake(Snake snake) {
        this.snake = snake;
    }


    public static void main(String[] args) {
        new LearningForTest().setSnake(new Object());
    }
}
