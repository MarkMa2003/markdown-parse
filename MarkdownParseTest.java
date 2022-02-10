
import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import javax.swing.filechooser.FileNameExtensionFilter;
//
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
    @Test
    public void testGetlinksExtraTwo() throws IOException{
        Path file = Path.of("test-file2.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of("https://something.com","some-page.html"));
    }
    @Test
    public void testGetlinksExtraThree() throws IOException{
        Path file = Path.of("test-file3.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of());
    }
    @Test
    public void testGetlinksExtraFour() throws IOException{
        Path file = Path.of("test-file4.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of());
    }
    @Test
    public void testGetlinksExtraFive() throws IOException{
        Path file = Path.of("test-file5.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of());
    }
    @Test
    public void testGetlinksExtraSix() throws IOException{
        Path file = Path.of("test-file6.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of("page.com"));
    }
    @Test
    public void testGetlinksExtraSeven() throws IOException{
        Path file = Path.of("test-file7.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of());
    }
    @Test
    public void testGetlinksExtraEight() throws IOException{
        Path file = Path.of("test-file8.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of());
    }

    @Test
    public void testBadLink() throws IOException{
        Path file = Path.of("newtestfile.md");
        String content=Files.readString(file);
        strList=MarkdownParse.getLinks(content);
        assertEquals(strList, List.of());
    }
}