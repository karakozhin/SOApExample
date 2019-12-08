package kz.ivc.entityMongo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stat_bin")
public class StatBin {

    private Long bin;
    private Long statKod;
    private int periodKindListId;
    private int formId;
    private String statusCode;
    private String sourceCode;
    private boolean inCatalog;
    private Long teCode;
    private boolean doZapis;

    public StatBin() {
    }

    public Long getBin() {
        return bin;
    }

    public void setBin(Long bin) {
        this.bin = bin;
    }

    public Long getStatKod() {
        return statKod;
    }

    public void setStatKod(Long statKod) {
        this.statKod = statKod;
    }

    public int getPeriodKindListId() {
        return periodKindListId;
    }

    public void setPeriodKindListId(int periodKindListId) {
        this.periodKindListId = periodKindListId;
    }

    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public boolean isInCatalog() {
        return inCatalog;
    }

    public void setInCatalog(boolean inCatalog) {
        this.inCatalog = inCatalog;
    }

    public Long getTeCode() {
        return teCode;
    }

    public void setTeCode(Long teCode) {
        this.teCode = teCode;
    }

    public boolean isDoZapis() {
        return doZapis;
    }

    public void setDoZapis(boolean doZapis) {
        this.doZapis = doZapis;
    }
}
