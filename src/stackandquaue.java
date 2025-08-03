import java.util.*;

public class stackandquaue {
   protected int[] data;
   private static final int DEFAULT_SIZE=10;
   int ptr=-1;





   public stackandquaue(){
       this(DEFAULT_SIZE);
   }

    public stackandquaue(int size) {
        this.data = new int[size];
    }
    public  boolean push(int item){
       ptr++;
       data[ptr]=item;
       return true;
    }
}
