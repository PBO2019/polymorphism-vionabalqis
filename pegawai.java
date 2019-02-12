public class pegawai {
    protected int tarif;

    public static void main (String[]args){
        supervisor x = new supervisor();
        staff y = new staff();
        gaji z = new gaji();

        z.hitungangaji(x.tarif);
        z.hitungangaji(y.tarif);
    }
}
