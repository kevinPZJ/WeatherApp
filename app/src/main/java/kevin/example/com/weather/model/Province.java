package kevin.example.com.weather.model;

/**
 * Created by kevin on 2016/9/10.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;


    public int getId(){   return id;  }
    public void setId( int id) {    this.id=id;}

    public String getProvinceNanme(){ return provinceName; }
    public void setProvinceNanme(String provinceName ){ this.provinceName=provinceName;}

    public String getProvinceCode(){ return provinceCode;}
    public void  setProvinceCode( String provinceCode){ this.provinceCode=provinceCode;}


}
