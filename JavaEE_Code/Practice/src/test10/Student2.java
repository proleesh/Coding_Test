package test10;

public class Student2 {
		public enum Sex {MALE, FEMALE}
		public enum City {Seoul, Pusan, Seongnam}
		
		private String name;
		private int Score;
		private Sex sex;
		private City city;
		
		
		public Student2(String name, int score, Sex sex) {
			super();
			this.name = name;
			this.Score = score;
			this.sex = sex;
		}

		public Student2(String name, int score, Sex sex, City city) {
			super();
			this.name = name;
			this.Score = score;
			this.sex = sex;
			this.city = city;
		}
		
		public Sex getSex() {
			return sex;
		}
		public City getCity() {
			return city;
		}
		public String getName() {
			return name;
		}
		public int getScore() {
			return Score;
		}
		

	}
