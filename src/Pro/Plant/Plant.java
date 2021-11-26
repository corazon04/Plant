package Pro.Plant;

public class Plant {
    protected int statusTumbuh;
    private int jumlahAir;
    private int jumlahPupuk;

    public Plant() {
        statusTumbuh = 0;
        jumlahAir = 0;
        jumlahPupuk = 0;
    }

    public int getJumlahAir() {
        return jumlahAir;
    }

    public String getJumlahAirShow() {
        return "" + jumlahAir;
    }

    public void setJumlahAir(int n) {
        jumlahAir = n;
    }

    public int getJumlahPupuk() {
        return jumlahPupuk;
    }

    public String getJumlahPupukShow() {
        return "" + jumlahPupuk;
    }

    public void setJumlahPupuk(int n) {
        jumlahPupuk = n;
    }

    public void setStatusTumbuh(int n) {
        statusTumbuh = n;
    }

    public void beriAir() {
        jumlahAir++;
        cekKondisiTumbuh();
    }

    public void cekKondisiTumbuh() {
        if (jumlahAir >= 3 && jumlahPupuk >= 1) {
            tumbuh();
        }
    }

    public void tumbuh() {
        if (statusTumbuh < 4) {
            jumlahAir = jumlahAir - 3;
            jumlahPupuk = jumlahPupuk - 1;
            statusTumbuh++;
        }
    }

    public void displayPlant() {
        System.out.println(getStatusTumbuhText());
        System.out.println("Jumlah Air :" + jumlahAir);
        System.out.println("Jumlah Pupuk" + jumlahPupuk);
    }

    public String getStatusTumbuhText() {
        switch (statusTumbuh) {
        case 0:
            return "Benih";
        case 1:
            return "Tunas";
        case 2:
            return "Tanaman Kecil";
        case 3:
            return "Tanaman Dewasa";
        }
        return "Berbunga";
    }


    public int getStatusTumbuh(){
        return statusTumbuh;
    }
    public void Panen(){
        statusTumbuh = 0;
        jumlahAir = 0;
    }

    // Import gambar
    public String getImagePath(){
        String tImagePath = ""
    }



}
