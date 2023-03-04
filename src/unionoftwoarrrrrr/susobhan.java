package unionoftwoarrrrrr;
import java.util.*;
public class susobhan {
	public static void main(String args[]) {
		int arr1[]= {1, 2, 3, 4, 5};int n = arr1.length;
		int arr2 []= {4, 5, 6, 7, 8};int m= arr2.length;
		
		Set<Integer> s=new HashSet<Integer>();
		
		for(int i =0;i<n;i++) {
			s.add(arr1[i]);
		}
		
		for(int i =0;i<m;i++) {
			s.add(arr2[i]);
		}
		
		System.out.print(s+" ");
		
		
	
	}

}
