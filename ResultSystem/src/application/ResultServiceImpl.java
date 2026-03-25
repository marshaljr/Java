package application;

public class ResultServiceImpl implements ResultService {
	public void calculate(Student s) {
		// compute total and average
		s.total = s.pop + s.cn + s.db;
		s.average = s.total / 3;

		// determine pass/fail based on individual marks
		if (s.pop >= 40 && s.cn >= 40 && s.db >= 40) {
			s.result = "PASS";
		} else {
			s.result = "FAIL";
		}
	}
}