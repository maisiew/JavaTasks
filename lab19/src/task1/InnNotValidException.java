package task1;

public class InnNotValidException extends Exception{
    private int inn1;

    public int getInn1() {
        return inn1;
    }

    public InnNotValidException(int inn){
        super("ИНН с номером "+ inn + " не действителен!");
    }
}
