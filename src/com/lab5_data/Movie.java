package com.lab5_data;

public class Movie {
    private final long id;
    private String name;
    private Coordinates coordinates;
    private final java.time.LocalDateTime creationDate;
    private Integer oscarsCount;
    private Long goldenPalmCount;
    private Double totalBoxOffice;
    private MpaaRating mpaaRating;
    private Person operator;

    // class constructor
    public Movie(long id, String name, Coordinates coordinates, java.time.LocalDateTime creationDate, Integer oscarsCount,
                 Long goldenPalmCount, Double totalBoxOffice, MpaaRating mpaaRating, Person operator) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.oscarsCount = oscarsCount;
        this.goldenPalmCount = goldenPalmCount;
        this.totalBoxOffice = totalBoxOffice;
        this.mpaaRating = mpaaRating;
        this.operator = operator;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public java.time.LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Integer getOscarsCount() {
        return oscarsCount;
    }

    public void setOscarsCount(Integer oscarsCount) {
        this.oscarsCount = oscarsCount;
    }

    public Long getGoldenPalmCount() {
        return goldenPalmCount;
    }

    public void setGoldenPalmCount(Long goldenPalmCount) {
        this.goldenPalmCount = goldenPalmCount;
    }

    public Double getTotalBoxOffice() {
        return totalBoxOffice;
    }

    public void setTotalBoxOffice(Double totalBoxOffice) {
        this.totalBoxOffice = totalBoxOffice;
    }

    public MpaaRating getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(MpaaRating mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

        public Person getOperator() {
        return operator;
    }

    public void setOperator(Person operator) {
        this.operator = operator;
    }

    public String checkNull (Object check) {
        String res = "";
        if (check == null) {
            return res;
        }
        else {
            return String.valueOf(check);
        }
    }
    @Override
    public String toString() {
        return  "id = " + id + '\n' +
                "name = " + name + '\n' +
                "coordinates = " + "(" + coordinates.getX() + ", " + coordinates.getY() + ")" + '\n' +
                "creationDate = " + creationDate + '\n' +
                "oscarsCount = " + oscarsCount + '\n' +
                "goldenPalmCount = " + goldenPalmCount + '\n' +
                "totalBoxOffice = " + totalBoxOffice + '\n' +
                "mpaaRating = " + mpaaRating + '\n' +
                "name of operator = " + operator.getName() + ". height of operator = " + operator.getHeight() +
                ". nationality of operator = " + operator.getNationality() + '\n';
    }
}