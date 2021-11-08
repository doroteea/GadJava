package lab2.ch2;

public class Studio {
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }

    private String nume;
    private Film[] filme;
    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }


}
