package com.javalec.network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Test {
	public Test() {
		// TODO Auto-generated constructor stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("�ּ��Է� : ");
		String addr = scanner.next();
		String code = null;

		try {
			URL url = new URL(addr);
			URLConnection urlConnection = url.openConnection();
			BufferedReader webData = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			FileWriter fw = new FileWriter("C:\\\\Users\\\\lee\\\\Desktop\\\\��������\\\\file.html", false);

			while ((code = webData.readLine()) != null) {
				fw.write(code);
			}
			System.out.println("����");
			fw.close();
			webData.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
