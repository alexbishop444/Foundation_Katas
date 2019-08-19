import java.lang.reflect.Array;

public class Block {
    private String setA;
    private String setB;
    private boolean used;

    public boolean getBlockResult(String args){

        if (!used) {
            if (args.equals(setA) || args.equals(setB)) {
                this.used = true;
                return true;
            }
        }

        return false;
    }

    public Block(String setA, String setB) {
        this.setA = setA;
        this.setB = setB;
    }
}
