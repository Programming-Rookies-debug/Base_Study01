package other;

/**
 * @author Sunpl
 * @description 用户实体类
 * @date 2021/10/13
 */
public class UserInfo {
    public String username;
    public String password;
    public int level;

    public UserInfo() {

    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", level=" + level +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
