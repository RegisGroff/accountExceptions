package entities;

public class DomainException extends RuntimeException{
    public DomainException(String msg){
        super(msg);
    }
}