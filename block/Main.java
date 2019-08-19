import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {


    public static void main(String[] args) {
        boolean state = true;
        String text = "BOO";
        boolean foundBlock = false;
        String[] textArray = text.split("");
//        String[] textArray = text1.getText().split("");

        Block[] blocks = new Block[]{
                new Block("B", "O"),
                new Block("X","K"),
                new Block("D","Q")
//                new Block(new String[]{"CP"}, false),
//                new Block(new String[]{"NA"}, false),
//                new Block(new String[]{"GT"}, false),
//                new Block(new String[]{"RE"}, false),
//                new Block(new String[]{"TG"}, false),
//                new Block(new String[]{"QD"}, false),
//                new Block(new String[]{"FS"}, false),
//                new Block(new String[]{"JW"}, false),
//                new Block(new String[]{"HU"}, false),
//                new Block(new String[]{"VI"}, false),
//                new Block(new String[]{"AN"}, false),
//                new Block(new String[]{"OB"}, false),
//                new Block(new String[]{"ER"}, false),
//                new Block(new String[]{"FS"}, false),
//                new Block(new String[]{"LY"}, false),
//                new Block(new String[]{"PC"}, false),
//                new Block(new String[]{"ZM"}, false)

        };

        for (String letter : textArray) {
            foundBlock = false;

            for (Block block : blocks) {
                foundBlock = block.getBlockResult(letter);
                if(foundBlock) {
                    break;
                }
            }
            if (!foundBlock) {
                System.out.println("Can't be made");
                break;
            }
        }
        if (foundBlock) {
            System.out.println("It can be made");
        }
    }
}