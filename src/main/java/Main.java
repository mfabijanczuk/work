import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Lista przechowująca uzytkownikow
        ArrayList<User> usersList = getUserListFromFile("uzytkownicy.txt");
        //Sortowanie uzytkownikow
        Collections.sort(usersList);
        //Wyswietlenie ostatniego w liscie (najstarszego)
        System.out.println(usersList.get(usersList.size()-1));

        System.out.println("Liczba użytkowników : "+usersList.size());
    }

    public static ArrayList<User> getUserListFromFile(String filePath){
        ArrayList<User> usersList = new ArrayList<>();
        //Załadowanie pliku i utworzenie z niego obiektu klasu Scanner
        File file = new File(filePath);
        Scanner sc = null;
        try{
            sc = new Scanner(file);
        }catch(FileNotFoundException e){
            System.out.println("Plik nie istnieje!");
            return null;
        }
        //Pętla dopóki Scanner nie jest pusty
        while(sc.hasNext()){
            String actualLine = sc.nextLine();
            String[] attributes = actualLine.split(",");
            if(attributes.length==4){
                usersList.add(new User(attributes[0], attributes[1], attributes[2], attributes[3]));
            }else{
                usersList.add(new User(attributes[0], attributes[1], attributes[2]));
            }
        }
        return usersList;
    }

}
