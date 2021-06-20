import java.util.ArrayList;
class Course<TeacherName> {
    private String CourseName;
    Teacher t=new Teacher();
    ArrayList<Student> s=new ArrayList<>();

    public Course(String courseName, Teacher t, ArrayList<Student> s) {
        CourseName = courseName;
        this.t = t;
        this.s = s;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }

    public ArrayList<Student> getS() {
        return s;
    }

    public void setS(ArrayList<Student> s) {
        this.s = s;
    }
    public void show(Teacher name,ArrayList<Student> s){
        System.out.println("课程名称："+CourseName);
        System.out.println("授课老师："+name.getName());
        for(int i=0;i<s.size();i++){
            if(s.get(i).getAb().equals("Today is not present")){
                System.out.println("旷课："+s.get(i).getName());
            }else{
                System.out.println("上课："+s.get(i).getName());
            }
        }


    }
}
