import java.util.Scanner;

public class AddMahasiswa {

    public static Mahasiswa add() {

        Mahasiswa data = new Mahasiswa(null, null, null);
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "--------------------------------------\n" +
                "Add Mahasiswa\n" +
                "--------------------------------------\n");
        do {
            System.out.print("Nama (3-20 Karakter) :");
            data.setName(scanner.nextLine());
            if (data.getName().length() < 3 || data.getName().length() > 20){
                System.out.println("Nama tidak valid!");
            }
        }while(data.getName().length() < 3 || data.getName().length() > 20);

        do {
            System.out.print("min 17 Tahun) :");
            data.setAge(Integer.parseInt(scanner.nextLine()));
            if (data.getAge() < 17){
                System.out.println("Umur tidak valid!");
            }
        }while(data.getAge() < 17);

        do {
            System.out.print("Jurusan (maks 10 Karakter) :");
            data.setMajor(scanner.nextLine());
            if (data.getMajor().length() > 10){
                System.out.println("Jurusan tidak valid!");
            }
        }while(data.getMajor().length() > 10);

        System.out.println("Data Berhasil dimasukan!");

        return data;

    }
}
