package HW_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DataBaseRepository {


    private static final String DB_PATH = "jdbc:sqlite:geek.db";
    private String inserWeatherQuery = "insert info weather (city, Localdate, temperature) values (?, ?, ?)";
    private String selectWeatherQuery = "select * from weather";

    static {
        try {
            Class.forName("org.sqlite.JDBS");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

  //  public boolean saveWeather(Weather weather) throws SQLException {
  //  try (Connection connection = DriverManager.getConnection(DB_PATH)) {
    //     PreparedStatement insertWeather = connection.prepareStatement(inserWeatherQuery);
    //      insertWeather.setString (1, weather.getCity());
    //      insertWeather.setString(2, weather.getLocaldate());
    //      insertWeather.setString(3, weather.getTemperature());
     //     return insertWeather.execute();

  //   } catch (SQLException throwables) {
  //      throwables.printStackTrace();
  //   }

    //    throw new SQLException("Сохранение не выполнено");
  //  }

   // public void saveWeather(List<Weather> weatherList) {

  //  }

  //  public Weather getSavedToDB() {
   ///     return null;
    }
  //  public List<Weather> getSavedToDB() {
  //      return null;
  //  }

//}
