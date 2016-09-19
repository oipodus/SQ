package ru.apackage.Square;

import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.DoubleHolder;
import ru.socialquantum.testtasks.Square;
import ru.socialquantum.testtasks.SquareFactory;

/**
 * Created by Olesya on 18.09.2016.
 */
public class SquareTest {

    private Square square;
    private double _squareSideLength;

    public void stub()
    {
        square = SquareFactory.newSquare(_squareSideLength);
    }

    @Test
    public void square_when_side_is_int()
    {
        // arrange:

        this._squareSideLength = 100;

        double expected = 10000;

        stub();

        // act:

        double actual = Act();

        // Assert:

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void square_when_side_is_negative()
    {
        // arrange:

        this._squareSideLength = -100;

        double expected = 10000;

        stub();

        // act:

        double actual = Act();

        // Assert:

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void square_when_side_is_double_inf()
    {
        // arrange:

        this._squareSideLength = Double.POSITIVE_INFINITY;

        double expected = Double.POSITIVE_INFINITY;

        stub();

        // act:

        double actual = Act();

        // Assert:

        Assert.assertEquals(expected, actual, 0);
    }

    private double Act()
    {
        return square.square();
    }
}
