public class Utility{

  //gives random int in a given interval
  public int chance(int start, int end){
      return start + (int)(Math.random() * (end - start));
    }
  
}//end class
