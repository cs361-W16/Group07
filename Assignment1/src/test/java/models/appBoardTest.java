package models;

/**
 * Created by Lee on 1/22/2016.
 */

import org.junit.Test;

import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;
import org.mockito.internal.matchers.InstanceOf;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import java.util.*;

public class appBoardTest extends NinjaDocTester{
    @Test
    public void testBoard(){
        board newBoard = new board();
        assertThat(newBoard,instanceOf(board.class) );
    }

    @Test
    public void testBoardInit(){
        board newBoard = new board();
        //card newCard = new card("Diamond", "Jack");
        newBoard.init();
        for(int i =0;i<4;i++){
            assertTrue(newBoard.boardArray[i].empty());
        }

    }

    @Test
    public void testBoardAdd(){
        board newBoard = new board();
        card newCard = new card("Diamond", "Jack");
        newBoard.init();
        newBoard.addStack(0,newCard);
        assertTrue(!(newBoard.boardArray[0].empty()));
    }

    @Test
    public void testBoardRemove(){
        board newBoard = new board();
        card newCard = new card("Diamond", "Jack");
        newBoard.init();
        newBoard.addStack(0,newCard);
        assertTrue(!(newBoard.boardArray[0].empty()));
        newBoard.removeStack(0);
        assertTrue(newBoard.boardArray[0].empty());
    }

    @Test
    public void testMoveCol() {
        board newBoard = new board();
        card newCard = new card();
        newBoard.init();
        newBoard.boardArray[0].push(newCard);
        newBoard.moveCol(1,0);
        assertThat(newBoard.boardArray[1].peek(), instanceOf(card.class));

    }
}
