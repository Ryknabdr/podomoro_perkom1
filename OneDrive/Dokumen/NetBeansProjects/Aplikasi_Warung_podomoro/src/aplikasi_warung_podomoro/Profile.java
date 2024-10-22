package aplikasi_warung_podomoro;

public class Profile {
    private int id_user;
    private String ussername;
    private String password;
    private String nama_user;
    private String level_id;

    public int getId() {
        return id_user;
    }

    public void setId(int id) {
        this.id_user = id;
    }

    public String getFullname() {
        return nama_user;
    }

    public void setFullname(String fullname) {
        this.nama_user = fullname;
    }

    public String getUsername() {
        return ussername;
    }

    public void setUsername(String username) {
        this.ussername = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level_id;
    }

    public void setLevel(String level) {
        this.level_id = level;
    }
    
}
