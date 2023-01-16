package Movie;

public class Movie implements Runnable{

        String title;
        String gengre;

    public Movie() {
        this.title = title;
        this.gengre = gengre;
        this.rating = rating;
    }

    int rating;

        void playIt() {
            System.out.println(  " Playing the movie - " + title );

            }
            void title(){


            }
            void gengre(){
                System.out.println(" Playing the " + gengre  );

            }
            void rating(){
                System.out.println("Rating fims is -" + rating );
            }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getGengre() {
        return gengre;
    }

    public void setGengre(String gengre) {
        this.gengre = gengre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", gengre='" + gengre + '\'' +
                ", rating=" + rating +
                '}';
    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

    }
}

