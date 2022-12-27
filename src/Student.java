public class Student {
    String imie, nazwisko, wiek, przedmiot, kwota, telefon;

    public Student(String imie, String nazwisko, String wiek, String przedmiot, String kwota, String telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.przedmiot = przedmiot;
        this.kwota = kwota;
        this.telefon = telefon;
    }
    Student p1 = new Student("Karolina","Myka","18","Angielski","80 zł","2123");
    Student p2 = new Student("Jan","Kowalski","16"," Angielski ","65 zł","2312");
    Student p3 = new Student("Karol","Wielki","15","Matematyka" ,"100 zł","5122");
    Student p4 = new Student("Krzysztof","Fraja","12","Matematyka","50 zł","1387");

    public Student(){}


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getWiek() {
        return wiek;
    }

    public void setWiek(String wiek) {
        this.wiek = wiek;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public String getKwota() {
        return kwota;
    }

    public void setKwota(String kwota) {
        this.kwota = kwota;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setEmail(String telefon) {
        this.telefon = telefon;
    }




}
