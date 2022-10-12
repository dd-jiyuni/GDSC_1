package user;

//사용자정보 ( 이름, 이메일 )
public abstract class User {
    private String name; //작성자 이름

    private String email; //작성자 이메일

    //추상메소드 (작성자 정보를 볼 수 있는 권한 부여)
    public abstract boolean isAccessibleToApplications();

    //빈 이름이 출력되지 않게 검사
    public User(String name, String email) {
        if(name == null || name.length() < 1) {
            throw new IllegalArgumentException("이름을 입력해주세요.");
        }
        this.email = email;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}
