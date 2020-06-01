package FINALS;

public class StringUtil 
{
public static String pad(String s, int length)
	{
		if(s.length() < length)
			{
				StringBuilder sb = new StringBuilder(s);
				while(sb.length() < length)
				{
					sb.append(" ");
				}
			return sb.toString();
			}
		else
		{
		return s.substring(0,length);
		}
	}
public static String spad(String s, int length)
{
	if(s.length() < length)
	{
		StringBuilder sb = new StringBuilder(s);
		while(sb.length() < length)
		{
			sb.insert(0," ");
		}
		return sb.toString();
	}
	else
	{
		return s.substring(0,length);
	}
}

}