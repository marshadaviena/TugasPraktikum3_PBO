
package praktikum3;

public KonversiSuhu {
    private int suhuCelcius;

public void setSuhuCelcius(int suhu){
    this.suhuCelcius = suhu;
}
public int getSuhuCelcius(){
return this.suhuCelcius;
}
public int celciusToFahrenheit(){
return (suhuCelcius * 9/5) + 32;
}
public int celciusToReamur(){
return suhuCelcius * 4/5;
}


