import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import javax.swing.DefaultListModel;

public class FileWriter {

	private File file;
	private FileOutputStream fs;
	private OutputStreamWriter osw;
	private BufferedWriter bw;
	private DefaultListModel list;
	
	public FileWriter(String name, DefaultListModel l)
	{
		   try {
			    list = l;
			    String filename = name.replaceAll(" ", "");
	            //Whatever the file path is.
	            file = new File(filename + ".txt");
	            fs = new FileOutputStream(file);
	            osw = new OutputStreamWriter(fs);    
	            bw = new BufferedWriter(osw);
	            for(int i = 0; i < l.size(); i++)
	            {
	                bw.write("" + l.getElementAt(i));
	                bw.newLine();
	            }
	            bw.close();
	        } catch (IOException e) {
	            System.err.println("Problem writing to the file.");
	        }
	}
}
