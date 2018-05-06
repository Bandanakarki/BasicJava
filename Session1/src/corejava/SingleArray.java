package corejava;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Rainbow []=new String[7];
Rainbow[0]="red";
Rainbow[1]="orange";
Rainbow[2]="yellow";
Rainbow[3]="blue";
Rainbow[4]="purpule";
Rainbow[5]="violet";
Rainbow[6]="green";
//System.out.println(Rainbow[5]);

//adding for loop because we will be writing everystep one by one and it will be too lengthy and confusing

	for (int x=0;x<Rainbow.length;x+=1)
	{
		
		System.out.println(Rainbow[x]);
	
	}
		//cW make a list if 10 high income cities of texas.qn.2. make a list of next week's temprature in dallas (use integer array)

	String Texas []=new String[10];
	Texas[0]="Plano";
	Texas[1]="Frisco";
	Texas[2]="Allen";
	Texas[3]="Irving";
	Texas[4]="Fortworth";
	Texas[5]="Arlington";
	Texas[6]="Mckinney";
    Texas[7]="Dallas";
	Texas[8]="Waco";
	Texas[9]="Richardson";
	//System.out.println(Texas[1]);
	//adding for loop
	
	for (int x=0;x<Texas.length;x+=1)
	{
		System.out.println(Texas[x]);
	}
	
	
	int Temp []=new int[10];
    Temp[0]=96;
	Temp[1]=80;
    Temp[2]=87;
    Temp[3]=93;
	Temp[4]=24;
	Temp[5]=48;
	Temp[6]=98;
    Temp[7]=84;
	Temp[8]=96;
	Temp[9]=40;
	//System.out.println(Temp[1]);
	
	//adding for 
	
	for (int x=0;x<Temp.length;x+=2)
	{
		System.out.println(Temp[x]);
	}
	
	}
	
	
	}
	
	


