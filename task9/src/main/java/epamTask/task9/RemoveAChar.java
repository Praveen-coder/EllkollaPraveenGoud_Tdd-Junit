package epamTask.task9;

public class RemoveAChar {

	public Object remove(String string) {
		
		String result=string;
		if(string.length()>2)
		{
			if(string.charAt(0)=='A')
			{
				if(string.charAt(1)=='A')
				{
					result=string.substring(2,string.length());
				}
				else
				{
					result=string.substring(1,string.length());
				}
			}
			else if(string.charAt(1)=='A')
			{
				result=string.substring(0,1)+string.substring(2,string.length());
			}
		}
		return result;
	}

}
