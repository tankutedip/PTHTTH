import java.net.*;
import java.io.*;

public class SourceViewer2 {
	

public static void main (String[] args) {
	if (args.length > 0) {
		try {
			URL u = new URL("http://iuh.edu.vn");
			URLConnection uc = u. openConnection( ) ;
			InputStream raw = uc.getInputStream( ) ;
			InputStream buffer = new BufferedInputStream(raw) ;
			Reader r = new InputStreamReader (buffer) ;
			int c;
			while ((c = r. read( )) != -1) {
				System.out.print((char) c) ;
				}
		}
		
		catch (MalformedURLException ex) {
			System.err.println(args[0] +" is not parseable URL");
		}
		catch (IOException ex) {
			System.err.println(ex);
		}
	}
}
}