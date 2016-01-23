package models;

/**
 * Created by Lee on 1/21/2016.
 */
import java.util.*;
import com.google.inject.Singleton;

@Singleton
public class board {
    Stack[] boardArray = new Stack[4];
    public void init() {
        for (int i = 0; i < 4; i++) {
            boardArray[i] = new Stack();
        }
    }
    public void addStack(int col, card pushCard){
        boardArray[col].push(pushCard);
        //System.out.println("Searching 'code' in stack" + boardArray[col].search(pushCard));
    }

    /*public void topStack(int col){
        System.out.println("Column: " + col);
        System.out.println("Top Element: " + boardArray[col].peek());
    }*/

    public void removeStack(int col){
        boardArray[col].pop();
    }

    public void moveCol(int toCol, int fromCol) {
        if(boardArray[toCol].isEmpty() && !boardArray[fromCol].isEmpty()) {

            boardArray[toCol].push(boardArray[fromCol].peek());
            boardArray[fromCol].pop();
        }
    }
}
