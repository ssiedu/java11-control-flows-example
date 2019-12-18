
public class ConversionDemo {
    public static void main(String[] args) {

        //case-1 -> types same (no conversion required)
        int v1=10;
        double v2=25.56;
        //case-2 -> types are different (conversion required)
        //2-a) no error (implicit conversion)
        double v3=50;
        long v4=25;
        //2-b) possible loss of precisions
        int v5=(int) 23.45; //double to int
        float v6=(float) 45.66; //double to float
        //2-c) conversion is not possible
        //double v7=(double)true;
        //boolean v8=(boolean)1;
        
        //some-exceptional case
        //container is large then also explicit conversion
        //required
        
        long v9=(long) 5.5f;
        
        //int v10=2.5f;
        
        System.out.println(v9);
        
        
        
        
        
        
        
        
        
        
    }
}
