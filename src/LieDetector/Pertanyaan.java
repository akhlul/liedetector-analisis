package LieDetector;

/**
 *
 * @author Kahrom
 */
public class Pertanyaan {
    String idpertanyaan;
    String isi_pertanyaan;
    Jawaban jawabanpertanyaan;
    
    Pertanyaan(String i_ip, String i_isp, Jawaban i_jp) {
        idpertanyaan = i_ip;
        isi_pertanyaan = i_isp;
        jawabanpertanyaan = i_jp;
    }
}
