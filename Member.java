package StudentManagement;

public class Member {

    private int no;
    private String id;
    private String name;
    private String tel;
    private String address;
    private int ranking;
    private String gender;

    // Constructor
    Member(){};
    Member(int no, String id, String name, String tel, String address, int ranking, String gender)
    {
        this.no=no;
        this.id=id;
        this.name=name;
        this.tel=tel;
        this.address=address;
        this.ranking=ranking;
        this.gender=gender;
    }

    // Getter, Setter
    int getNo(){ return no; }
    String getId(){ return id; }
    String getName(){ return name; }
    String getTel(){ return tel; }
    String getAddress(){ return address; }
    int getRanking(){ return ranking; }
    String getGender(){ return gender; }

    void setNo(int no){ this.no=no; }
    void setId(String id){ this.id=id; }
    void setName(String name){ this.name=name; }
    void setTel(String tel){ this.tel=tel; }
    void setAddress(String address){ this.address=address; }
    void setRanking(int ranking){ this.ranking=ranking; }
    void setGender(String gender){ this.gender=gender; }

    @Override
    public String toString() {
        return "학생정보 [ " +
                "no=" + no +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", ranking=" + ranking +
                ", gender='" + gender + '\'' +
                " ]";
    }
}
