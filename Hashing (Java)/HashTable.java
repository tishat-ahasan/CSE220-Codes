class HashTable{
  Node[] hashTable;
  
  public HashTable(int size){
    hashTable = new Node[size];
  }
  
  // hash function
  public int hashFunction(String key){
    int index = key.length() %  hashTable.length;
    return index;
  }
  
  // insert
  public void insert(String key, int value){
    int index = hashFunction(key);
    if (hashTable[index] == null){
      Node new_node = new Node(key, value);
      hashTable[index] = new_node;
    }
    else{
      Node new_node = new Node(key, value);
      new_node.next = hashTable[index];
      hashTable[index] = new_node;
    }
    System.out.println("Key and value have been inserted!!!");
  }
  
  // search
  
  // remove
  
  // print
  public void printLL(Node head){
    Node temp = head;
    while (temp != null){
      System.out.print("(" + temp.name + "," + temp.number + ")"); 
      if (temp.next != null) {
        System.out.print("-->");
      }
      temp = temp.next;
    }
  }
  
  public void printHashTable(){
    for (int i=0; i<hashTable.length; i++){
      System.out.print("index "+i+":");
      if (hashTable[i] != null){
        printLL(hashTable[i]);
      }
      System.out.println();
    
    }
  
  }
  
}