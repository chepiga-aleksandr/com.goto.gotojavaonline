package main.goitonline.module3.flowers;

abstract class Flower {

       public abstract String getType();

       @Override

       public String toString() {

       return "Flower{" + getType() + "}";
   }
}