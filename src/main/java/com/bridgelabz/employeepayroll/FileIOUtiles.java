package com.bridgelabz.employeepayroll;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIOUtiles {
	//check isExist
	public void isExist(String path) {
		File file = new File(path);
		if(file.exists())
			System.out.println("File Exist");
		else 
			System.out.println("File does not Exist");
	}

	//List of files and Folders
	public void listOfFilesandFolder(String path) {
		File dir = new File(path);
		File [] files=dir.listFiles();
		if (files.length == 0) {
			System.out.println("The directory is empty");
		} else {
			for (File aFile : files) {
				System.out.println(aFile.getName() + " - " + aFile.length());
			}
		}
	} 

	//create folder
	public void createFolder(String path) {
		File myFolder = new File(path);
		if(!myFolder.exists()) {
			myFolder.mkdir();
			System.out.println(path+" Folder created !");
		}
		else
			System.out.println(path+ " Folder already exist !");
	}

	//delete file and folder
	public void delete(String dir) throws IOException {
		File myFolder = new File(dir);
		String pathDir=myFolder.getAbsolutePath();

		Path path= Paths.get(pathDir);
		try {
			Files.delete(path);
			System.out.println(path+"  Deleted successfully !");
		} catch (IOException e) {
			System.out.println(path + " does not exits !");
			e.printStackTrace();
		}
	}

	//create file
	public void createFile(String path) {
		File myFile = new File(path);
		try {
			myFile.createNewFile();
			System.out.println(path+" File created successfully !");
		} catch (IOException e) {
			System.out.println(path + " Unable to create this file");
			e.printStackTrace();
		}
	}

	//write to file
	public void writeTOFile(String path) {
		try {
			FileWriter fileWriter = new FileWriter(path);
			fileWriter.write("This is our first file from this java course");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//read from file
	public void readFromFile(String path) {
		File myFile = new File(path);
		try {
			Scanner sc = new Scanner(myFile);
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}