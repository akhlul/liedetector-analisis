package LieDetector;

/**
 *
 * @author Kahrom
 */
public class LieMachine {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        Analisis A01 = new Analisis("Alat Tes Kebohongan 1", "");
        Analisis A02 = new Analisis("Alat Tes Kebohongan 2", "");
        
        Peserta S01 = new Peserta("pes01", "Sanni");
        Peserta S02 = new Peserta("pes02", "Ridman");
        Peserta S03 = new Peserta("pes03", "Orelo");
        
        A01.addseseorang(S01);
        A01.addseseorang(S02);
        A02.addseseorang(S03);
        
        // reaksi fisiologis ketika berbohong
        RF Ref00 = new RF(true, true, false, false);
        RF Ref01 = new RF(true, true, false, true);
        // reaksi fisiologis ketika jujur
        RF Ref02 = new RF(true, false, false, false);
        RF Ref03 = new RF(false, false, false, false);
        
        Jawaban Ans01 = new Jawaban("01001a", "Saine", Ref01);
        Pertanyaan P01 = new Pertanyaan("01001", "Siapa nama Anda", Ans01);
        
        Jawaban Ans02 = new Jawaban("101002a", "Ridman", Ref02);
        Pertanyaan P02 = new Pertanyaan("101002", "Siapa nama Anda", Ans02);
        
        Jawaban Ans03 = new Jawaban("201001a", "Orelo", Ref03);
        Pertanyaan P03 = new Pertanyaan("201001", "Siapa nama Anda", Ans03);
        
        Jawaban Ans03_2 = new Jawaban("201001a", "Mathilda", Ref00);
        Pertanyaan P03_2 = new Pertanyaan("201001", "Siapa nama Ibu Anda", Ans03_2);
        
        S01.addpertanyaaan(P01);
        S02.addpertanyaaan(P02);
        S03.addpertanyaaan(P03);
        S03.addpertanyaaan(P03_2);
        
        String Kata = "" +
                "Dalam dua buah tes menggunakan alat kebohongan, tiga orang responden "
                + "akan menjadi peserta uji alat kebohongan yaitu sebagai berikut : "
                + "\n - " + S01.namaPeserta 
                + "\n - " + S02.namaPeserta 
                + "\n - " + S03.namaPeserta 
                + "\n\n"
                + "Berikut ini adalah hasil analisa dari percobaan tes kebohongan ini ::\n\n";
     
        System.out.println(Kata);
        OutputAnalisa(A01);
        OutputAnalisa(A02);
//        System.out.println(A02.seseorang.get(0).pertanyaandiajukan.size());
//        System.out.println(A02.seseorang.get(0).pertanyaandiajukan.get(1).isi_pertanyaan);
    }
    
    public static void OutputAnalisa(Analisis AA) {
        StringBuffer x = new StringBuffer();
        x.append(AA.namaanalisis 
                + "\n >> " 
                + AA.ttg_analisis
        );
        for(int i = 0; i < AA.seseorang.size(); i++){
            x.append( "\n   >> " 
//                    + AA.seseorang.get(i).idPeserta 
//                    + "\n   >> " 
                    + AA.seseorang.get(i).namaPeserta
            );
            for(int j = 0; j < AA.seseorang.get(i).pertanyaandiajukan.size(); j++){
                AA.analisajawaban(
                            AA.seseorang.get(i), 
                            AA.seseorang.get(i).pertanyaandiajukan.get(j)
                );
                boolean r = AA.hasil_analisis;
                x.append( "\n    >> ?? " 
//                        + AA.seseorang.get(i).pertanyaandiajukan.get(j).idpertanyaan
//                        + "\n    >> "
                        + AA.seseorang.get(i).pertanyaandiajukan.get(j).isi_pertanyaan
                        + "\n    >> | "
                        + AA.seseorang.get(i).pertanyaandiajukan.get(j).jawabanpertanyaan.isi_jawaban
                        + "\n    >> | "
                        + strKebohongan(r)
                );
            }
        }
        System.out.println(x);
    }
    
    public static String strKebohongan(boolean r){
        String s = "";
        if(r) s = "Pernyataan >> Bohong"; else s = "Pernyataan >> Jujur" ;
        return s;
    }
}
