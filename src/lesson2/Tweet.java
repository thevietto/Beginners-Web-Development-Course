package lesson2;

import java.util.Date;

/**
 * Created by root on 14.04.16.
 */
public class Tweet {

    private static int count = 0;

    private int id;
    private String message;
    private Date createdAt;

    public Tweet() {
        setId(++count);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
