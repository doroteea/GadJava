package lab2.ch2;

public class Film {



    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public Actor[] getActorii() {
        return actorii;
    }

    public void setActorii(Actor[] actorii) {
        this.actorii = actorii;
    }

    public Film(Integer anAparitie, String nume, Actor[] actorii) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actorii = actorii;
    }

    private Integer anAparitie;
    private String nume;
    private Actor[] actorii;



}
