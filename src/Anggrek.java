public class Anggrek extends Plant {
    private String jenis;
    private String jenis_anggrek;

    public Anggrek() {
        super();
        jenis = "Anggrek";
    }

    public void cekKondisiTumbuh() {
        if (getJumlahAir() >= 3 && getJumlahPupuk() >= 2) {
            tumbuh();
        }
    }

    public void tumbuh() {
        if (getStatusTumbuh() < 4) {
            setJumlahAir(getJumlahAir() - 3);
            setJumlahPupuk(getJumlahPupuk() - 2);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
    }

    public String jenisAnggrek() {
        jenis_anggrek = "Bulan";
        return jenis_anggrek;
    }

    public String getImagePath() {
        if (this.statusTumbuh == 4) {
            return "img/anggrek.jpg";
        }
        return super.getImagePath();
    }

    public String getJenis() {
        return jenis;
    }

}