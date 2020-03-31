package TDD;
public class RemoveCharacter {
	
public String RCString(String S)
	{
		StringBuilder s=new StringBuilder(S);
		if(s.charAt(1)=='A')
			s.deleteCharAt(1);
		if(s.charAt(0)=='A')
			s.deleteCharAt(0);
		return String.valueOf(s);
	}

}
