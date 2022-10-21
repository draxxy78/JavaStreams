
public class CityFind
{
	int population ;
    String continent;
    String capital;
    int medalNumbers;

    public CityFind(int population, String continent, String country,String capital, int medalNumbers) {
        this.population = population;
        this.continent = continent;
        this.country = country;
        this.capital = capital;
        this.medalNumbers = medalNumbers;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public  void getCountry()
    {
        return country;
    }

    public  void setCountry()
    {
        thhis.country = country;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getMedalNumbers() {
        return medalNumbers;
    }

    public void setMedalNumbers(int medalNumbers) {
        this.medalNumbers = medalNumbers;
    }

    public static void main(String[] args) {
        CityFind cf = new CityFind(23400,"Asia","India","Delhi",23);
        CityFind cf = new CityFind(16400,"Europe","Germany","Frankfurt",37);
        CityFind cf = new CityFind(33450,"Asia","China","Beijing",16)
    }

}

