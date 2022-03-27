import java.util.*;

public class IterateoverArrayList {
    public static <integer> void main(String args[]) {

        List<String> movies = new ArrayList<>();
        movies.add("radhe shyam");
        movies.add("salar");
        movies.add("adipurush");
        movies.add("projectk");
        movies.add("animal");
//using simple for loop
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }
//using  foreach loop

        for (String movie : movies) {
            System.out.println(movie);
        }

//using forEach loop and lamda
        movies.forEach(movie->{
            System.out.println(movie);
        });


//using iterator()
        Iterator<String> movieIterator=movies.iterator();
        while(movieIterator.hasNext()){
            String movie=movieIterator.next();
            System.out.println(movie);
        }
//using iterator() and foreachRemaining()
        movieIterator=movies.iterator();
        movieIterator.forEachRemaining(movie->{
                System.out.println(movie);
                });
//using listIterator
ListIterator<String> MovieIterator= movies.listIterator();
        while(MovieIterator.hasPrevious()){
            String movie=MovieIterator.next();
            System.out.println(movie);
        }
//iterating even numbers from ArrayList using iterator()

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
     Iterator<Integer> numbersIterator= numbers.iterator();
     while (numbersIterator.hasNext()){
         Integer Num=  numbersIterator.next();
         if(Num %2!=0){
             numbersIterator.remove();

         }
     }
        System.out.println(numbers);//[2,4,8,10,12]


    }
}



