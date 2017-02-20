package methodOfProgramming.utils;

public class MyStrings{
	public static String createRandomString(int size){
		return createRandomString(size, true, true);
	}

	public static String createRandomString(int size, boolean withUpperCase, boolean withLowerCaes){
		if(!withUpperCase && !withLowerCaes){
			return "";
		}

		char[] resultContent = new char[size];

		for(int i = 0; i < size; i++){
			int randomCode = (int)(Math.random() * 51); // from 0 to 51 = 26 lowerCases + 26 upperCases
			if(withUpperCase && withLowerCaes){
				if(randomCode < 26){
					resultContent[i] = (char)('A' + randomCode);
				}
				else{
					resultContent[i] = (char)('a' + randomCode - 26);
				}
			}
			else if(!withLowerCaes){
				resultContent[i] = (char)('A' + randomCode % 26);
			}
			else{
				resultContent[i] = (char)('a' + randomCode % 26);
			}
		}
		return new String(resultContent);
	}
}