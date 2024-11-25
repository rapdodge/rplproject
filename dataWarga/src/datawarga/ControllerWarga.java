package datawarga;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerWarga {
    ArrayList<ModelWarga> ArrayData;
    DefaultTableModel tabellist;
    
    public ControllerWarga() {
        ArrayData = new ArrayList<ModelWarga>();
    }
    
    public void InsertData(String id, String nama, String alamat, boolean pindahan) {
        ModelWarga warga = new ModelWarga(id, nama, alamat, pindahan);
        ArrayData.add(e:mhs);
    }
    
    public DefaultTableModel showData() {
        String[] kolom = ("ID", "Nama", "Alamat", "Pindahan");
        Object[] objData = new Object[ArrayData.size()][4];
        int i = 0;
        
        for(ModelMahasiswa n : ArrayData) {
            String[] arrData = {n.GetID(), n.getNama(), 
        }
    }
}