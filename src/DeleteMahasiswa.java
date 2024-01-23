public class DeleteMahasiswa {

    public static void delete(Mahasiswa[] mahasiswaList) {
        for (int i = mahasiswaList.length - 1; i >= 0; i--) {
            if (mahasiswaList[i] != null) {
                mahasiswaList[i] = null;
                break;
            }
        }
        System.out.println("Data berhasil dihapus!");
    }
}
