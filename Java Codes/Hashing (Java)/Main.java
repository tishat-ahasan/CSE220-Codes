public class Main{
  public static void main(String[] args){
    HashTable ht = new HashTable(5);
    ht.insert("Ahasan", 35);
    ht.insert("Abcde", 100);
    ht.insert("Mnopqr", 80);
    
    ht.printHashTable();
  }
}