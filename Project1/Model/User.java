package Project1.Model;

public abstract class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
     this.username=username;
     this.password=password;
     this.role=role;
    }

    public boolean checkPassword(String password){
        if(this.password.equals(password)){
            return true;
        }
        return false;
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
    public String getRole() {
        return role;
    }
}
