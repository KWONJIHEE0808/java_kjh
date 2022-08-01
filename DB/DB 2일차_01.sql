create database green;
-- grren이라는 데이터베이스를 생성
-- 여러번 실행하면 두번째부터 에러 발생(이미 만들었기때문에)

create database if not exists green;
-- green이라는 데이터베이스가 없으면 데이터 베이스를 생성
-- 여러번 실행해도 에러가 발생하지 않음

drop database green;
-- green 데이터 베이스를 제거
-- 여러번 실행하면 두번째부터 에러 발생(이미 삭제해서 없기떄문에)

drop database if exists green;
-- green이라는 데이터베이스가 있으면 데이터 베이스를 제거
-- 여러번 실행해도 에러가 발생하지 않음