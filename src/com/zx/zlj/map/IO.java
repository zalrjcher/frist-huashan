package com.zx.zlj.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
	public static void main(String[] args) {
			File file = new File("1.txt");
			InputStream  in = null ;
			OutputStream out = null ;
			
			try {
				in = new FileInputStream(file);
				out = new FileOutputStream(new File("src/2.txt"));
				byte[] b = new byte[1024];
				int a = 0 ;
				
				while((a = in.read(b))!=-1 ) {
					out.write(b,0,b.length);
				}
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			} 
	}
	

