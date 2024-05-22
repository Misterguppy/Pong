public class PongScore {
    int score = 0;
    public PongScore(){
        
    }

    
    public int getScore(){
        return score;
    }
    void scorePoints(int points){
        score += points;
    }
}
