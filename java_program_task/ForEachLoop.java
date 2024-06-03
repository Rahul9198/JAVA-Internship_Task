public class ForEachLoop {
    public static void main(String[] args) {
        double nums[] = {10.1,11.2,12.3,13.4,14.5};
        double result = 0;
        int i;
        for(i=0;i<nums.length;i++)   //nums.lendth gives lenght of array
        {
            result = result+nums[i];

        }
         System.out.println("Average is"+result/5);
        
    }
    
}
