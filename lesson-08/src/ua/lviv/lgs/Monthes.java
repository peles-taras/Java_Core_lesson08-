package ua.lviv.lgs;

public enum Monthes {
	JANUARY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER), MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING),
	MAY(31, Seasons.SPRING), JUNE(30, Seasons.SUMMER), JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER),
	SEPTEMBER(30, Seasons.FALL), OCTOBER(31, Seasons.FALL), NOVEMBER(30, Seasons.FALL), DECEMBER(31, Seasons.WINTER);

	private int days;
	Seasons seasons;

	Monthes(int days, Seasons seasons) {
		this.days = days;
		this.seasons = seasons;

	}

	public int getDays() {
		return days;
	}

	public Seasons getSeasons() {
		return seasons;
	}

	static void menu() {
		System.out.println("Ќатисн≥ть 1 Ч ѕерев≥рити чи Ї такий м≥с€ць");
		System.out.println("Ќатисн≥ть 2 Ч ¬ивести вс≥ м≥с€ц≥ з такою ж порою року");
		System.out.println("Ќатисн≥ть 3 Ч ¬ивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 4 Ч ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 5 Ч ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 6 Ч ¬ивести на екран наступну пору року");
		System.out.println("Ќатисн≥ть 7 Ч ¬ивести на екран попередню пору року");
		System.out.println("Ќатисн≥ть 8 Ч ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 9 Ч ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в");
		System.out.println("Ќатисн≥ть 10 Ч ¬ивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в");
	}

}
