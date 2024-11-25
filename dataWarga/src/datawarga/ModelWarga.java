package datawarga;

public class ModelWarga {
    private String id;
    private String nama;
    private String alamat;
    private boolean pindahan;
    
    public ModelWarga(String id, String nama, String alamat, boolean pindahan) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.pindahan = pindahan;
    }
    
    public String getID() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat (String alamat) {
        this.alamat = alamat;
    }
    public boolean getPindahan() {
        return pindahan;
    }
    public void setPindahan (boolean pindahan) {
        this.pindahan = pindahan;
    }
}