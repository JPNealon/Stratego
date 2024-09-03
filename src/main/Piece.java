package src.main;
import java.util.Random;

public class Piece{
    public Integer shipSize;
    public Integer shipHealth;
    public Coordinate[] shipCoordinates;
    public boolean isSunk;
    public Integer initX;
    public Integer initY;
    public Integer directionInt;
    public String direction;

    public Piece(Integer size){
        this.shipSize = size;
        this.shipHealth = size;
        this.isSunk = false;
        shipCoordinates = new Coordinate[5];
    }

}

