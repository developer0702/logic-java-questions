package practice_session1;

//Online C compiler to run C program online
public class PrimeNo {
public static void main(String []args){
    
     int n=100;
          for(int i=0;i<=n;i++){
           if(isPrime(i)){
         System.out.print(i+" ");
     }
 }
}
 
   private static boolean isPrime(int n){
      if(n<=1){
         return false;
     }
     for(int i=2;i*i<=n;i++){
         if(n%i==0){
             return false;
         }
     }
     return true;
  }
  
}
