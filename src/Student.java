public class Student {
    String imie, wiek, przedmiot, kwota, telefon, email;

    public Student(String imie, String wiek, String przedmiot, String kwota, String telefon, String email) {
        this.imie = imie;
        this.wiek = wiek;
        this.przedmiot = przedmiot;
        this.kwota = kwota;
        this.telefon = telefon;
        this.email = email;
    }

    public Student() {}

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
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

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
