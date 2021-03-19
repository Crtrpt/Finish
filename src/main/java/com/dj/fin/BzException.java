package com.dj.fin;

import java.io.Serializable;

public class BzException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public BzException() {
        super();
    }
    public BzException(String msg)   {
        super(msg);
    }
    public BzException(String msg, Exception e)  {
        super(msg, e);
    }
}
