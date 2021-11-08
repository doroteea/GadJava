package lab2.ch2;

public class Premiu {
    public Premiu(String nume, Integer an) {
        this.nume = nume;
        this.an = an;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    private String nume;
    private  Integer an;

}
