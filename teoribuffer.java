/**
 * @(#)teoribuffer.java
 *
 *
 * @author 
 * @version 1.00 2019/10/2
 */


import java.io.*;
public class teoribuffer
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		
		char nilaihuruf;
		String nama;
		double nt1,nt2,nt3,nilaimid,nilaifinal;
		double nilairata;
		double nilaiakhir;
	
		System.out.println("Inputan Buffered Reader");
		System.out.print("masukkan nama         : ");
		nama=in.readLine();
		System.out.print("masukkan nilai tugas 1: ");
		nt1=Integer.parseInt(in.readLine());
		System.out.print("masukkan nilai tugas 2: ");
		nt2=Integer.parseInt(in.readLine());
		System.out.print("masukkan nilai tugas 3: ");
		nt3=Integer.parseInt(in.readLine());
		System.out.print("masukkan nilai mid    : ");
		nilaimid=Integer.parseInt(in.readLine());
		System.out.print("masukkan nilai final  : ");
		nilaifinal=Integer.parseInt(in.readLine());
		System.out.println();
		
		nilairata=(nt1+nt2+nt3)/3;
		nilaiakhir=(nilairata*0.3)+(nilaimid*0.3)+(nilaifinal*0.4);
		
		if(nilaiakhir>=80)
		{
			nilaihuruf='A';
		}
		else if(nilaiakhir>=60 && nilaiakhir<=79.9)
		{
			nilaihuruf='B';
		}
		else if(nilaiakhir>=50 && nilaiakhir<=59.9)
		{
			nilaihuruf='C';	
		}
		else if(nilaiakhir>=40 && nilaiakhir<=49.9)
		{
			nilaihuruf='D';
		}
		else
		{
			nilaihuruf='E' ;
		}
		
		System.out.println("nama       : "+nama);
		System.out.println("nilai akhir: "+nilaiakhir);
		System.out.println("nilai huruf: "+nilaihuruf);		
	}
}