package entity;

import java.util.ArrayList;
import  Types.Genre;
public class  Book {


        public String title;
        public double price;
        public int yearOfRelease;
        public  ArrayList<Author> authors;
        public Genre Genretype;



      public   Book ( String title, double price, int yearOfRelease ,  Genre Genretype )
        {

                this.title = title;
                this.price = price;
                this.yearOfRelease=yearOfRelease;
                this.authors = new ArrayList<>(authors);
                this.Genretype = Genretype;
        }




        public String getTitle() {
                return title;
        }

        public double getPrice() {
                return price;
        }

        public int getYearOfRelease() {
                return yearOfRelease;
        }

        public ArrayList<Author> getAuthors() {
                return authors;
        }

    public Genre getGenretype() {
        return Genretype;
    }
}
