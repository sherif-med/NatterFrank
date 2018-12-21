package sherif.spring.NatterFrank.Model;

public class Company {
    private String CompanyName;
    private String Website;
    private String Size;
    private String Category;
    private boolean Confirmed;
    private String Aderess;
    private float AdrLong;
    private float AdrLat;
    private String[] Responsables;

    public Company() {
    }

    public Company(String companyName, String website, String size, String category, boolean confirmed, String aderess, float adrLong, float adrLat, String[] responsables) {
        CompanyName = companyName;
        Website = website;
        Size = size;
        Category = category;
        Confirmed = confirmed;
        Aderess = aderess;
        AdrLong = adrLong;
        AdrLat = adrLat;
        Responsables = responsables;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public boolean isConfirmed() {
        return Confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        Confirmed = confirmed;
    }

    public String getAderess() {
        return Aderess;
    }

    public void setAderess(String aderess) {
        Aderess = aderess;
    }

    public float getAdrLong() {
        return AdrLong;
    }

    public void setAdrLong(float adrLong) {
        AdrLong = adrLong;
    }

    public float getAdrLat() {
        return AdrLat;
    }

    public void setAdrLat(float adrLat) {
        AdrLat = adrLat;
    }

    public String[] getResponsables() {
        return Responsables;
    }

    public void setResponsables(String[] responsables) {
        Responsables = responsables;
    }


}
