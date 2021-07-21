package com.eomcs.oop.ex00;

public class Exam0100 {
  public static void main(String[] args) {
    test1();
    System.out.println(Test.a);
    test2();
    System.out.println(Test.a);

  }

  static void test1() {
    // 스태틱 변수 사용
    // => 최초로 스태틱 멤버(변수,메서드)를 사용하는 시점에 클래스가 로딩된다.
    // => 클래스가 로딩된 후 즉시 자동으로 스태틱변수가 Method Area영역에 생성
    //=>클래스가 언로드 될 때 스태틱 변수가 제거된다.
    //=>클래스가 언로드 될때는 jvm이 종료할 때다.
    Test.a = 100;

  }

  static void test2() {
    Test.a = 200;

  }

}
