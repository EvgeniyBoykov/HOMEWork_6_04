package HW_8.entry;

public class Weather_entry {
    private String city;
    private String Localdate;
    private double temperature;

    public Weather_entry(String city, String localdate, double temperature) {
        this.city = city;
        this.Localdate = localdate;
        this.temperature = temperature;
    }
   // public String getCity() {
       // return city;
       //    }
    public void setCity (String city) {
        this.city = city;
            }
    public String getLocaldate() {
        return Localdate;
       }
    public void setLocaldate(String Localdate) {
        this.Localdate = Localdate;
    }
        public double gettemperature () {
            return temperature;
        }
        public void settemperature (double temperature) {
            this.temperature = temperature;
        }

}
