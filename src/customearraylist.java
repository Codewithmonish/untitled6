import java.util.ArrayList;
import java.util.Arrays;

public class customearraylist {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public customearraylist(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if (isfull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];

        }
        data=temp;
    }

    private boolean isfull(){
       return size==data.length;
    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];

    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "customearraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
     //   ArrayList  list=new ArrayList<>();
        customearraylist list=new customearraylist();
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list);

    }
}
