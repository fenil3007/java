public class PracticeSetArrays {
    public static void main(String[] args) {
       // problem -1
        float [] a = {10.0f,23.0f,2.0f,3.0f,6.0f};
        float sum=0f;
         for(int i=0;i<a.length;i++){
            sum=sum+a[i];

         }
         System.out.println(sum);
        
    // problem-2

    int [] marks = {10,12,13,12,15};
    int n=18;
    int count=0;

    for(int i=0;i<marks.length;i++){
        if(marks[i]==n){
            count++;
        }
    }
   
        System.out.println("given number is presented in array "+ count + " times");


        // problem-3

        int [] marks1 = {67,78,67,56,69} ;
        float sum1=0;
        float average;
        for(int element:marks1){
            sum1= sum1+element;
        }

        average= sum1/(marks1.length);
        System.out.println("Avearge of an array is :"+average);


        //problem-4

        int [][] m1 = {{1,2,3},{4,5,6}};
        int [][] m2 = {{7,8,9},{11,12,10}};
        int [][] s= new int[2][3];

        for (int i=0;i<m1.length;i++){
            for(int j=0;j<m1[1].length;j++){
                s[i][j]=m1[i][j]+m2[i][j];
            }
        }

        for (int i=0;i<s.length;i++){
            for(int j=0;j<s[1].length;j++){
               System.out.print(s[i][j]);
               System.out.print("  ");
            }
            System.out.print("\n");
        }

        // problem-5
        int arr[] = {7,3,42,234,345,2};
        int l=arr.length;
        int temp;
       int k = Math.floorDiv(l,2);
   
       
       for(int i=0; i<k;i++){
        temp=arr[i];
        arr[i]=arr[l-1-i];
        arr[l-1-i]=temp;
        
       }

       for (int element : arr){
        System.out.print(element+" ");
       }
       System.out.println("\n");
       // program - 6 find maximum element in array

       int arr1[] = {-256,257,-362,497,-1332,-1320,545};
       int max=Integer.MIN_VALUE;
       
       for (int e:arr1){
        if(e>max){
            max=e;
        }
        
       }
       System.out.println(max);


       //problem-7 find minimum value
       int min=Integer.MAX_VALUE;

       for(int e:arr1){
        if (e<min){
            min=e;
        }
       }
       System.out.println(min);

       // problem- 8 array is sorted or not.


       boolean isSorted = true;
       int[] arr2={1,2,3,4,5,67,89,100};

       for(int i=0;i<arr2.length-1;i++){
        if(arr2[i] > arr2[i+1]){
            isSorted=false;
            break;
        }
       }


if (isSorted){
    System.out.println("the array is sorted.");
}
else{
    System.out.println("the array is not sorted.");
}

    
        
    }
    
}
