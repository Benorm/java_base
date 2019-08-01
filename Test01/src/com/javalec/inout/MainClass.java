package com.javalec.inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		OutputStream os = null;

		try {

			is = new FileInputStream("C:\\Users\\lee\\Desktop\\고전게임\\새 텍스트.txt");
			os = new FileOutputStream("C:\\Users\\lee\\Desktop\\고전게임\\복사된 텍스트.txt");

			//byte[] bs = new byte[5];

			int i = 0;
			
			while ((i = is.read()) != -1) {

				System.out.println((char) i);
				os.write(i);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2.getMessage());
				}
			}
			if (is != null) {
				try {
					os.close();
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2.getMessage());
				}
			}
			System.out.println("완료");
		}
	}

}
