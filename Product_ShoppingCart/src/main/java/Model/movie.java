package Model;

public class movie {
    private int movieId;
    private String name;
    private String type;
    private String language;
    private String duration;
    private String director;
    private String cast;
    private String description;
    private Double price;

    public movie(int movieId, String name, String type, String language, String duration, String director, String cast, String description,double price) {
        this.movieId = movieId;
        this.name = name;
        this.type = type;
        this.language = language;
        this.duration = duration;
        this.director = director;
        this.cast = cast;
        this.description = description;
        this.price= price;
    }

    public movie() {
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
