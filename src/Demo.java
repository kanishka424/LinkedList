import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printCities(placesToVisit);


        placesToVisit.add(1,"Alice Springs");
        printCities(placesToVisit);

        placesToVisit.remove(4);
        printCities(placesToVisit);

        addInOrder("Dutch",placesToVisit);
        printCities(placesToVisit);







    }

    private  static void printCities(LinkedList<String> list){
        Iterator<String> place=list.iterator();//HOW TO USE AN ITERATOR
        while(place.hasNext()){//METHOD TO USE WITH ITERATOR
            System.out.println("Now visiting "+place.next());//METHOD TO USE WITH ITERATOR
        }
        System.out.println("===============================================================================");

    }

    private static boolean addInOrder(String newCity,LinkedList<String> currentCities){
        ListIterator<String> stringListIterator=currentCities.listIterator();// WE USE LISTITERRATOR TO USE Previous()
        while(stringListIterator.hasNext()){
            int compareValue=stringListIterator.next().compareTo(newCity);//not use of next
            if(compareValue==0){
                return false;
            }else if(compareValue>0){
                stringListIterator.previous();//THE reason to use ListIterator over Iterator
                stringListIterator.add(newCity);
                return true;


            }else if(compareValue<0){


                stringListIterator.next();
            }
        }

        stringListIterator.add(newCity);
        return true;

    }
}



//====================================NOTE=============

//LinkedList methods
//        1.add("Darwin");
//        add(1,"Alice Springs");
//        2.remove(4)



//===================ITERATOR=================

// Iterator<String> place=list.iterator() //HOW TO USE AN ITERATOR
//place.hasNext()
//place.next()


//===================LISTITERATOR=================

//we use LISTITERATOR because we want previous()
