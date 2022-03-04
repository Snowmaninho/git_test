public class Feature {
    public int id;

    public Feature(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void test_method() {
        System.out.println("some logic");
    } 

    @java.lang.Override
    public java.lang.String toString() {
        return "Feature{" +
                "id=" + id +
                '}';
    }
}