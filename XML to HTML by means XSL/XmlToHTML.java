
import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XmlToHTML {
	public static void main(String[] args) {
		File stylesheet = new File("src/Students.xsl");
		StreamSource styleSource = new StreamSource(stylesheet);
		try {
			Transformer transformer = TransformerFactory.newInstance().newTransformer(styleSource);
			transformer.transform(new StreamSource("src/Students.xml"), new StreamResult("src/Students.html"));
			System.out.println("Transform complete");
		} catch(TransformerException e) {
			System.err.println("Impossible transform file " + " : " + e);
		}
	}
}
