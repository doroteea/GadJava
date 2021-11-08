package lab2;

import lab2.ch2.Actor;
import lab2.ch2.Film;
import lab2.ch2.Premiu;
import lab2.ch2.Studio;

public class Main {

    public static void afiseazaNumeStudioCuMaiMultDeDouaFilme(Studio[] studiouri){
        for(Studio currentStudio : studiouri){
            if(currentStudio.getFilme().length > 2){
                System.out.println("Studio Cu Mai Mult De Doua Filme: " + currentStudio.getNume());
            }
        }
    }


    public static String[] afiseazaActoriCuDouaPremii(Studio[] studiouri, String numeActor) {
        String[] toReturn = new String[10];
        int i=0,j=0;
        for(Studio currentStudio : studiouri){
            for (Film currentFilm : currentStudio.getFilme()){
                for(Actor currentActor : currentFilm.getActorii() )
                    if(currentActor.getNume()==numeActor){
                        toReturn[i] = currentStudio.getNume();
                        i++;
                        break;
                    }
            }

        }
        return toReturn;
    }

    public static void filmeActoriPeste50(Studio[] studioDatabase){
        for(Studio currentStudio : studioDatabase){
            for(Film currentFilm : currentStudio.getFilme()){
                for(Actor currentActor : currentFilm.getActorii()){
                    if(currentActor.getVarsta()>50){
                        System.out.println(currentFilm.getNume());
                        break;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        //ch1
        /*Fighter f1 = new Fighter("f1",100,10);
        Fighter f2 = new Fighter("f2",100,10);
        BoxingMatch boxingMatch = new BoxingMatch(f1,f2);
        System.out.println("Winner: " + boxingMatch.fight() );
        System.out.println("Number of fighters: " + Fighter.getCounter());*/

        //ch2
        Premiu oscar1990 = new Premiu("Oscar",1990);
        Premiu oscar2000 = new Premiu("Oscar",2000);
        Premiu oscar2010 = new Premiu("Oscar",2010);
        Premiu oscar2018 = new Premiu("Oscar",2018);

        Actor actorOscar1990 = new Actor("Actor cu 2 oscaruri", 35 , new Premiu[] {oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("Actor cu 2 oscar din 2000", 55 , new Premiu[] {oscar2010});
        Actor actorOscar2018 = new Actor("Actor cu oscar din 2018", 23 , new Premiu[] {oscar2018});
        Actor actorOscarFaraPremii01 = new Actor("Actor fara oscar 01", 33 , new Premiu[] {});
        Actor actorOscarFaraPremii02 = new Actor("Actor fara oscar 02", 60 , new Premiu[] {});
        Actor actorOscarFaraPremii03 = new Actor("Actor fara oscar 03", 20 , new Premiu[] {});

        Film film1 = new Film (1990,"film cu actori de oscar", new Actor[] {actorOscar1990,actorOscarFaraPremii01});
        Film film2 = new Film(2010 , "Film cu actori fara premii2", new Actor[] {actorOscarFaraPremii01,actorOscarFaraPremii02,actorOscarFaraPremii03});
        Film film3 = new Film (2010,"Film cu actori fara premii3", new Actor[] {actorOscar1990,actorOscarFaraPremii01});
        Film film4 = new Film(2018 , "film cu actori de oscar", new Actor[] {actorOscar2010,actorOscarFaraPremii02,actorOscar2018});
        Film film5 = new Film(2018 , "film cu actori fara premii 5", new Actor[] {actorOscarFaraPremii02,actorOscarFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney",new Film[] {film3,film4,film5});

        Studio[] studioDatabase = new Studio[] {studio1,studio2};
       // afiseazaNumeStudioCuMaiMultDeDouaFilme(studioDatabase);
        String[] result = afiseazaActoriCuDouaPremii(studioDatabase,"Actor cu 2 oscaruri");
        for(String s : result){
            if(s!=null)
            System.out.println(s);
        }

        filmeActoriPeste50(studioDatabase);
    }
}
