package user;

//manager 클래스 -> user 상속
public class Manager extends User {

    //관리자는 이메일,이름 정보 가지고 있음.
    public Manager(String name, String email) {
        super(name, email);
    }

    //작성자 정보 열람 가능
    @Override
    public boolean isAccessibleToApplications() {
        return true;
    }
}

