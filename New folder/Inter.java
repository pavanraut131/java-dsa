public class Inter {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();
    }
    
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("it moves in all direction");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
