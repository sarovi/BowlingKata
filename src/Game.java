/**
 * Created by Sara on 16/05/2017.
 */
public class Game {
    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
