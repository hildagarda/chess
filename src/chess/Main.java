package chess;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.arr5);
        System.out.println(board.arr1);
        System.out.println(board.arr2);
        board.middleLines();
        System.out.println(board.arr4);
        System.out.println(board.arr3);
        System.out.println(board.arr5);
    }
}
