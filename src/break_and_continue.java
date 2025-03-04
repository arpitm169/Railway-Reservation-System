public class break_and_continue {
    public static void main(String[] args) {
      /*for(int i=0;i<50;i++){
          if(i==3){
              System.out.println("End the loop");
              continue;
          }
          System.out.println(i);
          System.out.println("Java seekh raha hu");*/
      //}
        for(int i=0;i<50;i++){
            System.out.println(i);
            System.out.println("Java seekho");
            if(i==2){
                System.out.println("End the loop");
                break;
            }
        }
}
}
