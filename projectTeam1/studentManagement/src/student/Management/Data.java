package student.Management;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Data {

	public List<Student> getStudentList() {
		// 학생 리스트 생성
		List<Student> studentList = new ArrayList<Student>();
		// 객체 추가
		studentList.add(new Student("홍길동", "010-1111-1111", "1반", "국어"));
		studentList.add(new Student("홍길동", "010-1111-2222", "1반", "국어"));
		studentList.add(new Student("이순신", "010-2222-2222", "2반", "수학"));
		studentList.add(new Student("유관순1", "010-3333-3333", "1반", "영어"));
		studentList.add(new Student("유관순2", "010-4444-4444", "2반", "수학"));
		studentList.add(new Student("유관순3", "010-5555-5555", "1반", "국어"));
		studentList.add(new Student("유관순4", "010-6666-6666", "1반", "영어"));
		studentList.add(new Student("유관순5", "010-7777-7777", "2반", "국어"));
		studentList.add(new Student("유관순6", "010-8888-8888", "1반", "수학"));
		studentList.add(new Student("유관순7", "010-9999-9999", "1반", "수학"));
		studentList.add(new Student("유관순8", "010-0000-0000", "1반", "수학"));

		return studentList; // 리스트의 주소를 리턴

	}

	public List<Lecture> getLectureList() {
		// 강의 리스트 생성
		List<Lecture> lectureList = new ArrayList<Lecture>();

		// 객체 추가
		lectureList.add(new Lecture("국어", "김민수", 200000));
		lectureList.add(new Lecture("수학", "김지수", 300000));
		lectureList.add(new Lecture("영어", "최수민", 400000));

		return lectureList; // 리스트의 주소를 리턴

	}

	public TreeMap<Student, Score> getScoreMap() {

		TreeMap<Student, Score> scoreMap = new TreeMap<Student, Score>(new StudentComporator());
		// 객체 추가
		scoreMap.put(new Student("홍길동", "010-1111-1111", "1반", "국어"), new Score(80));
		scoreMap.put(new Student("이순신", "010-2222-2222", "2반", "수학"), new Score(70));
		scoreMap.put(new Student("유관순1", "010-3333-3333", "1반", "영어"), new Score(100));
		scoreMap.put(new Student("유관순2", "010-4444-4444", "2반", "수학"), new Score(60));
		scoreMap.put(new Student("유관순3", "010-1111-1111", "1반", "국어"), new Score(70));
		scoreMap.put(new Student("유관순4", "010-5555-5555", "1반", "영어"), new Score(90));
		scoreMap.put(new Student("유관순5", "010-6666-6666", "2반", "국어"), new Score(95));
		scoreMap.put(new Student("유관순6", "010-7777-7777", "1반", "수학"), new Score(87));
		scoreMap.put(new Student("유관순7", "010-8888-8888", "1반", "수학"), new Score(88));
		scoreMap.put(new Student("유관순8", "010-0000-0000", "1반", "수학"), new Score(65));

		return scoreMap; // 리스트의 주소를 리턴

	}

	public TreeMap<Student, AttendanceData> getAttendanceMap() {
		TreeMap<Student, AttendanceData> attendanceMap = new TreeMap<Student, AttendanceData>(new StudentComporator());
		// 객체 추가
		attendanceMap.put(new Student("홍길동", "010-1111-1111", "1반", "국어"), new AttendanceData(0));
		attendanceMap.put(new Student("이순신", "010-2222-2222", "2반", "수학"), new AttendanceData(1));
		attendanceMap.put(new Student("유관순1", "010-3333-3333", "1반", "영어"), new AttendanceData(0));
		attendanceMap.put(new Student("유관순2", "010-4444-4444", "2반", "수학"), new AttendanceData(0));
		attendanceMap.put(new Student("유관순3", "010-1111-1111", "1반", "국어"), new AttendanceData(1));
		attendanceMap.put(new Student("유관순4", "010-5555-5555", "1반", "영어"), new AttendanceData(1));
		attendanceMap.put(new Student("유관순5", "010-6666-6666", "2반", "국어"), new AttendanceData(1));
		attendanceMap.put(new Student("유관순6", "010-7777-7777", "1반", "수학"), new AttendanceData(1));
		attendanceMap.put(new Student("유관순7", "010-8888-8888", "1반", "수학"), new AttendanceData(1));
		attendanceMap.put(new Student("유관순8", "010-0000-0000", "1반", "수학"), new AttendanceData(1));

		return attendanceMap; // 리스트의 주소를 리턴
	}
}
