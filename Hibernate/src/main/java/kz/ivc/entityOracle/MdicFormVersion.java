package kz.ivc.entityOracle;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MDIC_FORM_VERSION")
public class MdicFormVersion {

    private int formVersionId;
    private String rTitleForName;
    private String rName;

    public MdicFormVersion() {
    }

    public int getFormVersionId() {
        return formVersionId;
    }

    public void setFormVersionId(int formVersionId) {
        this.formVersionId = formVersionId;
    }

    public String getrTitleForName() {
        return rTitleForName;
    }

    public void setrTitleForName(String rTitleForName) {
        this.rTitleForName = rTitleForName;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }
}
