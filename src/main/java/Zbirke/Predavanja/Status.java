package Zbirke.Predavanja;

public enum Status {
    USPJEH("USPJEH",1),
    GRESKA("FAIL",2);

    private String opis;
    private Integer kod;

    Status(String opis,Integer kod){
        this.opis=opis;
        this.kod = kod;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Integer getKod() {
        return kod;
    }

    public void setKod(Integer kod) {
        this.kod = kod;
    }
}
