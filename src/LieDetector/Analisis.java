package LieDetector;

import java.util.LinkedList;

/**
 *
 * @author Kahrom
 */
public class Analisis {
    String namaanalisis;
    String ttg_analisis;
    LinkedList <Peserta> seseorang = new LinkedList();
    boolean hasil_analisis;
    
    Analisis(String i_ia, String i_ta) {
        namaanalisis = i_ia;
        ttg_analisis = i_ta;
    }
    
    void addseseorang (Peserta i_sa) {
        seseorang.add(i_sa);
    }
    
    boolean checkseseorang (Peserta i_sa) {
        return seseorang.contains(i_sa);
    }
    
    void deleteseseorang (Peserta i_sa) {
        seseorang.remove(i_sa);
    }
    
    boolean analisajawaban(Peserta i_sa, Pertanyaan i_pd) {
        if( checkseseorang(i_sa) ){
            if( i_sa.checkpertanyaaan(i_pd) ){
                int t = 0;
                if( i_pd.jawabanpertanyaan.rf.tekanandarah_naik ) t += 1;
                if( i_pd.jawabanpertanyaan.rf.detakjantung_naik) t += 1;
                if( i_pd.jawabanpertanyaan.rf.lajupernafasan_naik) t += 1;
                if( i_pd.jawabanpertanyaan.rf.tekanandarah_naik) t += 1;    
                hasil_analisis = (t >= 3);
                return true;
            }
        }
        return false ;
//        for
//        i_sa.get(i).i_pd.get(j);
    }
}
