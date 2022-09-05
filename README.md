# BackEnd <br>
#### HealthCare 웹서비스의 백엔드 파트입니다. <br> 
#### 이 페이지에서는 HealthCare 웹 서비스의 백엔드에서 사용한 기술들과 api들을 명시했습니다. <br> 
#### 전체적인 작동 방식이나 시연 영상은 https://github.com/Jungsu-lilly/HealthCare 로 가주시면 감사하겠습니다.
---------------------------------
<br> 

## 개발 기간 및 환경
+ #### 개발 기간: 2022.7.3 ~ 2022.8.20
+ #### LANGAUGE : Java
+ #### Tools : Intelij
+ #### 기술 : SpringBoot & JPA, Docker
---------------------------------
<br> 

# working
### 1. 클라이언트에 rest api 제공. 클라이언트 서버간 통신을 하는 Web App 제작 <br><br>
### 2. 스프링개발의 디자인 패턴을 준수 <br>
+ #### Controller, Service, Repository 계층 분할
+ #### DTO 를 통해 개발의 확장성을 유연하게 함
+ #### exception handler 를 통한 예외처리 <br><br>
### 3. JPA를 통한 데이터베이스 구축 <br>
<br><br>


# 기능
### 유저 회원가입.
### 로그인 & 로그아웃
### 게시판 작성. 해당 게시판에 댓글 작성 기능
### 달력에 원하는  날짜를 클릭해 사용자가 운동을 기록하는 기능
<br>
<br><br>

# 배포 및 실행
### aws ec2, docker <br><br> 
#### http://3.34.217.132:8080/ 로 접속가능합니다.
<br>
위의 홈페이지로 접속 가능하나, ec2가 무료버전(t2.micro) 이므로 성능이 매우약해 서버가 다운될 가능성이 있습니다. <br>
따라서 접속이 불가한 최악의 경우 경우 다음과 같이 실행해주시기 바랍니다. <br><br>

### 도커 데스크탑으로 실행
#### 컴퓨터에 Docker Desktop 이 설치되어 있어야 합니다. 도커 데스크탑을 실행해줍니다.
#### 최초 실행 시
: 터미널을 열어 다음 명령어를 복붙합니다.
> docker run -it --name app -p 8080:8080 matt1235/healthcare_web:0.0.1 bash
<br>
실행되면, localhost:8080으로 접속하면 끝입니다.

---------------------------------

<br><br>

# API 명세서
restful api 명세서는 해당 리포지토리의 wiki 페이지에 있습니다. 위키 페이지를 참고하시기 바랍니다.<br>

https://github.com/Jungsu-lilly/HeathCare_BE/wiki/API-%EB%AA%85%EC%84%B8%EC%84%9C

<br>

<br><br>
## ERD Diagram
![healthProject (1)](https://user-images.githubusercontent.com/85045177/186178101-06fecd08-eed2-4867-bed4-2d861c06c32d.png) <br>
#### 테이블은 User, Board, Comment, ExerciseLog 총 네 개입니다.
