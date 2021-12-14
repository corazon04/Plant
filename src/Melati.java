public class Melati extends Plant {
    private String jenis;
    private String jenis_melati;

    public Melati() {
        super();
        jenis = "Melati";
    }

    public void cekKondisiTumbuh() {
        if (getJumlahAir() >= 4 && getJumlahPupuk() >= 4) {
            tumbuh();
        }
    }

    public void tumbuh() {
        if (getStatusTumbuh() < 4) {
            setJumlahAir(getJumlahAir() - 3);
            setJumlahPupuk(getJumlahPupuk() - 4);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
    }

    public String jenisMelati() {
        jenis_melati = "Polyanthum";
        return jenis_melati;
    }

    public String getImagePath() {
        if (this.statusTumbuh == 4) {
            return "img/melati.jpg";
        }
        return super.getImagePath();
    }

    public String getJenis() {
        return jenis;
    }
}