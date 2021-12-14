import java.util.Scanner;

public class PlantMain2 {
    // private ImageIcon plantIcon;
    private Plant p;
    private Anggrek anggrek;
    private Mawar mawar;
    private Melati melati;
    protected int stok_air;

    public static void main(String[] args) {

        Anggrek p = new Anggrek();
        Mawar m = new Mawar();
        Melati i = new Melati();
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        do {
            System.out.println("PILIH MENU");
            System.out.println("================================");
            System.out.println("1 untuk memberi air");
            System.out.println("2 tanam ulang");
            System.out.println("0 close");
            System.out.println("================================\n");
            inp = sc.nextInt();
            switch (inp) {
                case 1:
                    m.beriAir();
                    m.beriPupuk();
                    break;
                case 2:
                    m.resetStatusTumbuh();
                    break;
            }
            System.out.println("-------------");
            m.displayPlant();
            System.out.println("Status Tanaman " + m.getJenis() + " " + m.getStatusTumbuhText());
            System.out.println("-------------\n\n");

        } while (inp != 0);

    }
}
