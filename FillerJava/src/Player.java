
public class Player {


    private String Nom;
    private Score score;
    private int startX;
    private int startY;

    public Player(String nom, int startX, int startY) {
        Nom = nom;
        this.startX = startX;
        this.startY = startY;
    }

    public Player(int startY, int startX) {
        this.startY = startY;
        this.startX = startX;
    }

    public void updateScore(Board board){
        double result =  score.calculateScore(board);
        score.setScore(result);
    }

    public void play(Board board) {
        Colors color;
        color = askColor();
        board.take(color, this);


    }

    public static Colors askColor() {
        String answer;
        Colors color;
        System.out.println("choisissez une couleur : ");
        answer = Keyboard.askString();
        color = Keyboard.stringToColor(answer);
        return color;

    }




    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public double getScore() {
        return score.getScore();
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
