public class Arrays1 { 
    public static void main(String[] args) {
        int [] marks = new int[5];
        System.out.println("length is : "+marks.length);
       String [] student = {"neel","yash","chiku","bhano","mohit"};

        marks[0]=90;
        marks[1]=80;
        marks[2]=40;
        marks[3]=89;
        marks[4]=87;

        for(int i=student.length-1;i>=0;i--){
            System.out.println(student[i]);
        }

        // for each loop 
        
        for(int element : marks){
            System.out.println(element);
        }
    }
    
}
