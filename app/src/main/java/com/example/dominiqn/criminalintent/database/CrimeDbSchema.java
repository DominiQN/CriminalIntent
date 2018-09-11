package com.example.dominiqn.criminalintent.database;

/*
데이터베이스는 다음 절차로 사용한다.
1. 데이터베이스가 이미 있는지 확인
2. 만일 없다면, 데이터베이스 테이블을 생성하고 초기 데이터 추가
3. 만일 있다면, 데이터베이스를 열고 버전을 확인(SQLite 버전이 아닌, 우리가 지정한 스키마 버전을 의미
                                             예를 들면, 새 열이 추가된 경우 현재 버전에 1을 더한 값을
                                             DB 버전으로 지정
4. 만일 구 버전일 경우 새 버전으로 업그레이드 하는 코드 실행
   (혹은 설치 후 삭제 해도 저장된 DB는 사라짐)

그리고 이를 위해 SQLiteOpenHelper 클래스가 제공됨
 */
public class CrimeDbSchema {


    public static final class CrimeTable {
        public static final String NAME = "crimes";

        // 테이블의 열 정의
        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}
