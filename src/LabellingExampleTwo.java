
public class LabellingExampleTwo {

    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            //this time break is written in outer loop
            //so it will break the outer one.
            if(i==3){
                break;
            }
            
            for(int j=1; j<=5; j++){
                System.out.println(j);
            }
            System.out.println("Inner Loop Is Terminated");
        }
        System.out.println("Outer Loop Is Terminated");
        
    }
}
