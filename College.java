package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class College {

	public static void main(String[] args) {

		List<Student> studentsList = new ArrayList<>();
		studentsList.add(new Student("Venkat", "CSE", 85));
		studentsList.add(new Student("Ramana", "ECE", 78));
		studentsList.add(new Student("Harsha", "CSE", 92));
		studentsList.add(new Student("Madhav", "MECH", 76));
		studentsList.add(new Student("Rohith", "CSE", 88));
		studentsList.add(new Student("Venkata Ramana", "ECE", 80));

		Map<String, List<Student>> studentsBranchWise = new HashMap<>();

		studentsList.forEach(student -> {
			if (studentsBranchWise.containsKey(student.getBranch())) {
				studentsBranchWise.get(student.getBranch()).add(student);
			} else {
				List<Student> newStudents = new ArrayList<>();
				newStudents.add(student);
				studentsBranchWise.put(student.getBranch(), newStudents);
			}
		});

		for (String branch : studentsBranchWise.keySet()) {
			List<Student> studentsInBranch = studentsBranchWise.get(branch);

			double totalMarks = 0;
			for (Student student : studentsInBranch) {
				totalMarks += student.getMarks();
			}

			double avgMarks = totalMarks / studentsInBranch.size();

			System.out.println("Branch: " + branch);
			System.out.println("Avg Marks: " + avgMarks);

			System.out.print("Students: ");
			for (Student student : studentsInBranch) {
				System.out.print(student.getName() + " , ");
			}
			System.out.println();
		}

	}
}
