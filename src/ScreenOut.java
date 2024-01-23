import java.util.Arrays;
import java.util.Scanner;

public class ScreenOut {

    public static void mainMenu(Mahasiswa[] mahasiswaList) {

        Scanner scannerMenu = new Scanner(System.in);

        boolean isValid = true;

        do {
            System.out.println(
                    "--------------------------------------\n" +
                    "Main Menu\n" +
                    "--------------------------------------\n" +
                    "1. Add Mahasiswa\n" +
                    "2. Delete Mahasiswa\n" +
                    "3. View All Mahasiswa\n" +
                    "4. Exit");
            System.out.print("Masukan menu yang dipilih : ");

            String inputMenu = scannerMenu.nextLine();
            switch (inputMenu) {
                case "1":
                    for (int i = 0; i < mahasiswaList.length; i++) {
                        if (mahasiswaList[i] == null) {
                            mahasiswaList[i] = AddMahasiswa.add();
                            break;
                        } else if (i == 4){
                            System.out.println("Data sudah penuh!");
                        }
                    }
                    break;

                case "2":
                    DeleteMahasiswa.delete(mahasiswaList);
                    break;
                case "3":
                    ViewAllMahasiswa.viewAll(mahasiswaList);
                    break;
                case "4":
                    isValid = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("[WARNING] Menu tidak tersedia.");
                    System.out.println("Silahkan Coba Lagi...");
            }
        } while (isValid);

    }

}
