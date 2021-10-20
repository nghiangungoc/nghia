package bai4;

public class sinhvien {
    String masv;
    String tensv;
    int tuoi;
    
    public sinhvien(String masv, String tensv, int tuoi) {
        this.masv = masv;
        this.tensv = tensv;
        this.tuoi = tuoi;
    }
    public String getMasv() {
        return masv;
    }
    public void setMasv(String masv) {
        this.masv = masv;
    }
    public String getTensv() {
        return tensv;
    }
    public void setTensv(String tensv) {
        this.tensv = tensv;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
}
