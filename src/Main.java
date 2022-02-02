import java.util.ArrayList;

public class Main {


    ArrayList<Block> blockchain =  new ArrayList<>();

    public static void main(String[] args) {

        String[] startingTransaction ={"randika sent lakmal 10 bitcoin"};
        Block startingBlock = new Block(0,startingTransaction);

        String[] secondTransaction  = {"lakmal sent joe 9 bitcoins","joe sent sam 5 bitcoins"};
        Block secondBlock =  new Block(startingBlock.getBlockHash(),secondTransaction);

        String[] thirdTransaction  = {"sam sent joe 9 bitcoins","joe sent randika 5 bitcoins"};
        Block thirdBlock =  new Block(secondBlock.getBlockHash(),thirdTransaction);


        System.out.println("Hash Starting");
        System.out.println(startingBlock.getBlockHash());
        System.out.println("--------");

        System.out.println("Hash Second Block");
        System.out.println(secondBlock.getBlockHash());
        System.out.println("--------");

        System.out.println("Hash third Block");
        System.out.println(thirdBlock.getBlockHash());
        System.out.println("--------");

    }
}
