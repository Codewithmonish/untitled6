import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class treeQuestion {
    public static void main(String[] args) {
        

    }
    public List<List<Integer>> zigzack(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean reverse=false;
        while (!queue.isEmpty()){
            int levelsize=queue.size();
            List<Integer> currentlevel=new ArrayList<>(levelsize);
            for (int i = 0; i < levelsize; i++) {

                if (!reverse){
                    TreeNode currentnode=queue.pollFirst();
                    //currentlevel.add(currentlevel);


                }
                else {

                }
                reverse=!reverse;

            }


        }

        return result;
    }
}
