class Trial{

    public String toString(){
        return "Indore";
    }

}

public class OperatorExampleOne {
    public static void main(String[] args) {
        
        String s="indore";
        s+="mp";
        System.out.println(s);
        
        //System.out.println('A'+'B');
        //System.out.println("A"+"B");
        //System.out.println("Hello"+true);
        Trial t1=new Trial();
        Trial t2=new Trial();
        //System.out.println(t1.toString()+t2);
        //System.out.println("Hello"+t1);
        System.out.println(t1==t2);
        
        
        
        
        
    }
}
