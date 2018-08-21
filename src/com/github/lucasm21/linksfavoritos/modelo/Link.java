package com.github.lucasm21.linksfavoritos.modelo;

import java.util.List;

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
    private List<Tag> tags;

    public Link(int idSite, int estrela, String site, String categoria, String subCategoria, List<Tag> tags) {
        this.idSite = idSite;
        this.estrela = estrela;
        this.site = site;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.tags = tags;
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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}
