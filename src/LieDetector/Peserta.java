package LieDetector;

import java.util.LinkedList;

/**
 *
 * @author Kahrom
 */
public class Peserta {
    String idPeserta;
    String namaPeserta;
    LinkedList <Pertanyaan> pertanyaandiajukan = new LinkedList();
    
    Peserta(String i_ip, String i_np) {
        idPeserta = i_ip;
        namaPeserta = i_np;
    }
    
    void addpertanyaaan (Pertanyaan i_pyd) {
        pertanyaandiajukan.add(i_pyd);
    }
    
    boolean checkpertanyaaan (Pertanyaan i_pyd) {
        return pertanyaandiajukan.contains(i_pyd);
    }
    
    void deletepertanyaan (Pertanyaan i_pyd) {
        pertanyaandiajukan.remove(i_pyd);
    }
    
}
