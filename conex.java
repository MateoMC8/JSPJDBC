package modelo;


public class conex {
    private String driver ="com.mysql.cj.jdbc.Driver";  
    private String url="jdbc:mysql://localhost:3308/municipios";
    private String user="root";
    private String pass = "";
    
    public String getDriver(){
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
