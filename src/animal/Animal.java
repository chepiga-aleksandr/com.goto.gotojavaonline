package animal;

import java.util.*;

abstract class Animal{
    public abstract String getType();

    @Override
    public String toString() {
        return "Animal{"+getType()+"}";
    }
}

