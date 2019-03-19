package WordTest;

import java.util.Map;
import java.util.Map.Entry;

/**********************************
*@ClassName    WordCount.java
*@author       zlin
*@date         2019年3月18日 下午10:46:48
*@version      v1.0
*@description 
***********************************
*/
public class WordCount {
	//查询用户所需单词词频
			public String[]  query(Map<String, Integer> Map,String s) {
				String[] word= s.split(",");//用户输入时，单词之间用"，"隔开
		        int i;
		        for(i=0; i<word.length; i++) {
		        	for(Entry<String,Integer> entry : Map.entrySet()) { 
		        		if(word[i].equals(entry.getKey()))
		        		{
		        			System.out.println(entry.getKey() + ":\t " + entry.getValue()); 
		        			break;
		        		}
		            } 
		        }
				return word;
		    }
	}

