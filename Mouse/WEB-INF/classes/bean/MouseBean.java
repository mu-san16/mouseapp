package bean;

import java.io.Serializable;

public class MouseBean implements Serializable{
    // この部分を変更してください
    private String gene_name;
    private String gene_birth;
    private String gene_sex;
    private String msg;

    public void setGeneName(String gene_name){
        this.gene_name = gene_name;
    }

    public void setGeneBirth(String gene_birth){
        this.gene_birth = gene_birth;
    }

    public String getGeneName(){
        return gene_name;
    }

    // この部分を変更してください
}