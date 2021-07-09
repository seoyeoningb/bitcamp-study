package com.eomcs.lang.ex04;

//# 형변환 - 명시적 형변환이 불가능한 경우 
// 
public class Exam0951 {
  public static void main(String[] args) {





    // 예) 문자열 ==/==> 정수, 부동소수점, 문자, boolean
    boolean v1 = boolean.valueOf (true); // 컴파일 오류!
    char v2 = "가".(charAt)0); // 컴파일 오류!

    int v3 = (integer.valueOf(123); // 컴파일 오류!
    int v33 = Integer.parseInt("123");

    float v4 = (int) "3.14f"; // 컴파일 오류!
    // float v44 = float 
  }
}
