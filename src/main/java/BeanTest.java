import java.io.Serializable;
import java.util.ArrayList;

public class BeanTest {

    public class Album implements Serializable{
        private Integer id;
        private String artist;
        private String name;
        private long release_date;
        private double sales;
        private String genre;

        public Album(){};

        public String getName(){
            return this.name;
        }
        public void setName(){
            this.name = name;
        }

        public Integer getId(){
            return this.id;
        }
        public void setId(){
            this.id = id;
        }

        public String getArtist(){
            return this.artist;
        }
        public void setArtist(){
            this.artist = artist;
        }

        public long getRelease_date(){
            return this.release_date;
        }
        public void setRelease_date(){
            this.release_date = release_date;
        }

        public double getSales_date(){
            return this.sales;
        }
        public void setSales(){
            this.sales = sales;
        }

        public String getGenre(){
            return this.genre;
        }
        public void setGenre(){
            this.genre=genre;
        }



        public class Quotes implements Serializable{
            private Integer id;
            private String content;
            private String author;

            public Quotes(){};

            public Integer getId(){
                return this.id;
            }
            public void setId(){
                this.id = id;
            }

            public String getAuthor(){
                return this.author;
            }
            public void setAuthor(){
                this.author = author;
            }

            public String getContent() {
                return this.content;
            }
            public void setContent(){
                this.content = content;
            }
        }




        public class Author implements Serializable{
            private String author;
            private String firstName;
            private String lastName;

            public Author(){}

            public String getAuthor(){
                return this.author;
            }
            public void setAuthor(){
                this.author = author;
            }

            public String getFirstName(){
                return this.firstName;
            }
            public void setFirstName(){
                this.firstName= firstName;
            }

            public String getLastName(){
                return this.lastName;
            }
            public void setLastName(){
                this.lastName=lastName;
            }
        }



    }

    public static void main(String[] args) {

    }
}
