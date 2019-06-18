package ayushi1;

import java.util.Scanner;

public class frequency_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine();
str=str.toUpperCase();

int count[]=new int[26];

for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)>=65 && str.charAt(i)<=90)
count[str.charAt(i)-65]=count[str.charAt(i)-65]+1;
}
for(int i=0;i<26;i++)
{
	if(count[i]!=0)
	{
		System.out.print((char)(i+65)+" ");
	for(int j=0;j<count[i];j++)
		System.out.print("#");
	System.out.println();
	}
}}

	}


