/**
 *
 * @author Kelompok 2
 */
public class Mawar extends Plant {
    private String jenis;
    private String asal_mawar;

    public Mawar() {
        super();
        jenis = "Mawar";
    }

    public void cekKondisiTumbuh() {
        if (getJumlahAir() >= 5 && getJumlahPupuk() >= 3) {
            tumbuh();
        }
    }

    public void tumbuh() {
        if (getStatusTumbuh() < 4) {
            setJumlahAir(getJumlahAir() - 2);
            setJumlahPupuk(getJumlahPupuk() - 3);
            setStatusTumbuh(getStatusTumbuh() + 1);
        }
    }

    public String asalMawar() {
        asal_mawar = "Turki";
        return asal_mawar;
    }

    public String getImagePath() {
        if (this.statusTumbuh == 4) {
            return "img/mawar_turki.jpg";
        }
        return super.getImagePath();
    }

    public String getJenis() {
        return jenis;
    }
}