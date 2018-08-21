package com.github.lucasm21.linksfavoritos.modelo;

/**
 *
 * @author lucas-mendes
 */
public class Link {
    
    private int idSite;
    private int estrela;
    private String site;
    private String categoria;
    private String subCategoria;
    private String tag1;
    private String tag2;
    private String tag3;
    private String tag4;
    private String tag5;

    public Link(int idSite, int estrela, String site, String categoria, String subCategoria, String tag1, String tag2, String tag3, String tag4, String tag5) {
        this.idSite = idSite;
        this.estrela = estrela;
        this.site = site;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.tag1 = tag1;
        this.tag2 = tag2;
        this.tag3 = tag3;
        this.tag4 = tag4;
        this.tag5 = tag5;
    }

    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public int getEstrela() {
        return estrela;
    }

    public void setEstrela(int estrela) {
        this.estrela = estrela;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    public String getTag4() {
        return tag4;
    }

    public void setTag4(String tag4) {
        this.tag4 = tag4;
    }

    public String getTag5() {
        return tag5;
    }

    public void setTag5(String tag5) {
        this.tag5 = tag5;
    }
    
}
