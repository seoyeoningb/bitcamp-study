package com.eomcs.pms;



public class App {

  public static void main(String[] args) throws Exception {
    java.util.Scanner keyboardScanner = new java.util.Scanner(System.in);
    //키보드
    System.out.println("[회원]");
    System.out.print("번호?");
    String no = keyboardScanner.nextLine();

    System.out.print("이름?");
    String name = keyboardScanner.nextLine();


    System.out.print("이메일?");
    String email = keyboardScanner.nextLine();

    System.out.print("암호?");
    String password = keyboardScanner.nextLine();

    System.out.print("사진?");
    String photo = keyboardScanner.nextLine();

    System.out.print("전화?");
    String tel = keyboardScanner.nextLine();

    java.sql.Date now = new java.sql.Date(System.currentTimeMillis());

    keyboardScanner.close();

    System.out.print("-----------------");

    System.out.println("번호: " + no);
    System.out.println("이름: " + name);
    System.out.println("이메일: " + email);
    System.out.printf("암호: %s\n", password);
    System.out.printf("사진: %s\n", photo);
    System.out.printf("전화: %s\n", tel);
    System.out.printf("가입일: %s\n", now);





  }
}
// system : 소속, out : 콘솔(객체), print() 
// ex99,ex04 소스코드 복습.