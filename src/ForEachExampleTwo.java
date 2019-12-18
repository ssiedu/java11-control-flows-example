
public class ForEachExampleTwo {

    public static void add(int ar[]){
        int sum=0;
        for(int num:ar){
            sum=sum+num;
        }
        System.out.println(sum);
    }
    
    /*
    public static void add(int ar[], int size){
        int sum=0;
        for(int i=0; i<size; i++){
            sum=sum+ar[i];
        }
        System.out.println(sum);
    }
    */
    
    public static void main(String[] args) {

        int x[]={10,20,30,40,50};
        int y[]={1,2,3,4,5,6,7,8,9,10};
        int z[]={2,4,6};
        add(x);
        add(y);
        add(z);
    }
}
