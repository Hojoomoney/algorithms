package memberOOP;

public class Member {
    private String username;
    private String password;
    private String confirmPassword;
    private String name;
    private String regNumber;
    private String phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;
// 카우프 지수에서 사용하는 생성자
    public Member(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
// 회원가입에서 사용하는 생성자
    public Member(String username, String password, String confirmPassword,
                  String name, String regNumber, String phoneNumber,
                  String address, String job){
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.name = name;
        this.regNumber = regNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String id) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return this.weight;
    }
    @Override
    public String toString() {
        return "Member{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
