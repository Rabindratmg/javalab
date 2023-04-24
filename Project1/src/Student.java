public class Student {
    private int rollNo;
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

