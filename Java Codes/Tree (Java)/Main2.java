public class Main2{
  public static void postOrder(BTNode root){
    if (root == null){
     return; 
    }
    
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.value + " ");
    return;
  }
    
  public static BTNode createTreeFromArray(Integer[] arr, int index_or_root){
    //Base case
    if (index_or_root >= arr.length || arr[index_or_root] == null){
      return null;
    }
    BTNode root = new BTNode(arr[index_or_root]);
    root.left = createTreeFromArray(arr, 2*index_or_root);
    root.right = createTreeFromArray(arr, 2*index_or_root+1);
    return root ;
  }
  
  public static BTNode insert(BTNode root, int value){
    if (root == null){
        BTNode node = new BTNode(value);
        return node;
    }
    if (root.value == value){
        System.out.println("Value already exists");
          return root;
    }
    if (value > root.value){
        root.right = insert(root.right, value);
    }
    else{
      root.left = insert(root.left, value);
    }
    return root;
  
  }
    
  public static void main(String[] args){
   System.out.println("BST Codes"); 
   
   int [] arr = {70, 10, 80, 20, 30, 40, 5, 90, 75, 72, 1, 99, 95};
   BTNode root = null;
   for (int i = 0; i< arr.length; i++){
     root = insert(root, arr[i]);
   }
   postOrder(root);
  }

}