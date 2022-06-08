package HomeworkExceptions;

public class Car {

    private String name;
    private String color;
    private int releaseYear;
    private int horsePower;
    private boolean isItUsed;

    public Car() {
    }



    public Car(String color, int releaseYear, int horsePower, boolean isItUsed) {
        this.name = "N/A";
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.isItUsed = isItUsed;
    }

    public Car(String name, String color, int horsePower, boolean isItUsed) {
        this.name = name;
        this.color = color;
        this.releaseYear =-1;
        this.horsePower = horsePower;
        this.isItUsed = isItUsed;
    }

    public Car(String name, String color, int releaseYear, int horsePower, boolean isItUsed) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.isItUsed = isItUsed;
    }

    public Car(String name, String color, int releaseYear, int horsePower) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.isItUsed = false;
    }

    public Car(String name, String color, boolean isItUsed) {
        this.name = name;
        this.color = color;
        this.releaseYear=-1;
        this.horsePower=-1;
        this.isItUsed = isItUsed;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isItUsed() {
        return isItUsed;
    }

    public void setItUsed(boolean itUsed) {
        isItUsed = itUsed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", releaseYear=" + releaseYear +
                ", horsePower=" + horsePower +
                ", isItUsed=" + isItUsed +
                '}';
    }
}




