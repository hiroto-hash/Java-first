package info.searchman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
  public static void main(String args[]) throws IOException{

	  BufferedReader br = new BufferedReader(
			  new InputStreamReader(System.in) );
//練習問題3-7
//	  int score = Integer.parseInt(br.readLine());
	  int score = 50;

	  if(score >= 80) {
		  System.out.println("大変よくできました");
	  }else if(score >= 60){
		  System.out.println("よくできました");
	  }else {
		  System.out.println("残念でした");
	  }

	  if(score >= 80) {
		  System.out.println("優");
	  }else if(score >=70 &&  score < 80){
		  System.out.println("良");
	  }else if(score >= 60 && score < 70){
		  System.out.println("可");
	  }else if(score >= 0 && score < 60) {
		  System.out.println("不可");
	  }

//練習問題3-8
	  int intermediate = Integer.parseInt(br.readLine());
	  int end = Integer.parseInt(br.readLine());

	  if(intermediate >= 60 && end >= 60) {
		  System.out.println("合格");
	  }else {
		  System.out.println("不合格");
	  }
	  if(intermediate + end >= 130) {
		  System.out.println("合格");
	  }else {
		  System.out.println("不合格");
	  }
	  if(intermediate + end >= 100 && intermediate >= 60 || end >= 60) {
		  System.out.println("合格");
	  }else {
		  System.out.println("不合格");
	  }

//練習問題3-9
//	  String week = br.readLine();
//	  String time = br.readLine();

	  int day = Integer.parseInt(br.readLine());
	  int time = Integer.parseInt(br.readLine());

	  boolean bopen = true;

	  if(day == 0) {
		  bopen = false;
	  }else if(time == 0 &&(day == 2 || day == 5)) {
		  bopen = false;
	  }else if(time == 1 && day == 6) {
		  bopen = false;
	  }else if(time == 2 && (day == 3 || day == 6)) {
		  bopen = false;
	  }

	  if(bopen) {
		  System.out.println("診療可能");
	  }else {
		  System.out.println("休診");
	  }
//	 練習問題3-10
	  int x = Integer.parseInt(br.readLine());
	  int y = Integer.parseInt(br.readLine());

	  if(x < y && (x % 2) == 0 && (y % 2)== 0) {
		  System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
	  }
	  if(x == y && x < 0) {
		  System.out.println("x と y は等しく、かつ、負の数である。");
	  }
	  if((x <= 10 || x >= 100) && (y >= 10 && y <= 100)) {
		  System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
	  }
	  if(!(x < 0 && y < 0)) {
		  System.out.println("x も y も負の数である、ではない。（ x も y も負の数である、の否定）");
	  }

//　練習問題3-11
	  int month = Integer.parseInt(br.readLine());

	  switch(month)
	  {
	    case 1:
	    	System.out.println("元日");
	    	System.out.println("成人の日");
	    	break;
	    case 2:
	    	System.out.println("建国記念日");
	    	System.out.println("天皇誕生日");
	    	break;
	  }
  }
}
