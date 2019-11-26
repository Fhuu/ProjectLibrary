package Person;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class APerson {

    boolean admin;
    private String name;
    private String id;
    private Date birthday;

//    public void setAdmin(boolean admin) {
//        this.admin = admin;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBirthday(String birthday) {
        this.birthday = parseToCalendar(birthday);
    }

    private Date parseToCalendar(String birthday) {
        try {
            return new SimpleDateFormat("dd/mm/yyyy", Locale.GERMANY).parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.id;
    }

    public String getBirthday() {
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy", Locale.GERMAN);
        return dateFormat.format(birthday);
    }
}
