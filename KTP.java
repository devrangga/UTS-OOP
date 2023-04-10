import java.lang.reflect.Array;
import java.util.Arrays;

public class KTP {
//    attribute
    String nama;
    String telefon ;
    String [] tgl_Lhr = new String[3];
//    constructor
    public KTP(String nama){
        this.nama = nama;
        this.telefon = "088888888888";
        this.tgl_Lhr[0] = "31";
        this.tgl_Lhr[1] = "12";
        this.tgl_Lhr[2] = "2012";
    }
//    methods

    public void setTgl_lhr(String[] tgl_LhrNew) {
        if (tgl_LhrNew[1] == "2"){
            if (Integer.parseInt(tgl_LhrNew[0]) > 28 ) {
                System.out.println("Tanggal Lahir tidak valid");
            }
        }
        else if (Integer.parseInt(tgl_LhrNew[2]) <1900) {
            System.out.println("Tanggal Lahir tidak valid");
        }
        else {
        tgl_Lhr[0] = tgl_LhrNew[0];
        tgl_Lhr[1] = tgl_LhrNew[1];
        tgl_Lhr[2] = tgl_LhrNew[2];
            System.out.println("Pergantian Tanggal Lahir berhasil!");
        }
    }
    public void setTelefon(String Telefon){
        if (Telefon.length() < 12 && Telefon.length() > 13){
            System.out.println("Nomor Telepon tidak valid");
        }
        else {
            if (Telefon.indexOf("0") != 0){
                System.out.println("Nomor Telepon tidak valid");
            }
            else {
                this.telefon = Telefon;
                System.out.println("Pergantian No Telepon Berhasil");
            }
        }
    }

    @Override
    public String toString() {
        return "KTP{" +
                "nama='" + nama + '\'' +
                ", telefon='" + telefon + '\'' +
                ", tgl_Lhr=" + Arrays.toString(tgl_Lhr).concat("-") +
                '}';
    }
}
