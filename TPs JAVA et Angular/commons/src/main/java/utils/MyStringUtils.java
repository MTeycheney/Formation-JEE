package utils;

public class MyStringUtils
{
	public boolean isNullOrEmpty(String chainVerif)
	{
		String chn = chainVerif;
		
		return ((chn == null) || chn.trim().isEmpty()) ? true : false;
	}
}