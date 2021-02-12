package info.searchman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class study04 {
	public static void main(String args[]) throws IOException{
//		練習問題4-1
		for(int i = 0; i <= 10; i++) {
			System.out.println("SPAM");
		}

//		練習問題4-2
		for(int y = 1; y <= 9; y++ ) {
			System.out.println(3 * y);
		}

//		練習問題4-3
//		for( int n = 1, x = 2 ; n <= 8 ; n++, x *= 2 )
//		    System.out.println( "2の" + n + "乗=" + x );

//		練習問題4-4
//		int x = 1;
//
//		for( int i = 2 ; i <= 7 ; i++ )
//		    x *= i;
//
//		System.out.println( x );

//		練習問題4-5
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
//
//		int sum = 0;
//
//		for(int t = 0; t < 10; t++) {
//			int value = Integer.parseInt(br.readLine());
//			sum += value;
//		}
//		System.out.println(( sum / 10));

//		練習問題4-6
//		int wins = 0;
//
//		for( int i = 0 ; i < 10 ; i++ )
//		{
////		    int result = Integer.parseInt( br.readLine() );
//		    int result = 0;
//
//		    if( result == 1 )
//		        wins += 1;
//		}
//
//		System.out.println( "勝ち" + wins + "回、負け" + ( 10 - wins ) + "回" );
//
//		練習問題4-7
		int giants = 0;
		int tigers = 0;

		for( int game = 1 ; game <= 9 ; game++ )
		{
		    System.out.print( game + "回表、巨人の得点は？" );
		    giants += Integer.parseInt( br.readLine() );

		    System.out.print( game + "回裏、阪神の得点は？" );
		    tigers += Integer.parseInt( br.readLine() );
		}

		System.out.println( "巨人：" + giants + "点, 阪神：" + tigers + "点" );

		if( giants > tigers )
		    System.out.println( "巨人の勝ち" );
		else if( giants < tigers )
		    System.out.println( "阪神の勝ち" );
		else
		    System.out.println( "引き分け" );
	 }

}
