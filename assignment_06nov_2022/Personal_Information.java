package assignment_06nov_2022;

public class Personal_Information {
	public static void main(String[] args) {
		System.out.println("This is my personal information");

		Personal_Information.FirstName();
		Personal_Information.LastName();
		Personal_Information.Gender();
		Personal_Information.MobileNO();
		Personal_Information.CurrentCountry();
		Personal_Information Background = new Personal_Information();
		Personal_Information Hobbies = new Personal_Information();
		Background.FatherName();
		Background.CityofBirth();
		Background.CountryofBirth();
		Hobbies.FavoriteSport();
		Hobbies.FavoriteFood();
	}

	public static void FirstName() {
		System.out.println("First Name: Farhan");
	}

	public static void LastName() {
		System.out.println("Last Name: Khalid");
	}

	public static void Gender() {
		System.out.println("Gender: Male");
	}

	public static void MobileNO() {
		System.out.println("Mobile NO: 001-571-236-7346");
	}

	public static void CurrentCountry() {
		System.out.println("Current Country: United States of America");
	}

	public void FatherName() {
		System.out.println("Father Name: Khalid Mehmood");
	}

	public void CityofBirth() {
		System.out.println("City of Birth: Peshawar");
	}

	public void CountryofBirth() {
		System.out.println("Country of Birth: Pakistan");
	}

	public void FavoriteSport() {
		System.out.println("Favorite Sport: Cricket");
	}

	public void FavoriteFood() {
		System.out.println("Favorite Food: Pakistani Food");
	}

}
