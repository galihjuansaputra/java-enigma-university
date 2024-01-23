public class ViewAllMahasiswa {

    public static void viewAll(Mahasiswa[] mahasiswaList) {

        System.out.println(
                "--------------------------------------\n" +
                "View All Mahasiswa\n" +
                "--------------------------------------\n" );
        for (int i = 0; i < mahasiswaList.length; i++) {
            if (mahasiswaList[i] == null){
                break;
            }
            System.out.println(
                    (i+1)+".\n" +
                    "Nama : " + mahasiswaList[i].getName() + "\n" +
                    "Umur :" + mahasiswaList[i].getAge() + "\n" +
                    "Jurusan : " + mahasiswaList[i].getMajor());
        }

        if (mahasiswaList[0] == null){
            System.out.println("Tidak ada data... \n");
        }
    }
}
