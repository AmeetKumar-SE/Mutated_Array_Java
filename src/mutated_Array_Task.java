public class mutated_Array_Task {

    public static void main(String[] args){
        int[] a = new int[]{4,0,1,-2,3};
        int[] c = solution(a);
        for(int j=0;j<c.length;j++){
            System.out.print(c[j] + " ");
        }

    }

    public static int[] solution(int a[]){
        int[] b = new int[a.length];
        for(int i=0;i<=a.length-1;i++){
            if(i-1>=0){
                b[i] += a[i-1];
            }

            b[i] += a[i];

            if(i+1<=a.length-1){
                b[i] += a[i+1];
            }
        }

        return  b;
    }
}
