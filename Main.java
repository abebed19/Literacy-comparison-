
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class Main {
    
    
   public static void main(String ... args){
       
       
       List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));
        
      
       Comparator<Film> comparator = Comparator.comparing(Film::getReleaseYear)
               .thenComparing(Film::getName);
       Collections.sort(films, comparator);
       
       films.forEach(System.out::println);



       
       
   }
    
}
