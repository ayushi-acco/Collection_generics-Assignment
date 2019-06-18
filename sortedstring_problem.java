package ayushi1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class sortedstring_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		System.out.println("enter the number of strings");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.nextLine();
String str[]=new String[n];
for(i=0;i<n;i++)
	str[i]=sc.nextLine();
Map<String,Integer> mymap=new HashMap<>();
String str1;
int count=0;
for(int j=0;j<n;j++)
{
str1=str[j];
if(!mymap.containsKey(str1))
{
for(i=0;i<n;i++)
{
	if(str[i].equals(str1))
		count++;
}
mymap.put(str[j],count);
count=0;
}
}
Map<String,Integer> mymap1=sortByValue(mymap);
Iterator<String> it=mymap1.keySet().iterator();

System.out.println(mymap1);
String res[]=new String[mymap.size()];
i=0;
while(it.hasNext())
	res[i++]=it.next();
for(i=0;i<mymap.size();i++)
	System.out.println(res[i]);
System.out.println(mymap1);
}
	public static Map<String, Integer> sortByValue(Map<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
}