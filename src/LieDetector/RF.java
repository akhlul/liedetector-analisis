package LieDetector;

/**
 *
 * @author Kahrom
 */
public class RF { // ReaksiFisiologis
    boolean tekanandarah_naik; 
    boolean detakjantung_naik; 
    boolean lajupernafasan_naik;
    boolean aktifitaskeringat_naik;
    
    RF(boolean td, boolean dj, boolean lp, boolean ak) {
        tekanandarah_naik = td;
        detakjantung_naik = dj;
        lajupernafasan_naik = lp;
        aktifitaskeringat_naik = ak;
    }
    
}
