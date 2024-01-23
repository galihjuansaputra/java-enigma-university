public class DeleteMahasiswa {

    public static void delete(Mahasiswa[] mahasiswaList) {
        for (int i = mahasiswaList.length - 1; i >= 0; i--) {
            if (mahasiswaList[i] != null) {
                mahasiswaList[i] = null;
                System.out.println("Data terakhir berhasil dihapus!");
                break;
            }
        }
        if (mahasiswaList[0] == null){
            System.out.println("Data Kosong.");
        }
    }
}
