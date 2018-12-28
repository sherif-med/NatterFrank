package sherif.spring.NatterFrank.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Document
public class Company {
    @Id
    private ObjectId _id;
    private String companyName;
    private String website;
    private String size;
    private String category;
    private boolean confirmed;
    private String aderess;
    private float adrLong;
    private float adrLat;
    private ObjectId[] responsables;

    public Company() {
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Company(ObjectId _id, String companyName, String website, String size, String category, boolean confirmed, String aderess, float adrLong, float adrLat, ObjectId[] responsables) {
        this._id=_id;
        this.companyName = companyName;
        this.website = website;
        this.size = size;
        this.category = category;
        this.confirmed = confirmed;
        this.aderess = aderess;
        this.adrLong = adrLong;
        this.adrLat = adrLat;
        this.responsables = responsables;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getAderess() {
        return aderess;
    }

    public void setAderess(String aderess) {
        this.aderess = aderess;
    }

    public float getAdrLong() {
        return adrLong;
    }

    public void setAdrLong(float adrLong) {
        this.adrLong = adrLong;
    }

    public float getAdrLat() {
        return adrLat;
    }

    public void setAdrLat(float adrLat) {
        this.adrLat = adrLat;
    }

    public List<String> getResponsables() {
        List<String> hexed = new ArrayList<String>();
        for (ObjectId responsable:responsables) {
            hexed.add(responsable.toHexString());
        }
        return hexed;
    }

    public void setResponsables(ObjectId[] responsables) {
        this.responsables = responsables;
    }
}
