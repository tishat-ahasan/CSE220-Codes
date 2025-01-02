class Main{
  
  public static void post_Order(BTNode root){
    if (root == null){
      return;
    }
    post_Order(root.left);
    post_Order(root.right);
    System.out.print(root.value+" ");
  }
  
  public static BTNode createTreeFromArray(int[] arr, int i){
    if (i >= arr.length || arr[i] == -1){
        return null;
    }
    BTNode root = new BTNode(arr[i]);
    root.left = createTreeFromArray(arr, 2*i);
    root.right = createTreeFromArray(arr, 2*i+1);
    return root;
  }
  
  public static void main(String [] args){
  
    System.out.println("abcd");
      BTNode N60 = new BTNode(60);
      BTNode N50 = new BTNode(50);
      BTNode N20 = new BTNode(20);
      BTNode N10 = new BTNode(10);
      BTNode N5 = new BTNode(5);
      BTNode N6 = new BTNode(6);
      BTNode N30 = new BTNode(30);
      
      N50.left = N30;
      N50.right = N60;
      N30.left = N20;
      N60.right = N10;
      N10.left = N5;
      N10.right = N6;
      
      post_Order(N50);
      System.out.println("New Tree");
      int[] arr = {-1, 100, 50, 60, -1, 40, 70, 10, -1, -1, 80, 90, -1, 15, 5, 200};

      //80 90 40 50 15 70 5 200 10 60 100
      
      BTNode new_tree = createTreeFromArray(arr, 1);
      post_Order(new_tree);
  }


}