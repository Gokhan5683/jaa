class Continent {
    String name;
    Continent(String name) {
        this.name = name;
    }
}
class Country extends Continent {
    String countryName;
    Country(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }
}
class State extends Country {
    String stateName;
    State(String continentName, String countryName, String stateName) {
        super(continentName, countryName);
        this.stateName = stateName;
    }
}
class Place extends State{
		String placeName;
		Place(String continentName, String countryName, String stateName,String placeName) {
        super(continentName, countryName,stateName);
        this.placeName=placeName;
    }
    void display() {
        System.out.println("Place: " + placeName);
        System.out.println("State: " + stateName);
        System.out.println("Country: " + countryName);
        System.out.println("Continent: " + name);
    }
}
class Main {
    public static void main(String[] args) {
        Place s = new Place("North America", "United States", "California","Times Square");
        s.display();
    }
}
