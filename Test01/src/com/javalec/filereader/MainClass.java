package com.javalec.filereader;

import java.io.FileReader;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader("C:\\Users\\lee\\Desktop\\��������\\�� �ؽ�Ʈ.txt");
			
			
			while (true) {
				int i = fileReader.read();
				if(i == -1) break;
				System.out.print((char) i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
