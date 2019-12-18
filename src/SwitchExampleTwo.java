
public class SwitchExampleTwo {

    public static void main(String[] args) {

        String state=args[0];
        
        switch(state){
            case "mp":
                System.out.println("Bhopal");
            break;
            case "mh":
                System.out.println("Mumbai");
            break;
            case "rj":
                System.out.println("Jaipur");
            break;
            default:
                System.out.println("State Not Allowed");
        }
        
    }
}
