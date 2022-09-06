package KKOBUGI.web.exception;

import javax.persistence.NoResultException;

public class DuplicateUserException extends RuntimeException{

    public DuplicateUserException(){super();}
    public DuplicateUserException(String message){
        super(message);
    }
}
