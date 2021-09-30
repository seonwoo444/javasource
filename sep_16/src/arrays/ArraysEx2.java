package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {

	public static void main(String[] args) {
		int arr1[] = {11,22,-5,40};
		int arr2[] = {11,22,-5,44};
		
		System.out.println(Arrays.equals(arr1, arr2) ? "같음" : "다름");

		System.out.println();
		
		int arr3[] = {43,46,12,57,34,62,75};
		
		Arrays.sort(arr3);//오름차순 으로
		System.out.println(Arrays.toString(arr3));
		
		Integer arr4[] = {43,46,12,57,34,62,75};
		Arrays.sort(arr4, Comparator.reverseOrder());//Comparator.naturalOrder() : 오름차순
		System.out.println(Arrays.toString(arr4));
		
		String strArr[] = {"good", "height", "very", "apple", "zero", "zoo"};
		
		Arrays.sort(strArr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
		
		char chArr[] = {'ㅎ', 'ㅇ', 'ㅈ', 'ㄹ', 'ㅈ', 'ㅂ'};
		Arrays.sort(chArr);
		System.out.println(Arrays.toString(chArr));
		
		
		
	}

}
