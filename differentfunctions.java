
public class differentfunctions {
	String reverse(String str){
		String str1="";
		char[] arr=str.toCharArray();
		for (int i = arr.length-1; i>=0; i--) {
			str1=str1+arr[i];
			}
		String manStr=new String(str1);
		return manStr;
	}
	String tolower(String str)
	{
	char[] arr=str.toCharArray();
	String strlow="";
	for(int i=0;i<str.length();i++){
		if(arr[i]>=65 && arr[i]<=90)
			{
			arr[i]=(char) (arr[i]+32);
			}
			strlow=strlow+arr[i];
		}
	String manStr=new String(strlow);
	return manStr;
	}
	
	String toupper(String str)
	{
	char[] arr=str.toCharArray();
	String strup="";
	for(int i=0;i<str.length();i++){
		if(arr[i]>=97 && arr[i]<=122)
			{
			arr[i]=(char) (arr[i]-32);
			}
			strup=strup+arr[i];
		}
	String manStr=new String(strup);
	return manStr;
	}
	
	String toggle(String str)
	{
	char[] arr=str.toCharArray();
	String strtog="";
	for(int i=0;i<str.length();i++){
		if(arr[i]>=97 && arr[i]<=122)
			{
			arr[i]=(char) (arr[i]-32);
		
			}
		else if(arr[i]>=65 && arr[i]<=90)
		{
			arr[i]=(char) (arr[i]+32);
		}
			strtog=strtog+arr[i];
		}
	String manStr=new String(strtog);
	return manStr;
	}
	String reverseupper(String str) {
		String str1="";
		String str2="";
		String str3="";
		char[] arr=str.toCharArray();
		for (int i = arr.length-1; i>=0; i--) {
			str1=str1+arr[i];
			}
		
		char[] arr2=str1.toCharArray();
		for(int i = 0;i<str1.length();i++) {
			if(arr2[i]>='A' && arr2[i]<='Z')
				str2=str2 + (char)(arr2[i] + 32);
			else
				str2=str2 + arr2[i];
		}
		
		char[] arr3=str2.toCharArray();
		for(int i = 0;i<str1.length();i++) {
			if(arr[i]>='A' && arr[i]<='Z')
				str3=str3 + (char)(arr3[i]-32);
			else
					str3=str3 + arr3[i];
		}
		
		String myStr=new String(str3);
		return myStr;
	}

	
   public static void main(String[] args) {
	differentfunctions df=new differentfunctions();
	System.out.println(df.reverse("HeLLo World"));
	System.out.println(df.tolower("HeLLo"));
	System.out.println(df.toupper("HeLlo"));
	System.out.println(df.toggle("HeLLo"));
	System.out.println(df.reverseupper("HeLLoWorld"));
	
}
}
