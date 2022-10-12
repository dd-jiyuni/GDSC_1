package user;

import java.util.ArrayList;

//작성자 클래스 -> user 상속
public class Writer extends User {
    private String number;

    private ArrayList writerInfo;

    //작성자 클래스 안에 이름, 이메일, 전화번호 가지고 있음.
    public Writer(String name, String email, String number) {
        super(name, email);
        this.number = number;

        this.writerInfo = new ArrayList();

        writerInfo.add(name);
        writerInfo.add(email);
        writerInfo.add(number);
    }

    //권한이 true -> 사용자 정보 출력
    public String getWriter(User user) {
//        if(user.isAccessibleToApplications()==true){
//            System.out.println(writerInfo);
//        }throw new IllegalArgumentException("권한이 없어요");

        if (!user.isAccessibleToApplications()) {
            throw new IllegalArgumentException("권한이 없어요");
        }
        return writerInfo.toString();
    }

    //작성자 권한으로는 접근 불가
    @Override
    public boolean isAccessibleToApplications() {
        return false;
    }
}
