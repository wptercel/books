package methodOfProgramming.utils;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class MyFiles {
	public static List<String> getAllFiles(String root){
		List<String> filePaths = new ArrayList<String>();
		searchFiles(filePaths, new File(root));
		
		return filePaths;
	}
	
	private static void searchFiles(List<String> filePaths, File root){
		File[] currentFiles = root.listFiles();
		for(File f : currentFiles){
			if(f.isDirectory()){
				searchFiles(filePaths, f);
			}
			else if(f.isFile() && !f.isHidden()){
				filePaths.add(f.getAbsolutePath());
			}
		}
	}
	
	public static void main(String args[]) throws Exception{
		FileWriter fileWriter = new FileWriter("/Users/peng/allFiles.txt", true);
		fileWriter.write("allFiles.txt");
		List<String> files = MyFiles.getAllFiles("/Volumes/Expansion Drive");
		for(String s : files){
			if(s.endsWith(".jpg") && s.indexOf('$') < 0){
				Files.copy(new File(s).toPath(), new File("/Users/peng/temp/" + s.substring(s.charAt(s.lastIndexOf('/')) + 1, s.length())).toPath());
			}
		}
		fileWriter.close();
	}
}
