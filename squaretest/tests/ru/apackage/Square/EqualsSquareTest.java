package ru.apackage.Square;

import org.junit.Assert;
import org.junit.Test;
import ru.socialquantum.testtasks.Square;
import ru.socialquantum.testtasks.SquareFactory;

/**
 * Created by Olesya on 20.09.2016.
 */
public class EqualsSquareTest {
    private Square squareA;
    private Square squareB;

    @Test
    public void squareEquals_when_expected_true()
    {
        // arrange:

       this.squareA = SquareFactory.newSquare(100);
       this.squareB = SquareFactory.newSquare(100);

       boolean expected = true;

        // act:

        boolean actual = Act();

        // Assert:

        Assert.assertTrue(expected == actual);
    }

    @Test
    public void squareEquals_when_expected_false()
    {
        // arrange:

        this.squareA = SquareFactory.newSquare(100);
        this.squareB = SquareFactory.newSquare(15.4);

        boolean expected = false;

        // act:

        boolean actual = Act();

        // Assert:

        Assert.assertTrue(expected == actual);
    }

    @Test
    public void squareEquals_when_compared_to_null()
    {
        // arrange:

        this.squareA = SquareFactory.newSquare(100);
        this.squareB = null;

        boolean expected = false;

        // act:

        boolean actual = Act();

        // Assert:

        Assert.assertTrue(expected == actual);
    }

    private boolean Act()
    {
        return squareA.equalsSquare(squareB);
    }
}
