package ua.lviv.lgs;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Monthes[] mas = Monthes.values();
		Seasons[] mas2 = Seasons.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			Monthes.menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("������ ����� �����");
				sc = new Scanner(System.in);
				String Monthes = sc.next().toUpperCase();

				boolean flag = false;

				for (Monthes m : mas) {
					if (m.name().equals(Monthes)) {
						System.out.println("̳���� ����");
						flag = true;
					}
				}

				if (!flag) {
					System.out.println("̳���� �� ����");
				}
				break;
			}
			case "2": {
				System.out.println("������ ����� ���� ����");
				sc = new Scanner(System.in);
				String Monthes2 = sc.next().toUpperCase();

				boolean flag2 = false;

				for (Monthes m : mas) {
					if (m.getSeasons().name().equals(Monthes2)) {
						flag2 = true;
					}

				}
				if (flag2) {
					for (Monthes m : mas) {
						if (m.getSeasons().toString().equalsIgnoreCase(Monthes2)) {
							System.out.println("���� � ���� ���� �: " + m);
						}
					}
				}
				if (!flag2) {
					System.out.println("���� ���� �� ����");
				}

			}
				break;
			case "3": {
				System.out.println("������ ������� ��� (28,30,31)");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag2 = false;

				for (Monthes m : mas) {
					if (m.getDays() == days) {
						System.out.println("���� ���� ������� ��� �����: " + m.name());
						flag2 = true;
					}

				}

				if (!flag2) {
					System.out.println("���� ����� � ����� ������� ���");

				}
			}
				break;
			case "4": {
				System.out.println("������ ������� ��� (28,30,31)");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag2 = false;

				for (Monthes m : mas) {
					if (m.getDays() < days) {
						System.out.println("����� ������� ��� ��: " + m.name());
						flag2 = true;
					}

				}

				if (!flag2) {
					System.out.println("���� ����� � ������ ������� ���");

				}
			}
				break;
			case "5": {
				System.out.println("������ ������� ��� (28,30,31)");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag2 = false;

				for (Monthes m : mas) {
					if (m.getDays() > days) {
						System.out.println("������ ������� ��� ��: " + m.name());
						flag2 = true;
					}

				}

				if (!flag2) {
					System.out.println("���� ����� � ������ ������� ���");

				}
			}

				break;

			case "6": {
				System.out.println("������ ����� ���� ����");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag2 = true;

				if (flag2) {
					Seasons s = Seasons.valueOf(seasons);
					int ordinal = s.ordinal();

					if (ordinal == mas2.length - 1) {
						ordinal = 0;
						System.out.println("�������� ���� ����: " + mas2[ordinal]);
					} else {
						System.out.println("�������� ���� ����: " + mas2[ordinal + 1]);
					}
				}
				if (!flag2) {
					System.out.println("���� ���� �� ����");
				}
				break;

			}

			case "7": {
				System.out.println("������ ����� ���� ����");
				sc = new Scanner(System.in);
				String seasons = sc.next().toUpperCase();

				boolean flag2 = true;

				if (flag2) {
					Seasons s = Seasons.valueOf(seasons);
					int ordinal = s.ordinal();

					if (ordinal == 0) {
						ordinal = mas2.length - 1;
						System.out.println("��������� ���� ����: " + mas2[ordinal]);
					} else {
						System.out.println("��������� ���� ����: " + mas2[ordinal - 1]);
					}
				}
				if (!flag2) {
					System.out.println("���� ���� �� ����");
				}
				break;

			}
			case "8": {
				System.out.println("����� ������� ��� �����: ");
				sc = new Scanner(System.in);

				for (Monthes m : mas) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m.name());

					}

				}
				break;
			}
			case "9": {
				System.out.println("������� ������� ��� �����: ");
				sc = new Scanner(System.in);

				for (Monthes m : mas) {
					if (m.getDays() % 2 != 0) {
						System.out.println(m.name());
					}

				}
				break;
			}
			case "10": {
				System.out.println("������ ����� �����");
				sc = new Scanner(System.in);
				String Monthes2 = sc.next().toUpperCase();

				boolean flag = false;

				for (Monthes m : mas) {
					if (m.name().equals(Monthes2)) {
						flag = true;

					}
				}
				if (flag) {
					for (Monthes m : mas) {
						if (m.name().equals(Monthes2)) {
							if (m.getDays() % 2 == 0) {
								System.out.println("̳���� �� ����� ������� ���");

							} else {
								System.out.println("̳���� �� ������� ������� ���");
							}
						}
					}

				}

				if (!flag) {
					System.out.println("���� ������ �����, Scanner �����������");
					sc.close();
				}

				break;

			}

			}
		}

	}

}
