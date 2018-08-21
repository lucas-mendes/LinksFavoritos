package com.github.lucasm21.linksfavoritos.gui.cadastro;

/**
 *
 * @author lucas-mendes
 */
public interface CadastroLink {
    
    // Gets e Sets dos atributos do modelo
    public void setIdSite(Long idSite);
    public Long getIdSite();
    
    public void setEstrela(int estrela);
    public int getEstrela();
    
    public void setSite(String site);
    public String getSite();
    
    public void setCategoria(String categoria);
    public String getCategoria();
    
    public void setSubCategoria(String subCategoria);
    public String getSubCategoria();
    
    public void setTag1(String tag1);
    public String getTag1();
    
    public void setTag2(String tag2);
    public String getTag2();
    
    public void setTag3(String tag3);
    public String getTag3();
    
    public void setTag4(String tag4);
    public String getTag4();
    
    public void setTag5(String tag5);
    public String getTag5();
    
    // Tela Principal
    
    
    // Métodos para configurar os Listeners
    public void setInserirActionListener();
    public void setRemoverActionListener();
    public void setAlterarActionListener();
}
