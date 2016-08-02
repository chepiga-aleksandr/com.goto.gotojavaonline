package module8;

public class Aster extends Flower implements Comparable<Aster> {


    public Aster(String name, String colour, int count) {
        super(name, colour, count);
    }

    /*//    @Override
    public String getName() {
        return "aster"; };
//    @Override
    public String getColour() { return "red";};
 //   @Override
    public int getCount() {return 10;};*/

    public int compareTo(Aster other) {
        int nn = getName().compareTo(other.getName());
        if(nn != 0) {
            return nn;
        }

        int bb = getColour().compareTo(other.getColour());
        if (bb != 0) {
            return bb;
        }

        return getCount() - other.getCount();
    }
}


