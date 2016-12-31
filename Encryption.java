import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Encryption{
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuffer sb = new StringBuffer("");
	public static void main(String[] args) throws Exception{
		String temp = in.readLine();
		String input = temp.replaceAll("( )+","");
		int rows = (int)Math.sqrt(input.length());
		int cols = (int)Math.ceil(Math.sqrt(input.length()));
		char c[] = input.toCharArray();
		for(int i = 0; i < cols; i++){
			int temp2 = i;
			while(temp2 < input.length()){
				sb.append(c[temp2]);
				temp2 = temp2 + cols;
			}
			sb.append(" ");
		}
		// int remaining = input.length()%cols;
		System.out.println(sb);
	}
}

