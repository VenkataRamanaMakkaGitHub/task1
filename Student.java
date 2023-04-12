package task;

public class Student {

	private String name;
    private String branch;
    private int marks;

    public Student(String name, String branch, int marks) {
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public int getMarks() {
        return marks;
    }

}
