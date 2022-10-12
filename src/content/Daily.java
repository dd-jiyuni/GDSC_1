package content;

import user.User;

import java.util.ArrayList;

//오늘의 일기 (기분, 날짜, 내용)
public class Daily {

    private String date;

    private String contents;

    private Mood mood;

    private Schedul schedul;

    private ArrayList dailyList;

    public Daily(String contents, String date, Mood mood, Schedul schedul) {
        this.contents = contents;
        this.date = date;
        this.mood = mood;
        this.schedul = schedul;

        this.dailyList = new ArrayList();
        dailyList.add(contents);
        dailyList.add(date);
        dailyList.add(mood);
        dailyList.add(schedul);

    }

    public String getContents() {
            return contents;
        }
    public Mood getMood() {
        return mood;
    }
    public Schedul getSchedule() {
        return schedul;
    }
    public String getDailyList(User user) {

        //접근 권한이 없는 사람은
        if (!user.isAccessibleToApplications()) {
            throw new IllegalArgumentException("권한이 없어요");
        }
        return dailyList.toString();
    }


}
