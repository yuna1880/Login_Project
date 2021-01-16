## Login_Project
##### 회원가입, 로그인 콘솔  프로그램 (자바 콘솔 프로젝트)
---


### 💡 프로젝트 목표

- 객체지향 설계 및 구현 연습
- 네트워크 프로그래밍 구현 연습
- DB & Java 연동 연습
- CRUD에 대한 이해와 연습

---

`회원가입` 후 회원정보 출력

`로그인` 성공시 회원정보 화면 출력

![image description](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3040aa62-1747-458a-8c15-11c2d78ce942/__-__.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210116%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210116T163548Z&X-Amz-Expires=86400&X-Amz-Signature=4709eb5cf4c4d0b44358ce61d1f0707b358a4a45d977d990ef313365994a7212&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22__-__.png%22)

### 📊 DB Table

---

```sql
<테이블>
CREATE TABLE MEMBER_T (
ID VARCHAR2(20) PRIMARY KEY,
NAME VARCHAR2(30) NOT NULL,
PASSWORD VARCHAR2(20) NOT NULL,
EMAIL VARCHAR2(50)
);
```

### 📃 Java Class Diagram

---

![image description](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/7ac538ae-b00b-4ba1-be61-a0f8f5a4839e/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210116%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210116T163738Z&X-Amz-Expires=86400&X-Amz-Signature=5cca0f9780f5bca2afd86c0c78c3c6488a18fab42a636ff882856268c296118e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22)

### 📑 리뷰 및 개선방향

---

- 효율적인 전체 구조 및 흐름에 대한 고민
- 아이디, 비밀번호로 로그인 시 로그인 유지 방법 고민.
- 메소드 네이밍에 대한 고민

More about this project 🔽 Please have a look !
---
[👉🏻 click here 👈🏻](https://www.notion.so/Java-Login-Project-23d30d57858c426c9d585b2f089c04b3)
