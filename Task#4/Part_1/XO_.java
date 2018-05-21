package Part_1;

import java.util.Scanner;

public class XO_ {
	public static void Game() {
		Scanner scan = new Scanner(System.in);
		String place;
		String[][] field = new String[3][3];
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = "[ ]";
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
		int i = 2, quit = 0;
		while ((i < 11) & (quit == 0)) {
			if (i % 2 == 0) {
				System.out.println("x");
			} else {
				System.out.println("y");
			}
			System.out.println("input place");
		

		switch (place = scan.next()) {
		case "1":
			if (field[0][0] == "[ ]") {
				if (i % 2 == 0) {
					field[0][0] = "[x]";
					i++;
					break;
				} else {
					field[0][0] = "[0]";
					i++;
					break;
				}
			} else {
				System.out.println("error");
				break;
			}
		case "2":
			if (field[0][1] == "[ ]") {
				if (i % 2 == 0) {
					field[0][1] = "[x]";
					i++;
					break;
				} else {
					field[0][1] = "[0]";
					i++;
					break;
				}
			} else {
				System.out.println("error");
				break;
			}
		case "3":
			if (field[0][2] == "[ ]") {
				if (i % 2 == 0) {
					field[0][2] = "[x]";
					i++;
					break;
				} else {
					field[0][2] = "[0]";
					i++;
					break;
				}
			} else {
				System.out.println("error");
				break;
			}
		case "4":
			if (field[1][0] == "[ ]") {
				if (i % 2 == 0) {
					field[1][0] = "[x]";
					i++;
					break;
				} else {
					field[1][0] = "[0]";
					i++;
					break;
				}
			} else {
				System.out.println("error");
				break;
			}
		case "5":
			if (field[1][1] == "[ ]") {
				if (i % 2 == 0) {
					field[1][1] = "[x]";
					i++;
					break;
				} else {
					field[1][1] = "[0]";
					i++;
					break;
				}
			} else {
				System.out.println("error");
				break;
			}
		case "6":
			if (field[1][2] == "[ ]") {
				if (i % 2 == 0) {
					field[1][2] = "[x]";
					i++;
					break;
				} else {
					field[1][2] = "[0]";
					i++;
					break;
				}
			} else {
				System.out.println("error");
				break;
			}
		case "7":
			if (field[2][0] == "[ ]") {
				if (i % 2 == 0) {
					field[2][0] = "[x]";
					i++;
					break;
				} else {
					field[2][0] = "[0]";
					i++;
					break;
				}
			} else {
				System.out.println("error");
				break;
			}
		case "8":
			if (field[2][1] == "[ ]") {
				if (i % 2 == 0) {
					field[2][1] = "[x]";
					i++;
					break;
				} else {
					field[2][1] = "[0]";
					i++;
					break;
				}
			} else {
				System.out.println("error");
				break;
			}
		case "9":
			if (field[2][2] == "[ ]") {
				if (i % 2 == 0) {
					field[2][2] = "[x]";
					i++;
					break;
				} else {
					field[2][2] = "[o]";
					i++;
					break;
				}
			} else {
				System.out.println("error");
				break;
			}
		default:
			System.out.println("mistake");
			break;
		}
		for (int p = 0; p < 3; p++) {
			for (int l = 0; l < 3; l++) {
				System.out.print(field[p][l]);
			}
			System.out.println();
			for (int t = 0; t < 3; t++) {
				// Проверка прямых
				if (((field[t][0]) == "[0]" & (field[t][1]) == "[0]" & field[t][2] == "[0]")
						|| ((field[0][t]) == "[0]" & (field[1][t]) == "[0]" & field[2][t] == "[0]")) {
					System.out.print("\nwin  О ");break;
				} else if (((field[t][0]) == "[x]" & (field[t][1]) == "[x]" & field[t][2] == "[x]")
						|| ((field[0][t]) == "[x]" & (field[1][t]) == "[x]" & field[2][t] == "[x]")) {
					System.out.print("\nwin  Х ");
					break;
				}
				// Проверка диагоналей
				if (((field[0][0]) == "[x]" & (field[1][1]) == "[x]" & field[2][2] == "[x]")
						|| ((field[0][2]) == "[x]" & (field[1][1]) == "[x]" & field[2][0] == "[x]")) {
					System.out.print("\nwin  Х ");
					quit++;
				} else if (((field[0][0]) == "[0]" & (field[1][1]) == "[0]" & field[2][2] == "[0]")
						|| ((field[0][2]) == "[0]" & (field[1][1]) == "[0]" & field[2][0] == "[0]")) {
					System.out.print("\nwin  О ");
					quit++;
				}
			}
		}}

	}

	public static void main(String[] args) {
		Game();
	}
}
