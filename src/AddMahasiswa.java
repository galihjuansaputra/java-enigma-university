import java.util.Scanner;

public class AddMahasiswa {

    public static Mahasiswa add() {

        Mahasiswa data = new Mahasiswa(null, null, null);
        Scanner scanner = new Scanner(System.in);


        System.out.println(
                "--------------------------------------\n" +
                "Add Mahasiswa\n" +
                "--------------------------------------\n");

        System.out.print("Nama (3-20 Karakter) :");
        data.setName(scanner.nextLine());
        System.out.print("min 17 Tahun) :");
        data.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.print("Jurusan (maks 10 Karakter) :");
        data.setMajor(scanner.nextLine());

        System.out.println("Data Berhasil dimasukan!");

        return data;

    }
}
