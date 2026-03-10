package Zbirke.Vježbe.Enumeracije;

public enum Zupanija {

    ZAGREBACKA("01", "Zagrebačka", 309696, 3078.0),
    KRAPINSKO_ZAGORSKA("049", "Krapinsko-zagorska", 115584, 1229.0),
    SISACKO_MOSLAVACKA("044", "Sisačko-moslavačka", 146475, 4468.0),
    KARLOVACKA("047", "Karlovačka", 128899, 3626.0),
    VARAZDINSKA("042", "Varaždinska", 160264, 1262.0),
    KOPRIVNICKO_KRIZEVACKA("048", "Koprivničko-križevačka", 109822, 1748.0),
    BJELVARSKO_BILOGORSKA("043", "Bjelovarsko-bilogorska", 101879, 2638.0),
    PRIMORSKO_GORANSKA("051", "Primorsko-goranska", 305505, 3590.0),
    LICKO_SENJSKA("053", "Ličko-senjska", 42489, 5353.0),
    VIROVITICKO_PODRAVSKA("033", "Virovitičko-podravska", 70752, 2024.0),
    POZESKO_SLAVONSKA("034", "Požeško-slavonska", 78034, 1815.0),
    BRODSKO_POSAVSKA("035", "Brodsko-posavska", 130267, 2027.0),
    ZADARSKA("023", "Zadarska", 160340, 3646.0),
    OSJECKO_BARANJSKA("031", "Osječko-baranjska", 259481, 4155.0),
    SIBENSKO_KNINSKA("022", "Šibensko-kninska", 98460, 2994.0),
    VUKOVARSKO_SRIJEMSKA("032", "Vukovarsko-srijemska", 144438, 2454.0),
    SPLITSKO_DALMATINSKA("021", "Splitsko-dalmatinska", 463676, 4524.0),
    ISTARSKA("052", "Istarska", 208055, 2813.0),
    DUBROVACKO_NERETVANSKA("020", "Dubrovačko-neretvanska", 115564, 1782.0),
    MEDIMURSKA("040", "Međimurska", 105250, 729.0),
    GRAD_ZAGREB("01", "Grad Zagreb", 779145, 641.0);


    private final String pozivniBroj;
    private final String naziv;
    private final int brojStanovnika;
    private final double povrsina;

    Zupanija(String pozivniBroj, String naziv,
             int brojStanovnika, double povrsina) {
        this.pozivniBroj = pozivniBroj;
        this.naziv = naziv;
        this.brojStanovnika = brojStanovnika;
        this.povrsina = povrsina;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public Double gustocaNaseljenosti(){
        return getBrojStanovnika()/getPovrsina();
    }
}
