package com.Practice;
public class RemoveDuplicates {
	public static void removeDuplicates(int input[]) {
		int temp[] =new int[input.length];
		int index =0;
		for (int i = 0; i < input.length; i++) {
			boolean isExist =false;
			for (int j = 0; j < temp.length; j++) {
				if(input[i]==temp[j]) {
					isExist =true;
					break;
				}
			}
			if(isExist==false) {
				temp[index++]=input[i];
			}
		}
		int output[] = new int[index];
		for (int i = 0; i < index; i++) {
			output[i]=temp[i];
		}
		for (int i = 0; i < output.length;i++) {
			System.out.print(output[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[] = {14,-45,14,96,-45,63,74,85,96,63,74,85,74};
        removeDuplicates(a);
	}

}
