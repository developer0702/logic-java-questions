package logic;


import java.util.*;
import java.util.stream.Collectors;
//map operations on elements using stream api
public class ArrayOperation {

public static void main(String[]args){
            
			List<Integer>list=Arrays.asList(2,3,4,5);
			
			List<Integer>collect=list.stream().filter(s->s%2==0).collect(Collectors.toList());
          System.out.println(collect);     
	 }
}