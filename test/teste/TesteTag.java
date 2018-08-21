package teste;

import com.github.lucasm21.linksfavoritos.modelo.Tag;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author lucasmggp
 */
public class TesteTag {
    
    /**
     * Teste qualquer.
     */
    @Test
    public void testeAdionarTags() {
        Tag tag1 = new Tag(1, "Música");
        Tag tag2 = new Tag(2, "Artigo");
        Tag tag3 = new Tag(3, "Dica");
        
        List<Tag> tags1 = new ArrayList<>();
        tags1.add(tag3);
        tags1.add(tag2);
        
        List<Tag> tags2 = new ArrayList<>();
        tags2.add(tag2);
        tags2.add(tag1);
        
        List<Tag> tags3 = new ArrayList<>();
        tags3.add(tag3);
        tags3.add(tag1);
        
        tags1.forEach(System.out::println);
        tags2.forEach(System.out::println);
        tags3.forEach(System.out::println);
        
        Assert.assertArrayEquals(
                new Object[]{new Tag(3, "Dica"), new Tag(2, "Artigo")}, 
                tags1.toArray());
    }
}
