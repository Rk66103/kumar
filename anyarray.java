public class anyarray 
{
public static void main(String[] args)
{
int num=6;
int num2=10;
int a[]= new int[5];
int b[]=new int[5];
int c[]= new int[5];

{System.out.println("values in Array A:");
}

for(int i=0; i<4; i++){
a[i]=num;
++num;

System.out.println(a[i]);
}

{System.out.println("values in Array b:");

}
for(int i=0; i<4; i++){
b[i]=num2;
++num2;

System.out.println(b[i]);
}
{

System.out.println("values in array c:");
}
for(int i=0; i<4; i++){
c[i]=a[i]+b[i];
System.out.println(c[i]);
}



}}




