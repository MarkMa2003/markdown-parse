
import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.junit.*;

public class MarkdownParseTest {
    List<String> strList;

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testGetlinksOne() throws IOException{
        Path file = Path.of("test-file.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of("https://something.com","some-page.html"));
    }
    @Test
    public void testGetlinksTwo() throws IOException{
        Path file = Path.of("test2-file.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of());
    }
    @Test
    public void testGetlinksThree() throws IOException{
        Path file = Path.of("test3-file.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of("https://hello.com"));
    }
    @Test
    public void testGetlinksFour() throws IOException{
        Path file = Path.of("test4-file.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of());
    }

}