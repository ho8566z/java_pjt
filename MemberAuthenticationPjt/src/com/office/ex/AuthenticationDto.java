package com.office.ex;

/**
 * 인증에 사용할 회원 정보(아이디, 비밀번호, 메일)를 담는 DTO.
 */
public class AuthenticationDto {
   
   private String id;
   private String pw;
   private String mail;
   
   public AuthenticationDto(String id, String pw, String mail) {
      this.id = id;
      this.pw = pw;
      this.mail = mail;
   }

   /** 아이디 값을 돌려준다. */
   public String getId() {
      return id;
   }
   
   /** 아이디 값을 설정한다. */
   public void setId(String id) {
      this.id = id;
   }
   
   /** 비밀번호 값을 돌려준다. */
   public String getPw() {
      return pw;
   }
   
   /** 비밀번호 값을 설정한다. */
   public void setPw(String pw) {
      this.pw = pw;
   }
   
   /** 메일 값을 돌려준다. */
   public String getMail() {
      return mail;
   }
   
   /** 메일 값을 설정한다. */
   public void setMail(String mail) {
      this.mail = mail;
   }

}
