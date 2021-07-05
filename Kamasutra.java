import java.io.*;
import java.util.*;
import java.math.*;

class kamasutra{
	public static void main(String[] args) throws Exception{
		if(args[0].equals("-k")){
			Random r = new Random();
			File myObj = new File(args[1]);
			FileOutputStream outFile = new FileOutputStream(args[1]);
			
			List<Character> al = new ArrayList<>();
			
			for(char alphabet = 'a'; alphabet <='z'; alphabet ++ )
			{
				al.add(alphabet);
			}
			
			for(int i = 0;i<26;i++){
				int randomAl = r.nextInt(al.size());
				outFile.write(al.get(randomAl));
				al.remove(randomAl);
			}
			outFile.close();
		}
		
		else if(args[0].equals("-e")){
			Random r = new Random();
			File myObj = new File(args[3]);
			FileOutputStream outFileCtext = new FileOutputStream(args[3]);
			List<Character> key = new ArrayList<>();
			List<Character> plain = new ArrayList<>();
			
			FileReader kText = new FileReader(args[1]);
			int content;
			while((content = kText.read()) !=-1){
				key.add((char) content);
			}
			
			FileReader pText = new FileReader(args[2]);
			while((content = pText.read()) !=-1){
				plain.add((char) content);
			}
			
			for(int q = 0; q<plain.size(); q++){
				for(int w = 0; w<key.size(); w++){
					if((plain.get(q)).equals(key.get(w))){
						if(w % 2 == 0){
							plain.set(q, key.get(w+1));
							break;
						}
						else{
							plain.set(q, key.get(w-1));
						}
					}
				}
			}
			
			for(int i = 0;i<plain.size();i++){
				outFileCtext.write(plain.get(i));
			}
			outFileCtext.close();
		}
		
		else if(args[0].equals("-d")){
			Random r = new Random();
			File myObj = new File(args[3]);
			FileOutputStream outFilePtext = new FileOutputStream(args[3]);
			List<Character> key = new ArrayList<>();
			List<Character> cipher = new ArrayList<>();
			
			FileReader kText = new FileReader(args[1]);
			int content;
			while((content = kText.read()) !=-1){
				key.add((char) content);
			}
			
			FileReader cText = new FileReader(args[2]);
			while((content = cText.read()) !=-1){
				cipher.add((char) content);
			}
			
			for(int q = 0; q<cipher.size(); q++){
				for(int w = 0; w<key.size(); w++){
					if((cipher.get(q)).equals(key.get(w))){
						if(w % 2 == 0){
							cipher.set(q, key.get(w+1));
							break;
						}
						else{
							cipher.set(q, key.get(w-1));
						}
					}
				}
			}
			
			for(int i = 0;i<cipher.size();i++){
				outFilePtext.write(cipher.get(i));
			}
			outFilePtext.close();
		}
	}
}