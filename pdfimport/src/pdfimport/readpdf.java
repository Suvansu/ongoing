package pdfimport;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class readpdf {

	public static void main(String[] args) throws IOException { 
		// TODO Auto-generated method stub
		File file = new File("E:\\eclipse\\workspace\\pdfimport\\sample.pdf");
		PDDocument document = PDDocument.load(file);
		PDFTextStripper pdfstripper = new PDFTextStripper();
		String text = pdfstripper.getText(document);
		//System.out.println(text);
		
		String[] words = text.split(" ");
		int count=0;
//		for(int i=0; i<words.length; i++)
//		{
//			if (words[i]!= " ")
//			{
//			char firstChar = words[i].charAt(0);
//			//System.out.print("a");
//			 if (firstChar == 'A' || firstChar == 'E' || firstChar == 'I'
//                     || firstChar == 'O' || firstChar == 'U'
//                     || firstChar == 'a' || firstChar == 'e' || firstChar == 'i'
//                     || firstChar == 'o' || firstChar == 'u')
//				 
//				System.out.println( words[i]);
//				//System.out.println( firstChar);
//				count++;
//			}
		
		for(int i=0; i<words.length; i++)
		{
			if (words[i]!= " ")
			{
				if (words[i].startsWith("A") || words[i].startsWith("E") || words[i].startsWith("I")
	                     || words[i].startsWith("O") || words[i].startsWith("U")
	                     || words[i].startsWith("a") || words[i].startsWith("e") || words[i].startsWith("i")
	                     || words[i].startsWith("o") || words[i].startsWith("u"))
					System.out.println( words[i]);
				count++;
			}
			
		}
		
		System.out.print(count);
	}
}

