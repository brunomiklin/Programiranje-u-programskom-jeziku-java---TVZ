package OOP.polimorfizam.Movie;

public class NextMain {
    static void main() {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

//        Object comedy = Movie.getMovie("A","Airplane");
//        Comedy comedyMovie = (Comedy) comedy;
//        comedyMovie.watchComedy();
        //comedy.watchMovie --> s lijeve strane objekt gledamo koje on ima metoda u ovom slučaju Object po defaultu nema watchMovie


        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();


        Object unkownObject = Movie.getMovie("C","Airplane");
        if(unkownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unkownObject;
            c.watchComedy();

        } else if(unkownObject instanceof Adventure){
            ((Adventure)unkownObject).watchMovie();
        }else if(unkownObject instanceof Comedy c){
                 c.watchComedy();
        }
    }
}
