package home_work_13.original_user.user_data;

public class Geo {
  private String latitude;
  private String length;

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  @Override
  public String toString(){
    return "Geo{"+
        "lat = '" + latitude + '\''+
        ", lng = '" + length +
        '}';
  }

}
