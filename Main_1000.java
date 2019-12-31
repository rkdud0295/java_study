package gayoung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1000 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();

		int a = 0;
		int b = 0;

		StringTokenizer st = new StringTokenizer(word);
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		int sum = a + b;

		System.out.print(sum);
	}
}
