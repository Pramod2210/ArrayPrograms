public class MaxMin {
    public static void main(String[] args) {
        int a[]={20,10,30,40,60,50};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("max= "+max);
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("min= "+min);
    }
}
