package main;

import content.Daily;
import content.Mood;
import content.Schedul;
import user.Manager;
import user.Writer;


public class Main {
    public static void main(String[] args) {

        //관리자 생성
        Manager mg = new Manager("한현수","hanhyunsoo@gmail.com");

        //오늘의 일기 생성
        Daily daily = new Daily("오늘 프로젝트에서 오류가 발생했다. 하지만 오류를 해결했다. 상당히 행복하다ㅎㅎ","2022-10-22", Mood.HAPPY, Schedul.WORK);

        //작성자 생성
        Writer wt = new Writer("이지윤","dlwldbs8015@gmail.com","010-9460-8015");

        //작성자명 출력
        System.out.println("작성자명 : "+ wt.getName());

        //관리자 정보 출력
        System.out.println("관리자명 : " + mg.getName() + ", 이메일 : " + mg.getEmail());

        //관리자 접근 권한 승인 -> 일기, 사용자 정보 출력
        System.out.println("관리자 접근 : " + daily.getDailyList(mg) + wt.getWriter(mg));

        //작성자는 사용자 정보를 볼 수 없음.
        System.out.println("작성자 접근 : " + wt.getWriter(wt));

    }
}
