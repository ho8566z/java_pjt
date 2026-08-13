package com.office.ex;

public class AuthenticationDto {
   
   private String id;
   private String pw;
   private String mail;
   
   public AuthenticationDto(String id, String pw, String mail) {
	this.id = id;
	this.pw = pw;
	this.mail = mail;
}

   public String getId() {
      return id;
   }
   
   public void setId(String id) {
      this.id = id;
   }
   
   public String getPw() {
      return pw;
   }
   
   public void setPw(String pw) {
      this.pw = pw;
   }
   
   public String getMail() {
      return mail;
   }
   
   public void setMail(String mail) {
      this.mail = mail;
   }

}
