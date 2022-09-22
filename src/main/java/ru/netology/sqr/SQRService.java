package ru.netology.sqr;

public class SQRService {
    public int sqrRange(int lowerRangeLimit, int upperRangeLimit) {
        int numberOfSquares = 0;

        for (int i = 10; i <= 99; i++)
            if ( i*i<= upperRangeLimit && i * i >= lowerRangeLimit ){
                numberOfSquares++;
            }
            return numberOfSquares;
        }
    }

